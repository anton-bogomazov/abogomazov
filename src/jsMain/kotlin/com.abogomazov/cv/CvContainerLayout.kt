package com.abogomazov.cv

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.style.GlobalStyle
import com.abogomazov.app.style.ResponsiveProperty
import com.abogomazov.app.style.ResponsiveStyle
import org.jetbrains.compose.web.css.*

@Composable fun CvContainerLayout(content: @Composable () -> Unit) {
    ColumnLayout(ResponsiveStyle.outerPadded) {
        content()
    }
}

@Composable fun CvCentralSection(content: @Composable () -> Unit) {
    ColumnLayout(CvContainerStyles.main) {
        content()
    }
}

@Composable fun CvSideSection(content: @Composable () -> Unit) {
    ColumnLayout(CvContainerStyles.side) {
        content()
    }
}

private object CvContainerStyles : StyleSheet(GlobalStyle) {

    val mainWidth = 65.percent
    val sideWidth = 100.percent - mainWidth

    val main by style {
        width(mainWidth)
        paddingRight(30.px)

        media(ResponsiveProperty.transformToColumnedView) {
            self style {
                width(100.percent)
                paddingRight(0.px)
            }
        }

        media("print") {
            self style {
                width(mainWidth)
                paddingRight(30.px)
            }
        }
    }

    val side by style {
        width(sideWidth)

        media(ResponsiveProperty.transformToColumnedView) {
            self style { width(100.percent) }
        }

        media("print") {
            self style { width(sideWidth) }
        }
    }

}
