package content.view.blog

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogPostView() {
    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        Text("blogpostview")
    }
}
