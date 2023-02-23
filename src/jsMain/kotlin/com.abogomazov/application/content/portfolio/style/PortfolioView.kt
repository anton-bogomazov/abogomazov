package com.abogomazov.application.content.portfolio.style

import com.abogomazov.app.style.GlobalStyle
import org.jetbrains.compose.web.css.*

object PortfolioView : StyleSheet(GlobalStyle) {

    val cardGrid by style {
        display(DisplayStyle.Grid)
        padding(16.px)
    }

}
