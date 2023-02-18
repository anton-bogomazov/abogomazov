package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.RowLayout
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object CvContainerHeader : Renderable {

    private const val title = "RESUME"

    object Style : StyleSheet(GlobalStyles) {
        val centerAligned by style { alignItems(AlignItems.Center) }
        val centered by style { justifyContent(JustifyContent.SpaceBetween) }
        val ended by style { justifyContent(JustifyContent.FlexEnd) }
        val blackBackground by style { backgroundColor(Color.black) }

        val padded by style { padding(10.px) }
    }

    @Composable
    override fun render() {
        RowLayout(Style.blackBackground, Style.centered, Style.centerAligned, GlobalStyles.nonPrintable) {
            Span({ classes(GlobalStyles.invertedText, Style.padded) }) { Text(title) }
            RowLayout(Style.ended) {
                SaveAsPdfButton.render()
                PrintButton.render()
            }
        }
    }
}
