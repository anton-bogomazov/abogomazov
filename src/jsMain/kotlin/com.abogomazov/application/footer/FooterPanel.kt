package com.abogomazov.application.footer

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.ResponsiveProperties
import com.abogomazov.application.ApplicationLayoutStyles
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

object FooterPanel {

    private const val COPYRIGHT_TEXT = "${Typography.copyright} 2023 Anton Bogomazov"

    @Composable fun render() {
        Div({
            classes(ApplicationLayoutStyles.panel, GlobalStyles.flexColumn)
            style {
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)

                fontSize(ResponsiveProperties.largeScreenText.smaller)
            }
        }) {
            SocialMediaIconsPanel.render()
            Text(COPYRIGHT_TEXT)
        }
    }

}
