package application.footer.style

import GlobalStyles
import application.ApplicationLayoutStyles
import org.jetbrains.compose.web.css.*

object FooterPanelStyles : StyleSheet(GlobalStyles) {

    private val ICON_SIZE = 24.px
    private val ICON_PADDING = 6.px

    private val ICON_LINK_SIZE = ICON_SIZE + ICON_PADDING * 2

    val icon by style {
        height(ICON_SIZE)
        width(ICON_SIZE)

        padding(ICON_PADDING)
    }

    val iconLink by style {
        height(ICON_LINK_SIZE)
        width(ICON_LINK_SIZE)
    }

    val iconPanel by style {
        display(DisplayStyle.Flex)
    }

    val footerPanel by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
    }

}
