package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.component.SectionEntity
import com.abogomazov.component.H4Header
import com.abogomazov.component.RegularText
import com.abogomazov.component.Renderable
import com.abogomazov.property.ProjectProperty

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
            RegularText { description }
        }
    }

}
