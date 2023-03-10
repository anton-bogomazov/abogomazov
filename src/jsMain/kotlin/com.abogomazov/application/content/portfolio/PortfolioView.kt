package com.abogomazov.application.content.portfolio

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.portfolio.style.PortfolioView.cardGrid
import org.jetbrains.compose.web.dom.Div

@Composable
fun PortfolioView() {
    Div({ classes(cardGrid) }) {
        PortfolioCase.values().forEach { PortfolioCaseCard(it) }
    }
}
