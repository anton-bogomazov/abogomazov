package com.abogomazov.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.listStyleType
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

class UnorderedList(
    private val elements: List<String>
) : Renderable {

    @Composable override fun render() {
        Ul({
            style {
                listStyleType("circle")
                property("padding-inline-start", 20.px)
                paddingTop(4.px)
            }
        }) {
            elements.forEach { Li { Text(it) } }
        }
    }

}
