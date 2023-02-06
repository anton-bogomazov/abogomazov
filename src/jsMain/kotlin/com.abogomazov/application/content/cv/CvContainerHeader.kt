package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object CvContainerHeader : Renderable {

    private const val title = "RESUME"

    @Composable
    override fun render() {
        Div({
            classes(GlobalStyles.flexRow)

            style {
                justifyContent(JustifyContent.SpaceBetween)
                alignItems(AlignItems.Center)

                backgroundColor(Color.black)
            }
        }) {
            Span({ classes(GlobalStyles.invertedText) }) { Text(title) }
            SaveButton.render()
        }
    }
}
