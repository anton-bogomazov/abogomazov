package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import com.abogomazov.property.EducationProperty
import com.abogomazov.property.ProjectProperty
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.dom.Div
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

    // todo extract to component. Same for Language
    @Composable override fun render() {
        Div({ classes(GlobalStyles.flexColumn) }) {
            Span({ style { fontSize(GlobalStyles.medium) } }) { Text(name) }
            Span({ style { fontStyle("italic") } }) { Text(description) }
        }
    }

}
