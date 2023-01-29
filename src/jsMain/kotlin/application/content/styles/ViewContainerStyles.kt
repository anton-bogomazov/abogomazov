package application.content.styles

import GlobalStyles
import org.jetbrains.compose.web.css.*

// todo feels like a bad name for styles
object ViewContainerStyles : StyleSheet(GlobalStyles) {

    val viewContainer by style {
        // todo not sure in percents. maybe its better to to some responsiveness
        padding(0.px, 20.percent, 40.px)
    }

}
