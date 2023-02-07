package com.abogomazov.component

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class H2Header(private val text: String) : Renderable {

    @Composable override fun render() {
        Span({ style { fontSize(GlobalStyles.large) } }) { Text(text) }
    }

}
