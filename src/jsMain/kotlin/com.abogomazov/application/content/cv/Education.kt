package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.AtTitle
import com.abogomazov.component.Renderable
import com.abogomazov.property.EducationProperty
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

class Education(
    private val program: String,
    private val university: String,
    private val description: String,
    private val period: Pair<String, String>
) : Renderable {

    private val padding = 10.px

    private val title = AtTitle(program, university, period)

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
        Div({
            classes(GlobalStyles.flexColumn)
            style {
                padding(padding)
            }
        }) { title.render() }
    }

}
