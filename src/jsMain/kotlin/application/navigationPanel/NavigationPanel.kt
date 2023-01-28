package application.navigationPanel

import androidx.compose.runtime.Composable
import application.navigationPanel.menu.Menu
import application.navigationPanel.menu.MenuOrientation
import application.navigationPanel.style.NavigationPanelStyles
import org.jetbrains.compose.web.dom.Nav

@Composable
fun NavigationPanel() {
    Nav({
        classes(NavigationPanelStyles.navigationBar)
    }) {
        Menu(MenuOrientation.HORIZONTAL)
    }
}
