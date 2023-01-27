import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div {
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        content()
    }
}
