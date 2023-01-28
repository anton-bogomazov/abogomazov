package application.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
            padding(0.px, 25.percent)
            maxWidth(1600.px)
            maxHeight(865.px)
        }
    }) {
        route()
    }
}
