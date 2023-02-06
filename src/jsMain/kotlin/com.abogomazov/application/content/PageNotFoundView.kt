package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.GlobalStyles.invertedText
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable fun PageNotFoundView() {
    Div({
        classes(GlobalStyles.flexCenter)
        style { fontSize(GlobalStyles.larger) }
    }) {
        Span({ classes(invertedText) }) { Text("<PAGE_NOT_FOUND>") }
    }
}
