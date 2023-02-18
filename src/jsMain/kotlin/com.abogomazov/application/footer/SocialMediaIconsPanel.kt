package com.abogomazov.application.footer

import androidx.compose.runtime.Composable
import com.abogomazov.application.ResponsiveStyle
import com.abogomazov.application.RowLayout
import com.abogomazov.application.domain.Icon
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A

object SocialMediaIconsPanel {

    @Composable fun render() {
        RowLayout {
            PropertyContext.contacts.web
                .map { IconLink(it.link, Icon(it.iconPath)).render() }
        }
    }

    private class IconLink(
        private val link: String,
        private val icon: Icon,
    ) {

        @Composable fun render() {
            A(href = link, attrs = {
                target(ATarget.Blank)
                classes(ResponsiveStyle.footerContactIcon)
            }) { icon.render() }
        }

    }

}
