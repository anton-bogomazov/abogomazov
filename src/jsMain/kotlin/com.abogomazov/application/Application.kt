package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.domain.Category
import com.abogomazov.application.footer.FooterPanel
import com.abogomazov.application.menu.Menu
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable
fun Application() {
    BaseLayout {
        Header({
            style {
                position(Position.Fixed)
                top(0.px)
                left(0.px)

                width(100.percent)
            }
        }) {
            Menu(Category.categories()).render()
        }
        Main { ViewContainer() }
        Footer { FooterPanel.render() }
    }
}

@Composable private fun BaseLayout(content: @Composable () -> Unit) {
    Div({ classes(GlobalStyles.flexColumn) }) { content() }
}

@Composable fun CenteredLayout(content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexCenter)
        style { height(auto) }
    }) {
        content()
    }
}
