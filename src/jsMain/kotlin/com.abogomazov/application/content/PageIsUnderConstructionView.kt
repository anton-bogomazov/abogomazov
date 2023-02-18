package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.ResponsiveProperties
import com.abogomazov.application.CenteredLayout
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable fun PageIsUnderConstructionView() {
    CenteredLayout {
        Div({
            style { fontSize(ResponsiveProperties.largeScreenText.larger) }
        }) {
            Span({ classes(GlobalStyles.invertedText, GlobalStyles.monospace) }) {
                Text("PAGE_IS_UNDER_CONSTRUCTION")
            }
        }
    }
}
