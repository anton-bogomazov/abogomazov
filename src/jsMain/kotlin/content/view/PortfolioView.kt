package content.view

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun PortfolioView() {
    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        Text("portfolio")
    }
}
