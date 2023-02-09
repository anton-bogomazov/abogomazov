package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.AtTitle
import com.abogomazov.component.Renderable
import com.abogomazov.property.ExperienceProperty
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingRight
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
    private val padding = 8.px

    private val title = AtTitle(position, companyName, period)

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
        Div({
            classes(GlobalStyles.flexColumn)

            style {
                paddingTop(padding)
            }
        }) {
            title.render()
            Ul({
                classes(GlobalStyles.list)

                style {
                    paddingTop(4.px)
                    paddingRight(20.px)
                }
            }) {
                achievements.forEach { achievement ->
                    Li { Text(achievement) }
                }
            }
        }
    }

}
