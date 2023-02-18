package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.ResponsiveStyle
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

private object CvContainerStyles : StyleSheet(GlobalStyles) {

    val mainWidth = 65.percent
    val sideWidth = 100.percent - mainWidth

    val main by style {
        width(mainWidth)

        paddingRight(30.px)
    }

    val side by style {
        width(sideWidth)
    }

}
