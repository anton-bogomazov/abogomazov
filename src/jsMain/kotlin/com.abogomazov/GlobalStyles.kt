package com.abogomazov

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {

    val PANEL_HEIGHT = 80.px

    val invertedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    val flexRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        alignItems(AlignItems.Center)
    }

    init {
        universal style {
            fontFamily("monospace")
            color(Color.black)
            textDecoration("none")

            type("a:hover") style { color(Color.lightgray) }

            margin(0.px)
        }
    }
}
