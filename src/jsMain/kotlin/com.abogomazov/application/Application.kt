package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.ViewContainer
import com.abogomazov.application.footerPanel.FooterPanel
import com.abogomazov.application.navigationPanel.NavigationPanel
import org.jetbrains.compose.web.css.flex
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable
fun Application() {
    BaseLayout {
        Header({ style { flex(0, 0) } }) { NavigationPanel.render() }
        Main({ style { flex(1) } }) { ViewContainer() }
        Footer({ style { flex(0, 0) } }) { FooterPanel.render() }
    }
}

@Composable
private fun BaseLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
    }) {
        content()
    }
}
