package com.abogomazov.application

import com.abogomazov.GlobalStyles
import com.abogomazov.ResponsiveProperties
import org.jetbrains.compose.web.css.*

object ResponsiveStyle : StyleSheet(GlobalStyles) {
    val outerPadded by style {
        paddingTop(20.px)

        media("print") { self style { padding(20.px) } }
    }

    val largestText by style {
        fontSize(ResponsiveProperties.largeScreenText.largest)

        media("print") { self style { fontSize(ResponsiveProperties.printText.largest) } }
    }

    val largerText by style {
        fontSize(ResponsiveProperties.largeScreenText.larger)

        media("print") { self style { fontSize(ResponsiveProperties.printText.larger) } }
    }

    val largeText by style {
        fontSize(ResponsiveProperties.largeScreenText.large)

        media("print") { self style { fontSize(ResponsiveProperties.printText.large) } }
    }

    val mediumText by style {
        fontSize(ResponsiveProperties.largeScreenText.medium)

        media("print") { self style { fontSize(ResponsiveProperties.printText.medium) } }
    }


    val cvContactIcon by style {
        height(ResponsiveProperties.largeScreenIcons.cvContactIcon.size)
        width(ResponsiveProperties.largeScreenIcons.cvContactIcon.size)
        paddingRight(ResponsiveProperties.largeScreenIcons.cvContactIcon.padding)

        media("print") {
            self style {
                height(ResponsiveProperties.printIcons.cvContactIcon.size)
                width(ResponsiveProperties.printIcons.cvContactIcon.size)
                paddingRight(ResponsiveProperties.largeScreenIcons.cvContactIcon.padding)
            }
        }
    }

    val footerContactIcon by style {
        height(ResponsiveProperties.largeScreenIcons.footerContactIcon.size)
        width(ResponsiveProperties.largeScreenIcons.footerContactIcon.size)

        media("print") {
            self style {
                height(ResponsiveProperties.printIcons.footerContactIcon.size)
                width(ResponsiveProperties.printIcons.footerContactIcon.size)
            }
        }
    }

    val cvSectionPadding by style {
        paddingTop(30.px)

        media("print") {
            self style { paddingTop(16.px) }
        }

    }

    val cvSectionEntityPadding by style {
        paddingTop(20.px)

        media("print") {
            self style {
                paddingTop(8.px)
            }
        }
    }
}
