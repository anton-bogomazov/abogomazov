package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ResponsiveStyle
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

object LayoutStyle : StyleSheet(GlobalStyles) {
    val noPadFirstChild by style {
        firstChild style { paddingTop(0.px) }
    }
}

@Composable fun CvContainerLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn, GlobalStyles.printable, ResponsiveStyle.outerPadded)
    }) {
        content()
    }
}

@Composable fun CvMainLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexRow)

        style {
            paddingTop(20.px)
        }
    }) { content() }
}

@Composable fun CvCentralSection(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn, LayoutStyle.noPadFirstChild)
        style {
            width(65.percent)

            paddingRight(30.px)
        }
    }) { content() }
}

@Composable fun CvSideSection(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn, LayoutStyle.noPadFirstChild)
        style { width(35.percent) }
    }) { content() }
}
