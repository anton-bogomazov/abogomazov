import content.ViewContainer
import footer.Footer
import header.Header
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Style(BaseStyleSheet)

        Layout {
            Header()
            MainContentLayout {
                ViewContainer()
                Footer()
            }
        }
    }
}

