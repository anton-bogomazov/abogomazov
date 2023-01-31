package application.navigationPanel.menu

import IS_BLOG_ENABLED

enum class MenuCategory {
    ROOT,
    ABOUT_ME,
    CV,
    PORTFOLIO,
    BLOG;

    companion object {
        fun from(hash: String) =
            try {
                MenuCategory.valueOf(
                    hash.substringAfter("#")
                        .replace("-", "_")
                        .uppercase()
                )
            } catch (e: IllegalStateException) {
                ROOT
            }

        fun getCategories() =
            MenuCategory.values()
                .subtract(
                    if (!IS_BLOG_ENABLED) setOf(BLOG) else setOf()
                )
    }

    fun hash() = "#${name.lowercase().replace("_", "-")}"

    fun lowercase() = name.lowercase()
}
