package application.footer

import androidx.compose.runtime.Composable
import application.footer.iconsPanel.SocialMediaIconPanel
import application.footer.style.Footer.footerBar
import org.jetbrains.compose.web.dom.*

@Composable
fun FooterContent() {
    Div({
        classes(footerBar)
    }) {
        SocialMediaIconPanel()
        Text("© 2023 Anton Bogomazov")
    }
}
