package header.menu

import androidx.compose.runtime.*
import header.style.Menu.horizontalMenu
import header.style.Menu.verticalMenu
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Div

@Composable
fun Menu(orientation: MenuOrientation) {
    var currentCategory by remember {
        val currentHash = window.location.hash
        mutableStateOf(MenuCategory.fromHashOrRoot(currentHash))
    }

    Div({
        when (orientation) {
            MenuOrientation.HORIZONTAL -> classes(horizontalMenu)
            MenuOrientation.VERTICAL -> classes(verticalMenu)
        }
    }) {
        menuCategories.forEach {
            MenuCategory(it, it == currentCategory) { category -> currentCategory = category }
        }
    }
}

enum class MenuOrientation {
    VERTICAL,
    HORIZONTAL
}

private val menuCategories =
    listOf(MenuCategory.ROOT, MenuCategory.ABOUT_ME, MenuCategory.PORTFOLIO, MenuCategory.CV, MenuCategory.BLOG)
