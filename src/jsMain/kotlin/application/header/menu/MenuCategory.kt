package application.header.menu

import GlobalStyles.linkHover
import GlobalStyles.selectedText
import androidx.compose.runtime.Composable
import application.header.style.Menu.menuCategoryText
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text

enum class MenuCategory(val link: String) {
    ROOT("#root"),
    ABOUT_ME("#about-me"),
    CV("#cv"),
    PORTFOLIO("#portfolio"),
    BLOG("#blog");

    companion object {
        fun fromHashOrRoot(hash: String) =
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
}

@Composable
fun MenuCategory(category: MenuCategory, selected: Boolean = false, callback: (MenuCategory) -> Unit) {
    val content = category.name.lowercase()

    A(attrs = {
        classes(menuCategoryText, linkHover)
        if (selected) classes(selectedText)
        onClick { callback(category) } }, href = category.link) {
        Text(content)
    }
}
