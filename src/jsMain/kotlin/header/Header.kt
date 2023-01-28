package header

import androidx.compose.runtime.*
import header.menu.Menu
import header.menu.MenuOrientation
import header.style.Header.navigationBar
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Header() {
    Nav({
        classes(navigationBar)
    }) {
        Menu(MenuOrientation.HORIZONTAL)
    }
}
