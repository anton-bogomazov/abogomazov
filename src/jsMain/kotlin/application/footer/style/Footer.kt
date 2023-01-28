package application.footer.style

import application.ApplicationLayoutStyles
import org.jetbrains.compose.web.css.*

object Footer : StyleSheet(ApplicationLayoutStyles) {

    val icon by style {
        height(24.px)
        width(24.px)
        padding(6.px)
    }

    val iconPanel by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
    }

    val footerBar by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        boxSizing("border-box")
        padding(20.px)
        lineHeight(26.px)
        minHeight(50.px)
    }

}
