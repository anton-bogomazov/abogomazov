package com.abogomazov.cv.component

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.component.H3Header
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.style.ResponsiveStyle

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
