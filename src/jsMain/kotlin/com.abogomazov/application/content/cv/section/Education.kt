package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.component.SectionEntity
import com.abogomazov.component.AtTitle
import com.abogomazov.component.Renderable
import com.abogomazov.component.UnorderedList
import com.abogomazov.property.EducationProperty

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
            UnorderedList(listOf(description)).render()
        }
    }

}
