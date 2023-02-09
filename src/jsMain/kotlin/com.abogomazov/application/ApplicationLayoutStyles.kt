package com.abogomazov.application

import com.abogomazov.GlobalStyles
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
    private val VIEW_CONTAINER_PADDING_LARGE_SCREEN = 200.px

    val panel by style {
        height(PANEL_HEIGHT_LARGE_SCREEN)
        marginLeft(PANEL_PADDING_LARGE_SCREEN)
        marginRight(PANEL_PADDING_LARGE_SCREEN)

        media(mediaMaxWidth(840.px)) {
            self style {
                height(PANEL_HEIGHT_MEDIUM_SCREEN)
                margin(0.px, PANEL_PADDING_MEDIUM_SCREEN)
            }
        }

        media(mediaMaxWidth(420.px)) {
            self style {
                height(PANEL_HEIGHT_SMALL_SCREEN)
                margin(0.px, PANEL_PADDING_SMALL_SCREEN)
            }
        }
    }

    val viewContainer by style {
        padding(0.px, VIEW_CONTAINER_PADDING_LARGE_SCREEN)
        marginTop(PANEL_HEIGHT_LARGE_SCREEN)

        media(mediaMaxWidth(840.px)) {
            self style {
                padding(0.px, VIEW_CONTAINER_PADDING_MEDIUM_SCREEN)
                marginTop(PANEL_HEIGHT_MEDIUM_SCREEN)
            }
        }

        media(mediaMaxWidth(420.px)) {
            self style {
                padding(0.px, VIEW_CONTAINER_PADDING_SMALL_SCREEN)
                marginTop(PANEL_HEIGHT_SMALL_SCREEN)
            }
        }
    }
}
