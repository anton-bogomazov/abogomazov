package com.abogomazov

import com.abogomazov.application.Application
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {
    runApplication()
}

private fun runApplication() {
    renderComposable(rootElementId = "root") {
        Style(GlobalStyles)

        Application()
    }
}
