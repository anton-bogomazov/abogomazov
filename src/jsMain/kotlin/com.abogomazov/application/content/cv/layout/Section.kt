package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.component.H2Header
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

class Section(
    private val title: String,
    private val entities: Iterable<Renderable>,
    private val isFirst: Boolean = false // fixme bad desigg
) : Renderable {

    inner class Style : StyleSheet(GlobalStyles) {
        val paddingTop = if (isFirst) 0.px else 30.px

        val topPadded by style { paddingTop(paddingTop) }
    }

    @Composable override fun render() {
        ColumnLayout(Style().topPadded) {
            H2Header(title).render()
            entities.forEach { it.render() }
        }
    }

}

class SectionEntity(
    private val title: Renderable? = null,
    private val content: @Composable () -> Unit
) : Renderable {

    @Composable override fun render() {
        Div({
            classes(GlobalStyles.flexColumn)
            style {
                paddingTop(10.px)
            }
        }) {
            title?.render()
            content()
        }
    }

}

@Composable fun UnorderedList(elements: List<String>) {
    Ul({
        classes(GlobalStyles.list)

        style { paddingTop(4.px) }
    }) {
        elements.forEach { Li { Text(it) } }
    }
}
