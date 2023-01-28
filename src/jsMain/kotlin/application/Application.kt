package application

import application.ApplicationLayoutStyles.baseLayout
import androidx.compose.runtime.Composable
import application.content.ViewContainer
import application.footerPanel.FooterPanel
import application.navigationPanel.NavigationPanel
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer as DomFooter
import org.jetbrains.compose.web.dom.Header as DomHeader
import org.jetbrains.compose.web.dom.Main as DomMain

@Composable
fun Application() {
    BaseLayout {
        Header()
//        Main()
//        Footer()
    }
}

@Composable
private fun BaseLayout(content: @Composable () -> Unit) {
    Div({
        classes(baseLayout)
    }) {
        content()
    }
}

@Composable
private fun Header() {
    DomHeader({ style { ApplicationLayoutStyles.header } }) { NavigationPanel() }
}

@Composable
private fun Main() {
    DomMain({ style { ApplicationLayoutStyles.main } }) { ViewContainer() }
}

@Composable
private fun Footer() {
    DomFooter({ style { ApplicationLayoutStyles.footer } }) { FooterPanel() }
}
