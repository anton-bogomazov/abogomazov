package application.header.menu

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
    }

    fun hash() = "#${name.lowercase().replace("_", "-")}"

    fun lowercase() = name.lowercase()
}
