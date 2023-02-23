package com.abogomazov.cv.content.header

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.IconStyle
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.app.style.TextStyle
import com.abogomazov.property.ContactProperty
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Img

class CvContacts(
    private val contacts: List<ContactProperty>
) : Renderable {

    @Composable override fun render() {
        ColumnLayout(LayoutStyle.spaced) {
            contacts.map {
                Link(it.link, it.iconPath)
            }.forEach { it.render() }
        }
    }

    private class Link(
        private val link: String,
        private val path: String,
    ) {

        private fun apex() = link.split("(www.)|(mailto:)".toRegex())[1]

        @Composable fun render() {
            A(href = link, attrs = { target(ATarget.Blank) }) {
                RowLayout(LayoutStyle.centerAligned) {
                    Img(src = path) { classes(IconStyle.cvContact) }
                    RegularText(TextStyle.medium, TextStyle.monospace) { apex() }
                }
            }
        }

    }

}
