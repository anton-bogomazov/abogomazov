package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.H4Header
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.cv.component.SectionEntity
import com.abogomazov.property.SkillProperty

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
            items.forEachIndexed { index, item ->
                RegularText { item }
                if (index != items.lastIndex) {
                    RegularText { ", " }
                }
            }
        }
    }

}
