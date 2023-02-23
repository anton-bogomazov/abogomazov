package com.abogomazov.cv

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.GlobalStyle
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.app.style.TextStyle
import org.jetbrains.compose.web.attributes.download
import org.jetbrains.compose.web.dom.A

class CvContainerMenu : Renderable {

    companion object {
        private val printCommand = "javascript:window.print();"
        private val cvFilename = "Anton Bogomazov - CV"

        private object SaveAsPdfButton : CvButton("Save As PDF", "cv.pdf")
        private object PrintButton : CvButton("Print", printCommand)

        private open class CvButton(
            private val text: String,
            private val href: String
        ) : Renderable {

            @Composable override fun render() {
                A(href = href, attrs = {
                    if (href != printCommand) download(cvFilename)
                }) {
                    RegularText(TextStyle.monospace, TextStyle.inverted, GlobalStyle.padded) {
                        text
                    }
                }
            }

        }
    }

    @Composable override fun render() {
        RowLayout(GlobalStyle.blackBackground, LayoutStyle.spaced, LayoutStyle.centerAligned, LayoutStyle.nonPrintable) {
            RegularText(TextStyle.inverted, GlobalStyle.padded) { "RESUME" }
            RowLayout(LayoutStyle.ended) {
                SaveAsPdfButton.render()
                PrintButton.render()
            }
        }
    }

}
