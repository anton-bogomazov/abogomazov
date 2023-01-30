package application.content.pageNotFound.style

import GlobalStyles
import org.jetbrains.compose.web.css.*

object PageNotFoundStyle : StyleSheet(GlobalStyles) {

    val container by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)

        height(80.vh)
    }

    // fixme don't use global styles in component? Concatenate inverted text here?
    val pageNotFoundText by style {
        fontSize(48.px)
    }

}
