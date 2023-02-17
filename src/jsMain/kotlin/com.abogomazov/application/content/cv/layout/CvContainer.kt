package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable fun CvContainerLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn, GlobalStyles.printable)

        style { paddingTop(20.px) }
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
        classes(GlobalStyles.flexColumn)
        style {
            width(65.percent)

            paddingRight(30.px)
        }
    }) { content() }
}

@Composable fun CvSideSection(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
        style { width(35.percent) }
    }) { content() }
}
