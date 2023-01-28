package application.header.style

import application.ApplicationLayoutStyles
import application.header.style.Header.headerHeight
import application.header.style.Header.menuSwitchWidth
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white

object Menu : StyleSheet(ApplicationLayoutStyles) {

    val horizontalMenu by style {
        display(DisplayStyle.Flex)
    }

    val verticalMenu by style {
        display(DisplayStyle.None)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.FlexStart)
        alignItems(AlignItems.Center)
        position(Position.Fixed)
        top(headerHeight)
        bottom(0.px)
        right(0.px)
        height(100.vh)
        width(100.vw)
        backgroundColor(white)

        media(mediaMaxWidth(menuSwitchWidth)) {
            self style {
                display(DisplayStyle.Flex)
            }
        }
    }

    val menuCategoryText by style {
        fontWeight("bold")
        margin(8.px)
        padding(2.px)
    }

}
