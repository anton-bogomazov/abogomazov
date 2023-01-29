package application.content.styles

import GlobalStyles
import org.jetbrains.compose.web.css.*

object ViewContainerStyles : StyleSheet(GlobalStyles) {

    val viewContainer by style {
        padding(0.px, 20.percent, 40.px)
    }

}
