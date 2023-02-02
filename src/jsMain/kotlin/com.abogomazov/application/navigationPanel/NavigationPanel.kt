package com.abogomazov.application.navigationPanel

import com.abogomazov.GlobalStyles
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Nav

object NavigationPanel {

    private val SIDE_PADDING = 40.px

    @Composable
    fun render() {
        Nav({
            style {
                height(GlobalStyles.PANEL_HEIGHT)
                paddingLeft(SIDE_PADDING)
                paddingRight(SIDE_PADDING)
            }
        }) {
            Menu.render()
        }
    }

}
