package header.menu

import BaseStyleSheet.selectedText
import androidx.compose.runtime.Composable
import header.style.Menu.menuCategoryText
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

enum class MenuCategory(val link: String) {
    ROOT("/#/"),
    ABOUT_ME("/#/about-me"),
    CV("/#/cv"),
    PORTFOLIO("/#/portfolio"),
    BLOG("/#/blog")
}

// todo how to move between an "pages" (SPA/MPA)
@Composable
fun MenuCategory(category: MenuCategory, selected: Boolean = false) {
    val content = category.name.lowercase()
    if (selected) {
        MenuCategoryText(content)
    } else {
        MenuCategoryLink(content, category.link)
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
private fun MenuCategoryLink(content: String, link: String) {
    A(attrs = { classes(menuCategoryText) }, href = link) {
        Text(content)
    }
}
