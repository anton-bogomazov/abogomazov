package footer.style

import BaseStyleSheet
import org.jetbrains.compose.web.css.*

object Footer : StyleSheet(BaseStyleSheet) {

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
        height(50.px)
    }

}
