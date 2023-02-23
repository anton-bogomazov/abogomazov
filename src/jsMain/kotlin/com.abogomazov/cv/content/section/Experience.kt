package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.AtTitle
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.UnorderedList
import com.abogomazov.cv.component.SectionEntity
import com.abogomazov.property.ExperienceProperty

class Experience(
    private val position: String,
    private val companyName: String,
    private val companyDescription: String,
    private val period: Pair<String, String>,
    private val achievements: List<String>
) : Renderable {

    companion object {
        fun from(property: List<ExperienceProperty>) =
            property.map {
                    Experience(
                        position = it.title,
                        companyName = it.company,
                        companyDescription = it.description,
                        period = it.dateFrom to it.dateTo,
                        achievements = it.content
                    )
                }
    }

    @Composable override fun render() {
        SectionEntity(AtTitle(position, companyName, period)) {
            UnorderedList(achievements).render()
        }
    }

}
