package com.abogomazov.app.chassis

import com.abogomazov.app.style.GlobalStyle
import com.abogomazov.app.style.ResponsiveProperty
import org.jetbrains.compose.web.css.*

object ChassisStyles : StyleSheet(GlobalStyle) {

    private val smallScreenProperties = ChassisResponsiveProperties(50.px, 20.px, 20.px)
    private val mediumScreenProperties = ChassisResponsiveProperties(70.px, 30.px, 80.px)
    private val largeScreenProperties = ChassisResponsiveProperties(100.px, 40.px, 300.px)

    val panel by style {
        height(largeScreenProperties.panelHeight)
        margin(0.px, largeScreenProperties.panelPadding)

        media(ResponsiveProperty.mediumScreen) {
            self style {
                height(mediumScreenProperties.panelHeight)
                margin(0.px, mediumScreenProperties.panelPadding)
            }
        }

        media(ResponsiveProperty.smallScreen) {
            self style {
                height(smallScreenProperties.panelHeight)
                margin(0.px, smallScreenProperties.panelPadding)
            }
        }
    }

    val viewContainer by style {
        padding(0.px, largeScreenProperties.viewContainerPadding)
        margin(largeScreenProperties.panelHeight, 0.px)

        media(ResponsiveProperty.mediumScreen) {
            self style {
                padding(0.px, mediumScreenProperties.viewContainerPadding)
                margin(mediumScreenProperties.panelHeight, 0.px)
            }
        }

        media(ResponsiveProperty.smallScreen) {
            self style {
                padding(0.px, smallScreenProperties.viewContainerPadding)
                margin(smallScreenProperties.panelHeight, 0.px)
            }
        }

        media(ResponsiveProperty.print) {
            self style {
                padding(0.px)
                margin(0.px)
            }
        }
    }

    val topFixed by style {
        position(Position.Fixed)
        top(0.px)
        left(0.px)

        width(100.percent)
    }

    val bottomFixed by style {
        position(Position.Fixed)
        bottom(0.px)
        left(0.px)

        width(100.percent)
    }

    private data class ChassisResponsiveProperties(
        val panelHeight: CSSSizeValue<CSSUnit.px>,
        val panelPadding: CSSSizeValue<CSSUnit.px>,
        val viewContainerPadding: CSSSizeValue<CSSUnit.px>,
    )
}
