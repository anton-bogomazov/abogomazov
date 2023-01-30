package application.content.portfolio.style

import GlobalStyles
import org.jetbrains.compose.web.css.*

object PortfolioView : StyleSheet(GlobalStyles) {

    val cardGrid by style {
        display(DisplayStyle.Grid)
        padding(16.px)
    }

}
