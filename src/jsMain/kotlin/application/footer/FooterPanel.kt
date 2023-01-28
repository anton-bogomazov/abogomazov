package application.footer

import androidx.compose.runtime.Composable
import application.footer.iconsPanel.SocialMediaIconPanel
import application.footer.style.FooterPanelStyles.footerPanel
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
