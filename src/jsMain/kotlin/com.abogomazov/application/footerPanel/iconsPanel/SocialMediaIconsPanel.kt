package com.abogomazov.application.footerPanel.iconsPanel

import androidx.compose.runtime.Composable
import com.abogomazov.application.footerPanel.style.FooterPanelStyles.icon
import com.abogomazov.application.footerPanel.style.FooterPanelStyles.iconLink
import com.abogomazov.application.footerPanel.style.FooterPanelStyles.iconPanel
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun SocialMediaIconPanel() {
    Div({
        classes(iconPanel)
    }) {
        SocialMediaLink.values().forEach { SocialMediaIconLink(it) }
    }
}

@Composable
private fun SocialMediaIconLink(link: SocialMediaLink) {
    A(href = link.address, attrs = {
        classes(iconLink)
        target(ATarget.Blank)
    }) {
        Img(src = link.iconPath) { classes(icon) }
    }
}

private enum class SocialMediaLink(val address: String, val iconPath: String) {
    EMAIL(EMAIL_LINK, EMAIL_ICON_PATH),
    GITHUB(GITHUB_LINK, GITHUB_ICON_PATH),
    LINKEDIN(LINKEDIN_LINK, LINKEDIN_ICON_PATH),
    INSTAGRAM(INSTAGRAM_LINK, INSTAGRAM_ICON_PATH),
    TELEGRAM(TELEGRAM_LINK, TELEGRAM_ICON_PATH)
}
