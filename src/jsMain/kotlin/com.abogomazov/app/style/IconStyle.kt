package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object IconStyle : StyleSheet(GlobalStyle) {
    private val largeScreenIcons = IconSize(
        ContactIconProperty(size = 16.px, padding = 8.px), ContactIconProperty(size = 20.px, padding = 4.px))
    private val printIcons = IconSize(
        ContactIconProperty(size = 8.px, padding = 4.px), ContactIconProperty(size = 12.px, padding = 4.px))

    val cvContact by style {
        height(largeScreenIcons.cvContactIcon.size)
        width(largeScreenIcons.cvContactIcon.size)
        paddingRight(largeScreenIcons.cvContactIcon.padding)

        maxWidth(100.percent)
        display(DisplayStyle.Block)

        media(ResponsiveProperty.print) {
            self style {
                height(printIcons.cvContactIcon.size)
                width(printIcons.cvContactIcon.size)
                paddingRight(largeScreenIcons.cvContactIcon.padding)
            }
        }
    }

    val footerContact by style {
        height(largeScreenIcons.footerContactIcon.size)
        width(largeScreenIcons.footerContactIcon.size)

        padding(largeScreenIcons.footerContactIcon.padding)

        maxWidth(100.percent)
        display(DisplayStyle.Block)
    }

    private data class ContactIconProperty(
        val size: CSSSizeValue<CSSUnit.px>,
        val padding: CSSSizeValue<CSSUnit.px>,
    )

    private data class IconSize(
        val cvContactIcon: ContactIconProperty,
        val footerContactIcon: ContactIconProperty,
    )

}
