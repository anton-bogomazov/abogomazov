package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.component.H4Header
import com.abogomazov.component.Renderable
import com.abogomazov.property.ProjectProperty
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class Project(
    private val name: String,
    private val description: String
) : Renderable {

    companion object {
        fun from(property: List<ProjectProperty>) =
            property.map {
                Project(
                    name = it.name,
                    description = it.description,
                )
            }
    }

    @Composable override fun render() {
        SectionEntity(H4Header(name)) {
            Span { Text(description) }
        }.render()
    }

}
