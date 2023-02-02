package com.abogomazov.application.content.portfolio

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.portfolio.style.PortfolioCaseCardStyle
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun PortfolioCaseCard(case: PortfolioCase) {
    Div({
        // todo extract into a method
        onClick { window.location.assign(case.toUri(window.location.origin)) }
        classes(PortfolioCaseCardStyle.caseCard, PortfolioCaseCardStyle.clickable)
    }) {
        Span({ classes(PortfolioCaseCardStyle.caseCardHeader) }) { Text(case.name.lowercase()) }
        Span { Text(case.description) }

        Div({ classes(PortfolioCaseCardStyle.caseCardFooter) }) {
            Span({ classes(PortfolioCaseCardStyle.transparentText) }) { Text("company: ${case.company}") }
            Span({ classes(PortfolioCaseCardStyle.transparentText) }) { Text("tag: ${case.tag}") }
        }
    }
}
