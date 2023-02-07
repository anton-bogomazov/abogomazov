package com.abogomazov.application.content.cv.layout

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.H2Header
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

class Section(
    private val title: String,
    private val entities: Iterable<Renderable>
) : Renderable {

    private val padding = 8.px

    @Composable override fun render() {
        Div({
            classes(GlobalStyles.flexColumn)

            style { padding(padding) }
        }) {
            H2Header(title).render()
            entities.forEach { it.render() }
        }
    }

}
