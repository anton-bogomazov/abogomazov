package com.abogomazov

import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.*

object Responsive : StyleSheet() {

    val smallScreen = mediaMaxWidth(420.px)
    val mediumScreen = mediaMaxWidth(840.px)

    val smallScreenText = TextSize(8.px, 10.px, 12.px, 14.px, 16.px)
    val mediumScreenText = TextSize(12.px, 16.px, 20.px, 24.px, 30.px)
    val largeScreenText = TextSize(20.px, 24.px, 28.px, 32.px, 36.px)

    data class TextSize(
        val smaller: CSSSizeValue<CSSUnit.px>,
        val small: CSSSizeValue<CSSUnit.px>,
        val medium: CSSSizeValue<CSSUnit.px>,
        val large: CSSSizeValue<CSSUnit.px>,
        val larger: CSSSizeValue<CSSUnit.px>,
    )

}
