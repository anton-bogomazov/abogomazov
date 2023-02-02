package com.abogomazov.application.navigationPanel

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import org.jetbrains.compose.web.dom.Div

object NavigationPanel {

    @Composable fun render() {
        Div({
            classes(GlobalStyles.panel)
        }) {
            Menu.render()
        }
    }

}
