package com.abogomazov.component

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class H2Header(private val text: String) : Renderable {

    private val padding = 10.px

    @Composable override fun render() {
        Span({
            style {
                fontSize(GlobalStyles.large)

                paddingTop(padding)
            }
        }) { Text(text) }
    }

}
