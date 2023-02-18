package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.domain.Icon
import com.abogomazov.component.RegularText
import com.abogomazov.component.Renderable
import com.abogomazov.property.ContactProperty
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A

class Contacts(
    private val contacts: List<ContactProperty>
) : Renderable {

    @Composable override fun render() {
        ColumnLayout(GlobalStyles.spaced) {
            contacts.map {
                Link(it.link, Icon(it.iconPath))
            }.forEach { it.render() }
        }
    }

    private class Link(
        private val link: String,
        private val icon: Icon,
    ) {

        private fun apex() = link.split("(www.)|(mailto:)".toRegex())[1]

        @Composable fun render() {
            A(href = link, attrs = { target(ATarget.Blank) }) {
                RowLayout(GlobalStyles.centerAligned) {
                    icon.render()
                    RegularText(GlobalStyles.monospace) { apex() }
                }
            }
        }

    }

}
