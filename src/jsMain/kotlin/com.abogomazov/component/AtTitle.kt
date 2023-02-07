package com.abogomazov.component

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class AtTitle(
    private val position: String,
    private val at: String,
    private val period: Pair<String, String>
) : Renderable{

    private val separator = " @ "
    private val periodText = "${period.first} - ${period.first}"

    @Composable override fun render() {
        Div({ style { fontSize(GlobalStyles.medium) } }) {
            Span { Text(position) }
            Span({ style { fontStyle("italic") } }) { Text(separator) }
            Span { Text(at) }
        }
        Span({ style { fontStyle("italic") } }) { Text(periodText) }
    }

}
