package com.abogomazov.application.footerPanel

import androidx.compose.runtime.Composable
import com.abogomazov.application.socialMediaLink.Icon
import com.abogomazov.application.socialMediaLink.SocialMediaProperties
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Div

object SocialMediaIconsPanel {

    private const val ICON_SIZE = 24

    @Composable fun render() {
        Div({ style { display(DisplayStyle.Flex) } }) {
            SocialMediaProperties.values()
                .map { IconLink(it.uri, Icon(ICON_SIZE, it.iconPath)).render() }
        }
    }

}
