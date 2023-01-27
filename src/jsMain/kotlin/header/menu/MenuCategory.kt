package header.menu

import BaseStyleSheet.selectedText
import androidx.compose.runtime.Composable
import header.style.Menu.menuCategoryText
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

enum class MenuCategory(val link: String) {
    ROOT("#root"),
    ABOUT_ME("#about-me"),
    CV("#cv"),
    PORTFOLIO("#portfolio"),
    BLOG("#blog");

    companion object {
        fun fromHashOrRoot(hash: String) =
            MenuCategory.valueOf(
                hash.substringAfter("#")
                    .replace("-", "_")
                    .ifBlank { "root" }
                    .uppercase()
            )
    }
}

@Composable
fun MenuCategory(category: MenuCategory, selected: Boolean = false, callback: (MenuCategory) -> Unit) {
    val content = category.name.lowercase()
    if (selected) {
        MenuCategoryText(content)
    } else {
        MenuCategoryLink(content, category.link, callback)
    }
}

@Composable
private fun MenuCategoryText(content: String) {
    Span({
        classes(menuCategoryText, selectedText)
    }) {
        Text(content)
    }
}

@Composable
private fun MenuCategoryLink(content: String, link: String, callback: (MenuCategory) -> Unit) {
    A(attrs = {
        classes(menuCategoryText)
        onClick { callback(MenuCategory.valueOf(content.uppercase())) } }, href = link) {
        Text(content)
    }
}
