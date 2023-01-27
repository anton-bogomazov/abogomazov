package header.style

import BaseStyleSheet
import header.style.Header.headerHeight
import header.style.Header.menuSwitchWidth
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white

object Menu : StyleSheet(BaseStyleSheet) {

    val horizontalMenu by style {
        display(DisplayStyle.Flex)

        media(mediaMaxWidth(menuSwitchWidth)) {
            self style {
                display(DisplayStyle.None)
            }
        }
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
