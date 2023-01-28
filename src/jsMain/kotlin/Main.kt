import content.ViewContainer
import footer.Footer
import header.Header
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

// todo stablaze layout, issues: footer overlayed by content;
//  menu should be in column for small screens;
//  set min widths for blocks;
//  refactor styles
// todo outilne architecture: understand how to get blog posts from backend; build with mocks;
//  create a portfolio layout with a grid of cases (case view)
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

