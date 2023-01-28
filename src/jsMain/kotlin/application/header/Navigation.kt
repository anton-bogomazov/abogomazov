package application.header

import androidx.compose.runtime.Composable
import application.header.menu.Menu
import application.header.menu.MenuOrientation
import application.header.style.Header
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Navigation() {
    Nav({
        classes(Header.navigationBar)
    }) {
        Menu(MenuOrientation.HORIZONTAL)
    }
}
