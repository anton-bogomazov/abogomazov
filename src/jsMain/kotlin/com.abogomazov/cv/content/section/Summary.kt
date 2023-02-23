package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.cv.component.SectionEntity

class Summary(
    private val text: String
) : Renderable {

    @Composable override fun render() {
        SectionEntity { RegularText { text } }
    }

}
