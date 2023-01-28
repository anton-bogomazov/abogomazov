package application.header

import androidx.compose.runtime.Composable
import application.header.menu.Menu
import application.header.menu.MenuOrientation
import application.header.style.NavigationPanelStyles
import org.jetbrains.compose.web.dom.Nav

@Composable
fun NavigationPanel() {
    Nav({
        classes(NavigationPanelStyles.navigationBar)
    }) {
        Menu(MenuOrientation.HORIZONTAL)
    }
}
