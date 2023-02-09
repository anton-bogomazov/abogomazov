package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import com.abogomazov.property.SkillProperty
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class Skill(
    private val category: String,
    private val items: List<String>
) : Renderable {

    companion object {
        fun from(property: List<SkillProperty>) =
            property.map { Skill(category = it.category, items = it.items) }
    }

    @Composable override fun render() {
        Div({
            classes(GlobalStyles.flexColumn)

            style { paddingTop(4.px) }
        }) {
            Div { Span({ style { fontSize(GlobalStyles.medium) } }) { Text(category) } }
            Span({ style { fontStyle("italic") } }) {
                items.forEach {
                    Text(it)
                    Text(", ")
                }
            }
        }
    }

}
