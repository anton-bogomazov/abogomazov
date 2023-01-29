import application.Application
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

// todo stablaze layout, issues: footer overlayed by content;
//  menu should be in column for small screens;
//  set min widths for blocks;
//  refactor styles
fun main() = runApplication()

private fun runApplication() {
    renderComposable(rootElementId = "root") {
        Style(GlobalStyles)

        Application()
    }
}
