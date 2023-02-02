package com.abogomazov.application.content.style

import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.*

object ViewContainerStyles : StyleSheet(GlobalStyles) {

    val viewContainer by style {
        padding(0.px, 20.percent)
    }

}
