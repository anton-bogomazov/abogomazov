package application.navigationPanel.menu

import GlobalStyles.hoveredLink
import GlobalStyles.invertedText
import androidx.compose.runtime.*
import application.navigationPanel.style.MenuStyles.horizontalMenu
import application.navigationPanel.style.MenuStyles.menuItem
import application.navigationPanel.style.MenuStyles.verticalMenu
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun Menu(orientation: MenuOrientation) {
    var selectedCategory by remember {
        val currentHash = window.location.hash
        mutableStateOf(MenuCategory.from(currentHash))
    }

    Div({
        when (orientation) {
            MenuOrientation.HORIZONTAL -> classes(horizontalMenu)
            MenuOrientation.VERTICAL -> classes(verticalMenu)
        }
    }) {
        MenuCategory.values().forEach {
            MenuItem(it, it == selectedCategory) { category -> selectedCategory = category }
        }
    }
}

@Composable
private fun MenuItem(category: MenuCategory, selected: Boolean = false, callback: (MenuCategory) -> Unit) {
    A(attrs = {
        classes(menuItem, hoveredLink)
        if (selected) classes(invertedText)

        onClick { callback(category) } }, href = category.hash()
    ) {
        Text(category.lowercase())
    }
}
