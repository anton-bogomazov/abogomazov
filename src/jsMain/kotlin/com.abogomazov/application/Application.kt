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
            classes(GlobalStyles.nonPrintable)
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
        Footer({
            classes(GlobalStyles.nonPrintable)
            style {
                position(Position.Fixed)
                bottom(0.px)
                left(0.px)

                width(100.percent)
            }
        }) {
            FooterPanel.render()
        }
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

@Composable fun ColumnLayout(vararg classes: String, content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexColumn)
        classes.forEach { classes(it) }
    }) {
        content()
    }
}

@Composable fun RowLayout(vararg classes: String, content: @Composable () -> Unit) {
    Div({
        classes(GlobalStyles.flexRow)
        classes.forEach { classes(it) }
    }) {
        content()
    }
}

@Composable fun WithClass(cssClass: String, content: @Composable () -> Unit) {
    Div({ classes(cssClass) }) {
        content()
    }
}
