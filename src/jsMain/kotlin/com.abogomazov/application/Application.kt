package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.application.ApplicationLayoutStyles.baseLayout
import com.abogomazov.application.content.ViewContainer
import com.abogomazov.application.footerPanel.FooterPanel
import com.abogomazov.application.navigationPanel.NavigationPanel
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer as DomFooter
import org.jetbrains.compose.web.dom.Header as DomHeader
import org.jetbrains.compose.web.dom.Main as DomMain

@Composable
fun Application() {
    BaseLayout {
        Header()
        Main()
        Footer()
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
    DomHeader({ style { ApplicationLayoutStyles.header } }) { NavigationPanel.render() }
}

@Composable
private fun Main() {
    DomMain({ style { ApplicationLayoutStyles.main } }) { ViewContainer() }
}

@Composable
private fun Footer() {
    DomFooter({ style { ApplicationLayoutStyles.footer } }) { FooterPanel() }
}
