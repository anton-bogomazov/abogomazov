package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object LayoutStyle : StyleSheet(GlobalStyle) {

    val flexColumn by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
    }
    val flexRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
    }

    val spaced by style { justifyContent(JustifyContent.SpaceBetween) }
    val ended by style { justifyContent(JustifyContent.FlexEnd) }
    val centered by style { justifyContent(JustifyContent.Center) }
    val centerAligned by style { alignItems(AlignItems.Center) }

    val nonPrintable by style {
        media(ResponsiveProperty.print) { self style { display(DisplayStyle.None) } }
    }
}
