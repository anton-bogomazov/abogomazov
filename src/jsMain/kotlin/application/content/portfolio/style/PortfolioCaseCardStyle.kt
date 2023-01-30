package application.content.portfolio.style

import GlobalStyles
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.darkgray
import org.jetbrains.compose.web.css.Color.lightgray

object PortfolioCaseCardStyle : StyleSheet(GlobalStyles) {

    val caseCard by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)

        border {
            style(LineStyle.Solid)
            color(Color.black)
        }
        borderWidth(2.px, 2.px, 2.px, 20.px)

        padding(16.px)
        margin(16.px)
    }

    val caseCardFooter by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)

        paddingTop(8.px)
    }

    val transparentText by style {
        color(darkgray)
    }

    val caseCardHeader by style {
        fontSize(20.px)
    }

    val clickable by style {
        cursor("pointer")

        self + hover style {
            backgroundColor(lightgray)
        }
    }

}
