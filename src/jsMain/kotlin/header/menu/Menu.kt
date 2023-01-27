package header.menu

import androidx.compose.runtime.Composable
import header.style.Menu.horizontalMenu
import header.style.Menu.verticalMenu
import org.jetbrains.compose.web.dom.Div

@Composable
fun Menu(orientation: MenuOrientation) {
    Div({
        when (orientation) {
            MenuOrientation.HORIZONTAL -> classes(horizontalMenu)
            MenuOrientation.VERTICAL -> classes(verticalMenu)
        }
    }) {
        menuCategories.forEach {
            MenuCategory(it.name.lowercase())
        }
    }
}

enum class MenuOrientation {
    VERTICAL,
    HORIZONTAL
}

private val menuCategories =
    listOf(MenuCategory.ABOUT_ME, MenuCategory.PORTFOLIO, MenuCategory.CV, MenuCategory.BLOG)
