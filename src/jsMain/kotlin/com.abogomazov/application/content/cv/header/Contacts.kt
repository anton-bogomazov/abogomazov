package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.domain.Icon
import com.abogomazov.component.LinkText
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A

object Contacts : Renderable {

    @Composable override fun render() {
        ColumnLayout(GlobalStyles.spaced) {
            PropertyContext.contacts.web
                .filter { !it.ignore }
                .forEach {
                    Link(it.link, it.title, Icon(it.iconPath)).render()
                }
        }
    }

    private class Link(
        private val link: String,
        private val title: String,
        private val icon: Icon,
    ) {

        private fun apex() = link.split("(www.)|(mailto:)".toRegex())[1]

        @Composable fun render() {
            A(href = link, attrs = { target(ATarget.Blank) }) {
                RowLayout(GlobalStyles.centerAligned) {
                    icon.render()
                    LinkText(apex()).render()
                }
            }
        }

    }

}
