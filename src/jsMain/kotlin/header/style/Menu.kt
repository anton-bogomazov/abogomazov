package header.style

import BaseStyleSheet
import StyleConstants.menuSwitchWidth
import org.jetbrains.compose.web.css.*

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
        top(100.px)
        bottom(0.px)
        right(0.px)
        height(100.vh)
        width(100.vw)

        media(mediaMaxWidth(menuSwitchWidth)) {
            self style {
                display(DisplayStyle.Flex)
            }
        }
    }

    val menuCategoryText by style {
        fontWeight("bold")
        padding(10.px)
    }

}
