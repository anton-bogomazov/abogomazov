package header.style

import BaseStyleSheet
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.black
import org.jetbrains.compose.web.css.Color.white

object Burger : StyleSheet(BaseStyleSheet) {

    val burgerButton by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.SpaceAround)
        width(40.px)
        height(40.px)
        backgroundColor(white)
        border(0.px)

        media(mediaMinWidth(641.px)) {
            self style {
                display(DisplayStyle.None)
            }
        }
    }

    val burgerLineElement by style {
        width(100.percent)
        height(3.px)
        backgroundColor(black)
    }

}
