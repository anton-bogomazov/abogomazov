package com.abogomazov.application.menu

import com.abogomazov.GlobalStyles
import com.abogomazov.WindowContext
import androidx.compose.runtime.*
import com.abogomazov.application.ApplicationLayoutStyles
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import com.abogomazov.application.domain.Category

object Menu {

    private val items: List<Item> = Category.categories().map { Item(it) }

    @Composable fun render() {
        var selectedCategory by remember { mutableStateOf(Category.from(WindowContext.hash())) }

        Div({
            classes(ApplicationLayoutStyles.panel, GlobalStyles.flexRow)
            style {
                alignItems(AlignItems.Center)
                justifyContent(JustifyContent.FlexEnd)

                fontWeight("bold")
            }
        }) {
            items.forEach {
                it.render(it.category == selectedCategory) { category -> selectedCategory = category }
            }
        }
    }

    private class Item(val category: Category) {

        companion object {
            private val PADDING = 10.px
        }

        @Composable fun render(selected: Boolean = false, callback: (Category) -> Unit) {
            A(attrs = {
                if (selected) classes(GlobalStyles.invertedText)
                style { padding(PADDING) }
                onClick { callback(category) } }, href = category.hash()
            ) { Text(category.lowercase()) }
        }
    }

}
