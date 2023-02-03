package com.abogomazov.application.content.pageNotFound

import com.abogomazov.GlobalStyles.invertedText
import androidx.compose.runtime.Composable
import com.abogomazov.application.content.pageNotFound.style.PageNotFoundStyle.container
import com.abogomazov.application.content.pageNotFound.style.PageNotFoundStyle.pageNotFoundText
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun PageIsUnderConstructionView() {
    Div({
        classes(container)
    }) {
        Span({ classes(pageNotFoundText, invertedText) }) { Text("PAGE_IS_UNDER_CONSTRUCTION") }
    }
}
