package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.application.content.cv.layout.UnorderedList
import com.abogomazov.component.AtTitle
import com.abogomazov.component.Renderable
import com.abogomazov.property.ExperienceProperty
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

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
            UnorderedList(achievements)
        }.render()
    }

}
