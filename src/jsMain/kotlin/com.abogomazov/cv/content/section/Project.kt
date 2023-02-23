package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.H4Header
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.cv.component.SectionEntity
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
