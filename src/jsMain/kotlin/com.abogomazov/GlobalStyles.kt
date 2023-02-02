package com.abogomazov

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {

    val PANEL_HEIGHT = 80.px
    val PANEL_PADDING = 40.px

    val invertedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    val flexRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        alignItems(AlignItems.Center)
    }

    val flexColumn by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
    }

    val panel by style {
        height(PANEL_HEIGHT)
        paddingLeft(PANEL_PADDING)
        paddingRight(PANEL_PADDING)
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
