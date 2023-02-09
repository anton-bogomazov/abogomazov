package com.abogomazov

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {

    val BACKGROUND_COLOR = "#fff"
    val TEXT_COLOR = "#000"
    val ACCENT_AND_DIVIDERS_COLOR = "#ddd"
    val BUTTON_COLOR = "#4D4D4D"
    val HOVERED_LINK_COLOR = "#808080"
    val TILE_COLOR = "#4D4D4D"

    val smaller = 10.px
    val small = 12.px
    val medium = 18.px
    val large = 28.px
    val larger = 40.px

    val invertedText by style {
        property("background-color", TEXT_COLOR)
        property("color", BACKGROUND_COLOR)
    }

    val list by style {
        listStyleType("circle")

        property("padding-inline-start", 20.px)
    }

    val flexRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
    }

    val flexColumn by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
    }

    val flexCenter by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        flexDirection(FlexDirection.Column)

        height(80.vh)
    }

    val monospace by style {
        property("font-family", "'Roboto Mono', monospace")
    }

    val printable by style {
        media("print") {
            self style {
                display(DisplayStyle.Block)
            }
        }
    }

    val nonPrintable by style {
        media("print") {
            self style {
                display(DisplayStyle.None)
            }
        }
    }

    init {
        universal style {
            property("font-family", "Roboto, sans-serif")

            property("background-color", BACKGROUND_COLOR)
            property("color", TEXT_COLOR)

            textDecoration("none")

            type("a:hover") style { property("color", HOVERED_LINK_COLOR) }
            type("button:hover") style { property("background-color", HOVERED_LINK_COLOR) }

            margin(0.px)
        }
    }
}
