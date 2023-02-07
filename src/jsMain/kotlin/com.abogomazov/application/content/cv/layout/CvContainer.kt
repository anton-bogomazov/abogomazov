package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div

@Composable fun CvContainerLayout(content: @Composable () -> Unit) {
    Div({ classes(GlobalStyles.flexColumn, GlobalStyles.printable) }) { content() }
}

@Composable fun CvMainLayout(content: @Composable () -> Unit) {
    Div({ classes(GlobalStyles.flexRow) }) { content() }
}

@Composable fun CvCentralSection(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
        style { width(65.percent) }
    }) { content() }
}

@Composable fun CvSideSection(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
        style { width(35.percent) }
    }) { content() }
}
