package com.abogomazov.app.chassis

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.IconStyle
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.app.style.TextStyle
import com.abogomazov.property.ContactProperty
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Img

class FooterPanel(
    private val contacts: List<ContactProperty>,
    private val copyrightText: String,
) {

    @Composable fun render() {
        ColumnLayout(ChassisStyles.panel, LayoutStyle.centerAligned, LayoutStyle.centered) {
            SocialMediaIconsPanel(contacts).render()
            RegularText(TextStyle.small) { copyrightText }
        }
    }

    private class SocialMediaIconsPanel(
        private val contacts: List<ContactProperty>
    ) {

        @Composable fun render() {
            RowLayout {
                contacts.map { IconLink(it.link, it.iconPath).render() }
            }
        }

        private class IconLink(
            private val link: String,
            private val path: String,
        ) {
            @Composable fun render() {
                A(href = link, attrs = {
                    target(ATarget.Blank)
                }) {
                    Img(src = path) { classes(IconStyle.footerContact) }
                }
            }
        }

    }

}
