package com.abogomazov.app.style

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.px

object ResponsiveProperty : StyleSheet(GlobalStyle) {

    const val print = "print"
    val smallScreen = mediaMaxWidth(420.px)
    val mediumScreen = mediaMaxWidth(800.px)
    val transformToColumnedView = mediumScreen

}
