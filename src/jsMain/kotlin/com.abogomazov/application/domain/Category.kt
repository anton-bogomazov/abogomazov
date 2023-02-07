package com.abogomazov.application.domain

import com.abogomazov.property.PropertyContext

enum class Category {
    ROOT,
    ABOUT_ME,
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

            if (PropertyContext.featureFlags.isRootEnabled) result += ROOT
            if (PropertyContext.featureFlags.isAboutMeEnabled) result += ABOUT_ME
            if (PropertyContext.featureFlags.isCvEnabled) result += CV
            if (PropertyContext.featureFlags.isPortfolioEnabled) result += PORTFOLIO
            if (PropertyContext.featureFlags.isBlogEnabled) result += BLOG

            return result
        }
    }

    fun lowercase() = name.lowercase()
    fun hash() = Uri.from(name).hashed()
    fun path() = Uri.from(name).toString()
}
