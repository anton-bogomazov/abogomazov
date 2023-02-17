package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class FullnamePositionHeader(
    private val fullname: String,
    private val position: String
) : Renderable {

    @Composable override fun render() {
        ColumnLayout {
            Span({
                classes(GlobalStyles.monospace, GlobalStyles.invertedText)
                style { fontSize(GlobalStyles.largest)}
            }) { Text(fullname) }
            Span({
                style {
                    fontSize(GlobalStyles.larger)
                } }) { Text(position) }
        }
    }
}
