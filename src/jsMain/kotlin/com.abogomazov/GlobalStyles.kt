package com.abogomazov

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {

    val BACKGROUND_COLOR = "#fff"
    val TEXT_COLOR = "#000"
    val ACCENT_AND_DIVIDERS_COLOR = "#ddd"
    val BUTTON_COLOR = "#4D4D4D"
    val HOVERED_LINK_COLOR = "#808080"
    val TILE_COLOR = "#4D4D4D"

    val bold = 600
    val lessBold = 450

    val invertedText by style {
        property("background-color", TEXT_COLOR)
        property("color", BACKGROUND_COLOR)
    }

    val spaced by style { justifyContent(JustifyContent.SpaceBetween) }

    val centerAligned by style { alignItems(AlignItems.Center) }

    val ended by style { justifyContent(JustifyContent.FlexEnd) }

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
            lineHeight("1.4")

            property("background-color", BACKGROUND_COLOR)
            property("color", TEXT_COLOR)

            textDecoration("none")

            type("a:hover") style { property("color", HOVERED_LINK_COLOR) }
            type("button:hover") style { property("background-color", HOVERED_LINK_COLOR) }

            margin(0.px)
        }
    }
}
