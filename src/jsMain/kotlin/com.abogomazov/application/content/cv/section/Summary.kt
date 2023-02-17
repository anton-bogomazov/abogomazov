package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.component.Renderable
import com.abogomazov.property.EducationProperty
import com.abogomazov.property.ProjectProperty
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class Summary(
    private val text: String
) : Renderable {

    @Composable override fun render() {
        SectionEntity { Text(text) }.render()
    }

}
