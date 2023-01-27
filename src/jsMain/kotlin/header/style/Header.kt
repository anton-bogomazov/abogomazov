package header.style

import BaseStyleSheet
import org.jetbrains.compose.web.css.*

object Header : StyleSheet(BaseStyleSheet) {

    val menuSwitchWidth = 640.px

    val navigationBar by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexEnd)
        alignItems(AlignItems.Center)
        height(80.px)
        width(100.percent)
        boxSizing("border-box")
        position(Position.Fixed)
        padding(0.px, 40.px)
        top(0.px)
    }

}
