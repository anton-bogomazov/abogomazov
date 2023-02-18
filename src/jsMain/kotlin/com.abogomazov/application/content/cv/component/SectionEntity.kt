package com.abogomazov.application.content.cv.component

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.ResponsiveStyle
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.dom.Div

@Composable fun SectionEntity(title: Renderable? = null, content: @Composable () -> Unit) {
    ColumnLayout(ResponsiveStyle.cvSectionEntityPadding) {
        title?.render()
        Div({ classes(ResponsiveStyle.mediumText) }) {
            content()
        }
    }
}
