package com.abogomazov.application.navigationPanel

import com.abogomazov.GlobalStyles
import com.abogomazov.WindowContext
import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import com.abogomazov.application.Category

object Menu {

    private val items: List<Item> = Category.categories().map { Item(it) }

    @Composable fun render() {
        var selectedCategory by remember { mutableStateOf(Category.from(WindowContext.hash())) }

        Div({
            classes(GlobalStyles.flexRow)
            style {
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
            private val MARGIN = 8.px
            private val PADDING = 2.px
        }

        @Composable fun render(selected: Boolean = false, callback: (Category) -> Unit) {
            A(attrs = {
                if (selected) classes(GlobalStyles.invertedText)
                style {
                    margin(MARGIN)
                    padding(PADDING)
                }
                onClick { callback(category) } }, href = category.hash()
            ) { Text(category.lowercase()) }
        }
    }

}
