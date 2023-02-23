package com.abogomazov.app.style

import org.jetbrains.compose.web.css.*

object ResponsiveStyle : StyleSheet(GlobalStyle) {
    val outerPadded by style {
        paddingTop(20.px)

        media(ResponsiveProperty.print) { self style { padding(20.px) } }
    }

    val topPadded by style {
        paddingBottom(12.px)

        media(ResponsiveProperty.mediumScreen) {
            self style {
                paddingBottom(8.px)
            }
        }

        media(ResponsiveProperty.smallScreen) {
            self style {
                paddingBottom(6.px)
            }
        }
    }

    val transformableToColumn by style {
        flexDirection(FlexDirection.Row)

        media(ResponsiveProperty.transformToColumnedView) {
            self style { flexDirection(FlexDirection.Column) }
        }

        media(ResponsiveProperty.print) { self style { flexDirection(FlexDirection.Row) } }
    }

    val cvSectionPadding by style {
        paddingTop(30.px)

        media(ResponsiveProperty.print) {
            self style { paddingTop(16.px) }
        }

    }

    val cvSectionEntityPadding by style {
        paddingTop(20.px)

        media(ResponsiveProperty.print) {
            self style {
                paddingTop(8.px)
            }
        }
    }
}
