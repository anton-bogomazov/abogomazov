package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.RowLayout
import com.abogomazov.component.RegularText
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.attributes.download
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A

object CvContainerMenu : Renderable {

    private object Style : StyleSheet(GlobalStyles) {
        val blackBackground by style { backgroundColor(Color.black) }
        val padded by style { padding(10.px) }
    }

    @Composable
    override fun render() {
        RowLayout(Style.blackBackground, GlobalStyles.spaced, GlobalStyles.centerAligned, GlobalStyles.nonPrintable) {
            RegularText(GlobalStyles.invertedText, Style.padded) { "RESUME" }
            RowLayout(GlobalStyles.ended) {
                SaveAsPdfButton.render()
                PrintButton.render()
            }
        }
    }

    private object SaveAsPdfButton : CvButton("Save As PDF", "cv.pdf")
    private object PrintButton : CvButton("Print", "javascript:window.print();")

    private open class CvButton(
        private val text: String,
        private val href: String
    ) : Renderable {

        @Composable override fun render() {
            A(href = href, attrs = { download("Anton Bogomazov - CV") }) {
                RegularText(GlobalStyles.monospace, GlobalStyles.invertedText, Style.padded) { text }
            }
        }

    }
}
