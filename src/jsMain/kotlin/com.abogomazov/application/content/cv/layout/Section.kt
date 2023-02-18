package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.ResponsiveStyle
import com.abogomazov.component.H3Header
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

class Section(
    private val title: String,
    private val entities: Iterable<Renderable>,
    private val isFirst: Boolean = false // fixme bad design
) : Renderable {

    @Composable override fun render() {
        ColumnLayout(ResponsiveStyle.cvSectionPadding) {
            H3Header(title).render()
            entities.forEach { it.render() }
        }
    }

}

class SectionEntity(
    private val title: Renderable? = null,
    private val content: @Composable () -> Unit
) : Renderable {

    @Composable override fun render() {
        ColumnLayout(ResponsiveStyle.cvSectionEntityPadding) {
            title?.render()
            Span({ classes(ResponsiveStyle.mediumText) }) {
                content()
            }
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
