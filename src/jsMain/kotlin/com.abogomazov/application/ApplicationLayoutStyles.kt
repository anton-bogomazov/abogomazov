package com.abogomazov.application

import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.*

object ApplicationLayoutStyles : StyleSheet(GlobalStyles) {

    private val PANEL_HEIGHT = 6.vh
    private val PANEL_PADDING = 40.px
    private val VIEW_CONTAINER_PADDING = 20.percent

    val panel by style {
        height(PANEL_HEIGHT)
        paddingLeft(PANEL_PADDING)
        paddingRight(PANEL_PADDING)
    }

    val viewContainer by style {
        paddingLeft(VIEW_CONTAINER_PADDING)
        paddingRight(VIEW_CONTAINER_PADDING)

        minHeight(88.vh)
        maxHeight(88.vh)
        overflow("auto")
    }
}
