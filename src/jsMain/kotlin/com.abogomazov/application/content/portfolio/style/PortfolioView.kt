package com.abogomazov.application.content.portfolio.style

import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.*

object PortfolioView : StyleSheet(GlobalStyles) {

    val cardGrid by style {
        display(DisplayStyle.Grid)
        padding(16.px)
    }

}
