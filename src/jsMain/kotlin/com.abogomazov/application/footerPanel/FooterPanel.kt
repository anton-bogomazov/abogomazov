package com.abogomazov.application.footerPanel

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles.flexColumn
import com.abogomazov.GlobalStyles.panel
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

object FooterPanel {

    private const val COPYRIGHT_TEXT = "${Typography.copyright} 2023 Anton Bogomazov"

    @Composable fun render() {
        Div({
            classes(panel, flexColumn)
            style { justifyContent(JustifyContent.Center) }
        }) {
            SocialMediaIconsPanel.render()
            Text(COPYRIGHT_TEXT)
        }
    }

}
