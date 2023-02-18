package com.abogomazov

import org.jetbrains.compose.web.css.*

object ResponsiveProperties : StyleSheet(GlobalStyles) {

    val smallScreen = mediaMaxWidth(420.px)
    val mediumScreen = mediaMaxWidth(840.px)
    val a4 = mediaMaxWidth(595.px)

    val smallScreenText = TextSize(8.px, 10.px, 12.px, 14.px, 16.px, 20.px)
    val mediumScreenText = TextSize(12.px, 16.px, 20.px, 24.px, 30.px, 36.px)
    val largeScreenText = TextSize(10.px, 14.px, 18.px, 28.px, 40.px, 60.px)
    val printText = TextSize(6.px, 8.px, 10.px, 16.px, 20.px, 36.px)

    val largeScreenIcons = IconSize(ContactIconProperty(16.px, 8.px), ContactIconProperty(20.px, 4.px))
    val printIcons = IconSize(ContactIconProperty(8.px, 4.px), ContactIconProperty(12.px, 4.px))

    data class TextSize(
        val smaller: CSSSizeValue<CSSUnit.px>,
        val small: CSSSizeValue<CSSUnit.px>,
        val medium: CSSSizeValue<CSSUnit.px>,
        val large: CSSSizeValue<CSSUnit.px>,
        val larger: CSSSizeValue<CSSUnit.px>,
        val largest: CSSSizeValue<CSSUnit.px>,
    )

    data class ContactIconProperty(
        val size: CSSSizeValue<CSSUnit.px>,
        val padding: CSSSizeValue<CSSUnit.px>,
    )

    data class IconSize(
        val cvContactIcon: ContactIconProperty,
        val footerContactIcon: ContactIconProperty,
    )
}
