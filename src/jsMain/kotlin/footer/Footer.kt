package footer

import androidx.compose.runtime.Composable
import footer.iconsPanel.SocialMediaIconPanel
import footer.style.Footer.footerBar
import org.jetbrains.compose.web.dom.*

@Composable
fun Footer() {
    Div({
        classes(footerBar)
    }) {
        SocialMediaIconPanel()
        Text("© 2023 Anton Bogomazov")
    }
}
