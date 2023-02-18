package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.component.SectionEntity
import com.abogomazov.component.RegularText
import com.abogomazov.component.Renderable

class Summary(
    private val text: String
) : Renderable {

    @Composable override fun render() {
        SectionEntity { RegularText { text } }
    }

}
