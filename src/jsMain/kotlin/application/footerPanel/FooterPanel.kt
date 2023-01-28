package application.footerPanel

import androidx.compose.runtime.Composable
import application.footerPanel.iconsPanel.SocialMediaIconPanel
import application.footerPanel.style.FooterPanelStyles.footerPanel
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
