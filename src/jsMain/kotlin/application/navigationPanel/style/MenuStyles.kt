package application.navigationPanel.style

import GlobalStyles
import application.navigationPanel.style.NavigationPanelStyles.panelHeight
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white

object MenuStyles : StyleSheet(GlobalStyles) {

    val horizontalMenu by style {
        display(DisplayStyle.Flex)
    }

    val verticalMenu by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.FlexStart)
        alignItems(AlignItems.Center)
        position(Position.Fixed)
        top(panelHeight)
        bottom(0.px)
        right(0.px)
        height(100.vh)
        width(100.vw)
        backgroundColor(white)
    }

    val menuItem by style {
        fontWeight("bold")

        margin(8.px)
        padding(2.px)
    }

}
