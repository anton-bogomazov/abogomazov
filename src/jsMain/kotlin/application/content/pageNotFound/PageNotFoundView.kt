package application.content.pageNotFound

import GlobalStyles.invertedText
import androidx.compose.runtime.Composable
import application.content.pageNotFound.style.PageNotFoundStyle.container
import application.content.pageNotFound.style.PageNotFoundStyle.pageNotFoundText
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun PageNotFoundView() {
    Div({
        classes(container)
    }) {
        Span({ classes(pageNotFoundText, invertedText) }) { Text(PAGE_NOT_FOUND_TEXT) }
    }
}
