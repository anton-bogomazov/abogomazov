package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.component.H4Header
import com.abogomazov.component.Renderable
import com.abogomazov.property.SkillProperty
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
        SectionEntity(H4Header(category)) {
            Span {
                items.forEachIndexed { index, item ->
                    Text(item)
                    if (index != items.lastIndex) {
                        Text(", ")
                    }
                }
            }
        }.render()
    }

}
