package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.application.content.cv.layout.UnorderedList
import com.abogomazov.component.AtTitle
import com.abogomazov.component.Renderable
import com.abogomazov.property.EducationProperty
import org.jetbrains.compose.web.css.paddingLeft
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

class Education(
    private val program: String,
    private val university: String,
    private val description: String,
    private val period: Pair<String, String>
) : Renderable {

    companion object {
        fun from(property: List<EducationProperty>) =
            property.map {
                    Education(
                        program = it.program,
                        university = it.university,
                        description = it.description,
                        period = it.dateFrom to it.dateTo
                    )
                }
    }

    @Composable override fun render() {
        SectionEntity(AtTitle(program, university, period)) {
            UnorderedList(listOf(description))
        }.render()
    }

}
