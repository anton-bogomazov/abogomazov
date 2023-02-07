package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.footer.FooterPanel
import com.abogomazov.application.menu.Menu
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable
fun Application() {
    BaseLayout {
        Header { Menu.render() }
        Main { ViewContainer() }
        Footer { FooterPanel.render() }
    }
}

@Composable private fun BaseLayout(content: @Composable () -> Unit) {
    Div({ classes(GlobalStyles.flexColumn) }) { content() }
}

@Composable fun CenteredLayout(content: @Composable () -> Unit) {
    Div({ classes(GlobalStyles.flexCenter) }) {
        Div({ style { paddingBottom(30.vh) } }) { content() }
    }
}
