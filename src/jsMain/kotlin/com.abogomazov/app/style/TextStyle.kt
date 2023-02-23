package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object TextStyle : StyleSheet(GlobalStyle) {
    private val smallScreenTextProperties = TextSize(8.px, 10.px, 12.px, 14.px, 16.px, 20.px)
    private val mediumScreenTextProperties = TextSize(12.px, 16.px, 20.px, 24.px, 30.px, 36.px)
    private val largeScreenTextProperties = TextSize(10.px, 14.px, 18.px, 28.px, 40.px, 60.px)
    private val printTextProperties = TextSize(6.px, 8.px, 10.px, 16.px, 20.px, 36.px)

    private val boldValue = 600
    private val lessBoldValue = 450

    val largest by style {
        fontSize(largeScreenTextProperties.largest)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.largest) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.largest) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.largest) } }
    }

    val larger by style {
        fontSize(largeScreenTextProperties.larger)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.larger) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.larger) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.larger) } }
    }

    val large by style {
        fontSize(largeScreenTextProperties.large)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.large) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.large) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.large) } }
    }

    val medium by style {
        fontSize(largeScreenTextProperties.medium)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.medium) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.medium) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.medium) } }
    }

    val small by style {
        fontSize(largeScreenTextProperties.small)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.small) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.small) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.small) } }
    }

    val smaller by style {
        fontSize(largeScreenTextProperties.smaller)

        media(ResponsiveProperty.mediumScreen) { self style { fontSize(mediumScreenTextProperties.smaller) } }
        media(ResponsiveProperty.smallScreen) { self style { fontSize(smallScreenTextProperties.smaller) } }
        media(ResponsiveProperty.print) { self style { fontSize(printTextProperties.smaller) } }
    }

    val bold by style { fontWeight(boldValue) }
    val lessBold by style { fontWeight(lessBoldValue) }

    val italic by style { fontStyle("italic") }

    val inverted by style {
        backgroundColor(GlobalStyle.textColor)
        color(GlobalStyle.backgroundColor)
    }

    val monospace by style {
        property("font-family", "'Roboto Mono', monospace")
    }

    private data class TextSize(
        val smaller: CSSSizeValue<CSSUnit.px>,
        val small: CSSSizeValue<CSSUnit.px>,
        val medium: CSSSizeValue<CSSUnit.px>,
        val large: CSSSizeValue<CSSUnit.px>,
        val larger: CSSSizeValue<CSSUnit.px>,
        val largest: CSSSizeValue<CSSUnit.px>,
    )
}
