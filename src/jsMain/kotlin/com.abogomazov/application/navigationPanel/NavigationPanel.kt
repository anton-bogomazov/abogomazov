package com.abogomazov.application.navigationPanel

import androidx.compose.runtime.Composable
import com.abogomazov.application.ApplicationLayoutStyles
import org.jetbrains.compose.web.dom.Div

object NavigationPanel {

    @Composable fun render() {
        Div({
            classes(ApplicationLayoutStyles.panel)
        }) {
            Menu.render()
        }
    }

}
