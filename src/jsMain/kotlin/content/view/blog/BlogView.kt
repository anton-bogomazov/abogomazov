package content.view.blog

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogView() {
    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        BlogPost()
        BlogPost()
        BlogPost()
    }
}

@Composable
private fun BlogPost() {
    Section {
        Text("Blog post title")
        Br()
        Text("Short Content")
        Br()
        Text("Read more and render post view")
    }
}

fun getBlogPostByIndex(index: Int) =
    when (index) {
        0 -> "zero post"
        1 -> "first post"
        2 -> "second post"
        3 -> "third post"
        4 -> "fourth post"
        5 -> "fifth post"
        else -> "something went wrong"
    }
