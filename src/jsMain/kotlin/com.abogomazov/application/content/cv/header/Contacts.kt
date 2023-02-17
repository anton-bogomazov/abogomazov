package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.domain.Icon
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object Contacts : Renderable {

    private const val ICON_SIZE = 16

    object Style : StyleSheet(GlobalStyles) {
        val spaced by style { justifyContent(JustifyContent.SpaceBetween) }
        val centerAligned by style { alignItems(AlignItems.Center) }
    }

    @Composable override fun render() {
        ColumnLayout(Style.spaced) {
            PropertyContext.contacts.web
                .filter { !it.ignore }
                .forEach {
                    Link(it.link, it.title, Icon(ICON_SIZE, it.iconPath)).render()
                }
        }
    }

    private class Link(
        private val link: String,
        private val title: String,
        private val icon: Icon,
    ) {

        companion object {
            private val ICON_PADDING = 8.px
        }

        private fun apex() = link.split("(www.)|(mailto:)".toRegex())[1]

        @Composable fun render() {
            A(href = link, attrs = { target(ATarget.Blank) }) {
                RowLayout(Style.centerAligned) {
                    Div({
                        style {
                            paddingRight(ICON_PADDING)

                            height(icon.size.px)
                            width(icon.size.px)
                        }
                    }) {
                        icon.render()
                    }

                    Span({
                        classes(GlobalStyles.monospace)

                        style { fontSize(16.px) }
                    }) {
                        Text(apex())
                    }
                }
            }
        }

    }

}
