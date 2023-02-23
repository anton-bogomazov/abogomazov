package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.AtTitle
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.UnorderedList
import com.abogomazov.cv.component.SectionEntity
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
