package application.footer.iconsPanel

import androidx.compose.runtime.Composable
import application.footer.style.Footer.icon
import application.footer.style.Footer.iconPanel
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
        SocialMediaLink.values().forEach { SocialIconLink(it) }
    }
}

@Composable
private fun SocialIconLink(link: SocialMediaLink) {
    A(href = link.address, attrs = { target(ATarget.Blank) }) {
        Img(src = link.icon) {
            classes(icon)
        }
    }
}

private enum class SocialMediaLink(val address: String, val icon: String) {
    EMAIL("mailto:abogomazov.dev@gmail.com", "icons/mail.svg"),
    GITHUB("https://github.com/anton-bogomazov", "icons/github.svg"),
    LINKEDIN("https://www.linkedin.com/in/anton-p-bogomazov/", "icons/linkedin.svg"),
    INSTAGRAM("https://instagram.com/so_so_ciable", "icons/instagram.svg"),
    TELEGRAM("https://t.me/antonbogomazov", "icons/telegram.svg")
}
