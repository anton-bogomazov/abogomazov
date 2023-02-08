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

class Menu(categories: Set<Category>) {

    private val items: List<Item> = categories.map { Item(it) }

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
            private val heightOfHighlight = 0.px
            private val widthOfHighlight = 8.px
        }

        @Composable fun render(selected: Boolean = false, callback: (Category) -> Unit) {
            A(attrs = {
                classes(GlobalStyles.monospace)
                style { padding(heightOfHighlight, widthOfHighlight) }

                if (selected) classes(GlobalStyles.invertedText)
                onClick { callback(category) } }, href = category.hash()
            ) {
                Text(category.lowercase())
            }
        }
    }

}
