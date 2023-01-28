package content.view.portfolio

import androidx.compose.runtime.Composable
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.black
import org.jetbrains.compose.web.dom.*

@Composable
fun PortfolioView() {
    Div({
        style {
            display(DisplayStyle.Grid)
            boxSizing("border-box")
            gridTemplateColumns("200px 200px 200px")
        }
    }) {
        PortfolioCase.values().forEach { PortfolioCaseSection(it) }
    }
}

@Composable
private fun PortfolioCaseSection(case: PortfolioCase) {
    Div({
        onClick { window.location.assign(portfolioCaseLink(case.toUri())) }
        style {
            // todo hover style
            padding(16.px)
            border {
                left(10.px)
            }
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)

            border {
                style(LineStyle.Solid)
                color(black)
            }
            borderWidth(2.px, 2.px, 2.px, 20.px)
        }
    }) {
        Span({ style { fontWeight("bold") } }) { Text(case.name.lowercase()) }
        Span { Text(case.description) }
    }
}

private fun portfolioCaseLink(caseUri: String) = "${window.location.origin}/#portfolio/$caseUri"
