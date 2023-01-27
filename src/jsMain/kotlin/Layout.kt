import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        style {
            display(DisplayStyle.Grid)
            gridTemplateRows("1fr auto")
            gridTemplateColumns("100%")
            minHeight(100.vh)
        }
    }) {
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            display(DisplayStyle.Block)
            margin(0.px)
            width(100.percent)
            maxWidth(1600.px)
            minHeight(100.vh)
            padding(0.px, 100.px)
        }
    }) {
        content()
    }
}
