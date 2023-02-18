package com.abogomazov.application.content.cv.component

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.ResponsiveStyle
import com.abogomazov.component.H3Header
import com.abogomazov.component.Renderable

class Section(
    private val title: String,
    private val entities: Iterable<Renderable>,
) : Renderable {

    @Composable
    override fun render() {
        ColumnLayout(ResponsiveStyle.cvSectionPadding) {
            H3Header(title).render()
            entities.forEach { it.render() }
        }
    }

}
