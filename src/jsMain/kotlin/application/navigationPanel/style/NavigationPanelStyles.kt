package application.navigationPanel.style

import application.ApplicationLayoutStyles
import org.jetbrains.compose.web.css.*

object NavigationPanelStyles : StyleSheet(ApplicationLayoutStyles) {

    // todo unused now. maybe that should be in menu styles. Decide after implementing vertical menu
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
