package footer.iconsPanel

import androidx.compose.runtime.Composable
import footer.style.Footer.icon
import footer.style.Footer.iconPanel
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun SocialMediaIconPanel() {
    Div({
        classes(iconPanel)
    }) {
        SocialMediaLink.values().forEach { SocialIconLink(it) }
    }
}

@Composable
private fun SocialIconLink(link: SocialMediaLink) {
    A(href = link.address) {
        Img(src = link.icon) {
            classes(icon)
        }
    }
}

private enum class SocialMediaLink(val address: String, val icon: String) {
    EMAIL("", "icons/mail.svg"),
    GITHUB("", "icons/github.svg"),
    LINKEDIN("", "icons/linkedin.svg"),
    INSTAGRAM("", "icons/instagram.svg"),
    TELEGRAM("", "icons/telegram.svg")
}
