package com.abogomazov.application.domain

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

data class Icon(
    val size: Int,
    val path: String
) {
    @Composable fun render() {
        Img(src = path) {
            style {
                height(size.px)
                width(size.px)
            }
        }
    }
}
