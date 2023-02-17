package com.abogomazov.application

import com.abogomazov.GlobalStyles
import com.abogomazov.Responsive
import org.jetbrains.compose.web.css.*

object ApplicationLayoutStyles : StyleSheet(GlobalStyles) {

    private val PANEL_HEIGHT_SMALL_SCREEN = 50.px
    private val PANEL_PADDING_SMALL_SCREEN = 20.px
    private val VIEW_CONTAINER_PADDING_SMALL_SCREEN = 20.px

    private val PANEL_HEIGHT_MEDIUM_SCREEN = 70.px
    private val PANEL_PADDING_MEDIUM_SCREEN = 30.px
    private val VIEW_CONTAINER_PADDING_MEDIUM_SCREEN = 80.px

    private val PANEL_HEIGHT_LARGE_SCREEN = 100.px
    private val PANEL_PADDING_LARGE_SCREEN = 40.px
    private val VIEW_CONTAINER_PADDING_LARGE_SCREEN = 300.px

    val panel by style {
        height(PANEL_HEIGHT_LARGE_SCREEN)
        marginLeft(PANEL_PADDING_LARGE_SCREEN)
        marginRight(PANEL_PADDING_LARGE_SCREEN)

        fontSize(GlobalStyles.medium)

        media(Responsive.mediumScreen) {
            self style {
                height(PANEL_HEIGHT_MEDIUM_SCREEN)
                margin(0.px, PANEL_PADDING_MEDIUM_SCREEN)

                fontSize(GlobalStyles.small)
            }
        }

        media(Responsive.smallScreen) {
            self style {
                height(PANEL_HEIGHT_SMALL_SCREEN)
                margin(0.px, PANEL_PADDING_SMALL_SCREEN)

                fontSize(GlobalStyles.smaller)
            }
        }
    }

    val viewContainer by style {
        padding(0.px, VIEW_CONTAINER_PADDING_LARGE_SCREEN)
        margin(PANEL_HEIGHT_LARGE_SCREEN, 0.px)

        media(Responsive.mediumScreen) {
            self style {
                padding(0.px, VIEW_CONTAINER_PADDING_MEDIUM_SCREEN)
                margin(PANEL_HEIGHT_MEDIUM_SCREEN, 0.px)
            }
        }

        media(Responsive.smallScreen) {
            self style {
                padding(0.px, VIEW_CONTAINER_PADDING_SMALL_SCREEN)
                margin(PANEL_HEIGHT_SMALL_SCREEN, 0.px)
            }
        }
    }
}
