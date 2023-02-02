package com.abogomazov.application.footerPanel

import androidx.compose.runtime.Composable
import com.abogomazov.application.footerPanel.iconsPanel.SocialMediaIconPanel
import com.abogomazov.application.footerPanel.style.FooterPanelStyles.footerPanel
import org.jetbrains.compose.web.dom.*

@Composable
fun FooterPanel() {
    Div({
        classes(footerPanel)
    }) {
        SocialMediaIconPanel()
        Text(COPYRIGHT_TEXT)
    }
}
