package com.abogomazov.application

import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.css.*

object ApplicationLayoutStyles : StyleSheet(GlobalStyles) {
    val baseLayout by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
    }

    val header by style { flex(0, 0, 60.px) }

    val main by style { flex(1) }

    val footer by style { flex(0, 0, 60.px) }
}
