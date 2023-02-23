package com.abogomazov.app.component

import androidx.compose.runtime.Composable
import com.abogomazov.app.style.LayoutStyle
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div


@Composable fun CenteredLayout(content: @Composable () -> Unit) {
    Div({
        style {
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
            flexDirection(FlexDirection.Column)

            height(auto)
        }
    }) {
        content()
    }
}

@Composable fun ColumnLayout(vararg classes: String, content: @Composable () -> Unit) {
    Div({
        classes(LayoutStyle.flexColumn)
        classes.forEach { classes(it) }
    }) {
        content()
    }
}

@Composable fun RowLayout(vararg classes: String, content: @Composable () -> Unit) {
    Div({
        classes(LayoutStyle.flexRow)
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
