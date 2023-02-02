package com.abogomazov.application

import com.abogomazov.IS_BLOG_ENABLED
import com.abogomazov.Uri

enum class Category {
    ROOT,
    ABOUT_ME,
    CV,
    PORTFOLIO,
    BLOG;

    companion object {
        fun from(uri: Uri) =
            try {
                // fixme intentional inconsistency: there is no IllegalStateException with disabled BLOG
                Category.valueOf(uri.toEnumCompatibleString())
            } catch (e: IllegalStateException) {
                ROOT
            }

        fun categories() = Category.values().subtract(if (!IS_BLOG_ENABLED) setOf(BLOG) else setOf())
    }

    fun lowercase() = name.lowercase()
    fun hash() = Uri.from(name).hashed()
    fun path() = Uri.from(name).toString()
}
