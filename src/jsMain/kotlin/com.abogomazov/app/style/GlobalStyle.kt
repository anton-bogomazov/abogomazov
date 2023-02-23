package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object GlobalStyle : StyleSheet() {

    val backgroundColor = Color.white
    val textColor = Color.black
    val hoveredLinkColor = Color.darkgray

    val blackBackground by style { backgroundColor(Color.black) }
    val padded by style { padding(10.px) }

    init {
        universal style {
            property("font-family", "Roboto, sans-serif")
            lineHeight("1.4")

            backgroundColor(backgroundColor)
            color(textColor)

            textDecoration("none")

            type("a:hover") style { color(hoveredLinkColor) }

            margin(0.px)
        }
    }
}
