package application.content.blog

import androidx.compose.runtime.*
import httpClient.getAllPosts
import kotlinx.browser.window
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogView() {
    val coroutineScope = rememberCoroutineScope()
    var postListDto by remember { mutableStateOf(BlogPostListDto(emptyList())) }

    coroutineScope.launch { postListDto = getAllPosts() }

    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        postListDto.blogPosts.forEach { post -> BlogPost(post) }
    }
}

@Composable
private fun BlogPost(post: BlogPostDto) {
    Section({
        onClick { window.location.assign(post.toUri(window.location.origin)) }
    }) {
        Text(post.title)
        Br()
        Text(post.description)
        Br()
        Text("Read more and render post view")
    }
}
