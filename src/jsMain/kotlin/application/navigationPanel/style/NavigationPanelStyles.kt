package application.navigationPanel.style

import GlobalStyles
import org.jetbrains.compose.web.css.*

object NavigationPanelStyles : StyleSheet(GlobalStyles) {

    val menuOrientationSwitchWidth = 640.px
    val panelHeight = 80.px

    val navigationBar by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexEnd)
        alignItems(AlignItems.Center)
        height(panelHeight)
        padding(0.px, 40.px)
    }

}
