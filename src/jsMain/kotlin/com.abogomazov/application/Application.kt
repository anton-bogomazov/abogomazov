package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.ViewContainer
import com.abogomazov.application.content.pageNotFound.PageIsUnderConstructionView
import com.abogomazov.application.footer.FooterPanel
import com.abogomazov.application.headerNavigation.Menu
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable
fun Application() {
    PageIsUnderConstructionView()
//    BaseLayout {
//        Header { Menu.render() }
//        Main { ViewContainer() }
//        Footer { FooterPanel.render() }
//    }
}

@Composable
private fun BaseLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
    }) {
        content()
    }
}
