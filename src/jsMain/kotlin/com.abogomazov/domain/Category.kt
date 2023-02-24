package com.abogomazov.domain

import com.abogomazov.property.FeatureFlags
import com.abogomazov.property.readProperty

enum class Category {
    ROOT,
    WHOAMI,
    CV,
    PORTFOLIO,
    BLOG;

    companion object {
        fun from(uri: Uri) =
            try {
                // fixme intentional inconsistency: there is no IllegalStateException with disabled features
                Category.valueOf(uri.toEnumCompatibleString())
            } catch (e: IllegalStateException) {
                ROOT
            }

        fun categories(): Set<Category> {
            val result = mutableSetOf<Category>()
            val featureFlags = readProperty(FeatureFlags.serializer(), js("require('./feature-flags.json')") as Any)

            result += ROOT
            if (featureFlags.isAboutMeEnabled) result += WHOAMI
            if (featureFlags.isCvEnabled) result += CV
            if (featureFlags.isPortfolioEnabled) result += PORTFOLIO
            if (featureFlags.isBlogEnabled) result += BLOG

            return result
        }
    }

    fun lowercase() = name.lowercase()
    fun hash() = Uri.from(name).hashed()
    fun path() = Uri.from(name).toString()
}
