package com.abogomazov.component

import androidx.compose.runtime.Composable
import com.abogomazov.application.ResponsiveStyle
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text


@Composable fun RegularText(vararg classes: String, text: () -> String) {
    Span({
        classes(ResponsiveStyle.mediumText)

        classes.forEach { classes(it) }
    }) {
        Text(text())
    }
}
