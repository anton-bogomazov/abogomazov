package application.content.blog

import androidx.compose.runtime.*
import httpClient.BlogApi
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogPostView(title: String) {
    val coroutineScope = rememberCoroutineScope()
    var post by remember { mutableStateOf(BlogPostDto.empty()) }

    coroutineScope.launch { post = BlogApi.getPost(title) }

    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        Text(post.title)
        Br()
        Text(post.description)
        Br()
        Text(post.content)
    }
}
