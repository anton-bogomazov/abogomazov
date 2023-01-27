package header.menu

import StyleConstants.menuSwitchWidth
import androidx.compose.runtime.*
import header.style.Burger.burgerButton
import header.style.Burger.burgerLineElement
import kotlinx.browser.window
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.transform
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div

// todo this thing is ugly, change the styles
// also I don't like the s. design of this component, too low level and smelly
@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun BurgerButton() {
    var showMenu by remember { mutableStateOf(false) }
    window.asDynamic().onresize = {
        val currentWidth = window.innerWidth

        if (currentWidth > menuSwitchWidth.value) {
            showMenu = false
        }
    }

    Button(attrs = {
        onClick { showMenu = !showMenu }
        classes(burgerButton)
    }) {
        Div({
            classes(burgerLineElement)
            style {
                if (showMenu) {
                    transform { rotate(45.deg) }
                    property("transform-origin", "top left")
                }
            }
        })
        Div({
            classes(burgerLineElement)
            style {
                if (showMenu) { display(DisplayStyle.None) }
            }
        })
        Div({
            classes(burgerLineElement)
            style {
                if (showMenu) {
                    transform { rotate((-45).deg) }
                    property("transform-origin", "bottom left")
                }
            }
        })
    }

    if (showMenu) Menu(MenuOrientation.VERTICAL)
}
