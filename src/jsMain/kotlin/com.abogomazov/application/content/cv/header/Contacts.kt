package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.domain.Icon
import com.abogomazov.component.Renderable
import com.abogomazov.property.cvContent
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

object Contacts : Renderable {

    private const val ICON_SIZE = 12

    @Composable override fun render() {
        Div({
            classes(GlobalStyles.flexRow)

            style {
                justifyContent(JustifyContent.SpaceBetween)
            }
        }) {
            cvContent.contacts.forEach {
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
            private val ICON_PADDING = 6.px
        }

        @Composable fun render() {
            A(href = link, attrs = {
                target(ATarget.Blank)

                classes(GlobalStyles.flexRow)

                style {
                    fontSize(GlobalStyles.smaller)

                    alignItems(AlignItems.Center)
                }
            }) {
                Div({ style { padding(ICON_PADDING) } }) { icon.render() }
                Text(title)
            }
        }

    }

}
