package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object IconStyle : StyleSheet(GlobalStyle) {
    private val largeScreenIcons = IconSize(
        ContactIconProperty(size = 16.px, padding = 8.px), ContactIconProperty(size = 20.px, padding = 4.px))
    private val mediumScreenIcons = IconSize(
        ContactIconProperty(size = 12.px, padding = 8.px), ContactIconProperty(size = 16.px, padding = 4.px))
    private val smallScreenIcons = IconSize(
        ContactIconProperty(size = 8.px, padding = 4.px), ContactIconProperty(size = 12.px, padding = 4.px))
    private val printIcons = IconSize(
        ContactIconProperty(size = 8.px, padding = 4.px), ContactIconProperty(size = 12.px, padding = 4.px))

    val cvContact by style {
        height(largeScreenIcons.cvContactIcon.size)
        width(largeScreenIcons.cvContactIcon.size)
        paddingRight(largeScreenIcons.cvContactIcon.padding)

        maxWidth(100.percent)
        display(DisplayStyle.Block)

        media(ResponsiveProperty.mediumScreen) {
            self style {
                height(mediumScreenIcons.cvContactIcon.size)
                width(mediumScreenIcons.cvContactIcon.size)
                paddingRight(mediumScreenIcons.cvContactIcon.padding)
            }
        }

        media(ResponsiveProperty.smallScreen) {
            self style {
                height(smallScreenIcons.cvContactIcon.size)
                width(smallScreenIcons.cvContactIcon.size)
                paddingRight(smallScreenIcons.cvContactIcon.padding)
            }
        }

        media(ResponsiveProperty.print) {
            self style {
                height(printIcons.cvContactIcon.size)
                width(printIcons.cvContactIcon.size)
                paddingRight(printIcons.cvContactIcon.padding)
            }
        }
    }

    val footerContact by style {
        height(largeScreenIcons.footerContactIcon.size)
        width(largeScreenIcons.footerContactIcon.size)

        padding(largeScreenIcons.footerContactIcon.padding)

        maxWidth(100.percent)
        display(DisplayStyle.Block)

        media(ResponsiveProperty.mediumScreen) {
            self style {
                height(mediumScreenIcons.footerContactIcon.size)
                width(mediumScreenIcons.footerContactIcon.size)
                paddingRight(mediumScreenIcons.footerContactIcon.padding)
            }
        }

        media(ResponsiveProperty.smallScreen) {
            self style {
                height(smallScreenIcons.footerContactIcon.size)
                width(smallScreenIcons.footerContactIcon.size)
                paddingRight(smallScreenIcons.footerContactIcon.padding)
            }
        }
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
