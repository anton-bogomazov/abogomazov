package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.WindowContext
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text

object SaveButton {

    private const val buttonText = "Print"

    @Composable fun render() {
        Button({
            classes(GlobalStyles.nonPrintable, GlobalStyles.invertedText)
            style {
                property("border", "none")
                fontSize(GlobalStyles.medium)
            }
            onClick { WindowContext.print() }
        }) {
            Text(buttonText)
        }
    }

}
