package com.abogomazov.application.footer

import androidx.compose.runtime.Composable
import com.abogomazov.application.socialMediaLink.Icon
import com.abogomazov.application.socialMediaLink.SocialMediaProperties
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div

object SocialMediaIconsPanel {

    private const val ICON_SIZE = 24

    @Composable fun render() {
        Div({ style { display(DisplayStyle.Flex) } }) {
            SocialMediaProperties.values()
                .map { IconLink(it.uri, Icon(ICON_SIZE, it.iconPath)).render() }
        }
    }

    private class IconLink(
        private val link: String,
        private val icon: Icon,
    ) {

        companion object {
            private val ICON_PADDING = 6.px
        }

        @Composable fun render() {
            A(href = link, attrs = {
                target(ATarget.Blank)
                style { padding(ICON_PADDING) }
            }) { icon.render() }
        }

    }

}