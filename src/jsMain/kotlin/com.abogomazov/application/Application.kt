package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.pageNotFound.PageIsUnderConstructionView
import org.jetbrains.compose.web.dom.Div

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
