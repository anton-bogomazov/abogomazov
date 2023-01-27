package header.style

import BaseStyleSheet
import org.jetbrains.compose.web.css.*

object Header : StyleSheet(BaseStyleSheet) {

    val menuSwitchWidth = 640.px
    val headerHeight = 80.px

    val navigationBar by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexEnd)
        alignItems(AlignItems.Center)
        height(headerHeight)
        width(100.percent)
        boxSizing("border-box")
        padding(0.px, 40.px)
    }

}
