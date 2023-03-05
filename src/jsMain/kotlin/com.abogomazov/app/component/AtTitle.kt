package com.abogomazov.app.component

import androidx.compose.runtime.Composable
import com.abogomazov.app.style.TextStyle
import org.jetbrains.compose.web.dom.Div

class AtTitle(
    private val position: String,
    private val at: String,
    private val period: Pair<String, String>
) : Renderable {

    private val separator = " @ "
    private val periodText = "${period.first} - ${period.second}"

    @Composable override fun render() {
        Div({ classes(TextStyle.medium) }) {
            RegularText(TextStyle.bold) { position }
            RegularText(TextStyle.lessBold) { separator }
            RegularText(TextStyle.lessBold) { at }
        }
        RegularText(TextStyle.medium, TextStyle.monospace) { periodText }
    }

}
