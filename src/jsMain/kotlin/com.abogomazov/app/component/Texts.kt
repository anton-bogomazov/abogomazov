package com.abogomazov.app.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable fun RegularText(vararg classes: String, text: () -> String) {
    Span({
        classes.forEach { classes(it) }
    }) {
        Text(text())
    }
}
