package com.abogomazov.app.component

import androidx.compose.runtime.Composable
import com.abogomazov.app.style.TextStyle
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

open class AbstractHeader(
    private val text: String,
    private val classes: Array<String>,
) : Renderable {

    @Composable override fun render() {
        Span({
            classes.forEach { classes(it) }
        }) {
            Text(text)
        }
    }

}

class H1Header(text: String) : AbstractHeader(text, arrayOf(TextStyle.largest, TextStyle.monospace, TextStyle.inverted))
class H2Header(text: String) : AbstractHeader(text, arrayOf(TextStyle.larger))
class H3Header(text: String) : AbstractHeader(text, arrayOf(TextStyle.large, TextStyle.monospace))
class H4Header(text: String) : AbstractHeader(text, arrayOf(TextStyle.medium, TextStyle.lessBold))
