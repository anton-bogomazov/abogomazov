package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.WindowContext
import com.abogomazov.component.Renderable
import org.jetbrains.compose.web.attributes.download
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text

open class CvButton(
    private val text: String,
    private val href: String
) : Renderable {

    @Composable
    override fun render() {
        A(href = href, attrs = {
            download("file")

            classes(GlobalStyles.nonPrintable, GlobalStyles.invertedText, CvContainerHeader.Style.padded)
        }) { Text(text) }
    }

}

object SaveAsPdfButton : CvButton("Save As PDF", "/contacts.json")
object PrintButton : CvButton("Print", "javascript:window.print();")
