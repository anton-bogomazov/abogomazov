package com.abogomazov

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {

    val BACKGROUND_COLOR = "#fff"
    val TEXT_COLOR = "#000"
    val ACCENT_AND_DIVIDERS_COLOR = "#ddd"
    val BUTTON_COLOR = "#4D4D4D"
    val HOVERED_LINK_COLOR = "#808080"
    val TILE_COLOR = "#4D4D4D"

    val SMALL = 8.px
    val REGULAR = 12.px
    val LARGE = 18.px
    val HUGE = 24.px
    val GIANT = 36.px

    val invertedText by style {
        property("background-color", TEXT_COLOR)
        property("color", BACKGROUND_COLOR)
    }

    val flexRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
    }

    val flexColumn by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
    }

    val monospace by style {
        property("font-family", "Roboto Mono, monospace")
    }

    init {
        universal style {
            property("font-family", "Roboto, sans-serif")

            property("background-color", BACKGROUND_COLOR)
            property("color", TEXT_COLOR)

            textDecoration("none")

            type("a:hover") style { color(Color.lightgray) }

            margin(0.px)
        }
    }
}
