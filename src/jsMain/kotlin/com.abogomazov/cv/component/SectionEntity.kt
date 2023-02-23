package com.abogomazov.cv.component

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.style.ResponsiveStyle
import com.abogomazov.app.style.TextStyle
import org.jetbrains.compose.web.dom.Div

@Composable fun SectionEntity(title: Renderable? = null, content: @Composable () -> Unit) {
    ColumnLayout(ResponsiveStyle.cvSectionEntityPadding) {
        title?.render()
        Div({ classes(TextStyle.medium) }) {
            content()
        }
    }
}
