package com.abogomazov.application.domain

import androidx.compose.runtime.Composable
import com.abogomazov.application.ResponsiveStyle
import org.jetbrains.compose.web.dom.Img

data class Icon(
    val path: String
) {
    @Composable fun render() {
        Img(src = path) { classes(ResponsiveStyle.cvContactIcon) }
    }
}
