package com.abogomazov.app

import com.abogomazov.app.chassis.Application
import com.abogomazov.app.style.GlobalStyle
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {
    runApplication()
}

private fun runApplication() {
    renderComposable(rootElementId = "root") {
        Style(GlobalStyle)

        Application()
    }
}
