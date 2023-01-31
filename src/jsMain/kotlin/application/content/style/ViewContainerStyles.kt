package application.content.style

import GlobalStyles
import org.jetbrains.compose.web.css.*

object ViewContainerStyles : StyleSheet(GlobalStyles) {

    val viewContainer by style {
        padding(0.px, 20.percent)
    }

}
