package com.abogomazov.cv

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.component.Renderable
import com.abogomazov.cv.content.CvContent

class Cv(
    private val menu: CvContainerMenu,
    private val content: CvContent,
) : Renderable {

    @Composable override fun render() {
        ColumnLayout {
            menu.render()
            content.render()
        }
    }

}
