package com.abogomazov.app.chassis

import androidx.compose.runtime.*
import com.abogomazov.app.WindowContext
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.app.style.TextStyle
import com.abogomazov.domain.Category
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text

class Menu(categories: Set<Category>) {

    private val items: List<Item> = categories.map { Item(it) }

    @Composable fun render() {
        var selectedCategory by remember { mutableStateOf(Category.from(WindowContext.hash())) }

        RowLayout(ChassisStyles.panel, LayoutStyle.ended, LayoutStyle.centerAligned) {
            items.forEach {
                it.render(it.category == selectedCategory) { category -> selectedCategory = category }
            }
        }
    }

    private class Item(val category: Category) {

        @Composable fun render(selected: Boolean = false, callback: (Category) -> Unit) {
            A(attrs = {
                classes(TextStyle.monospace, TextStyle.highlighted, TextStyle.bold)

                if (selected) classes(TextStyle.inverted)
                onClick { callback(category) } }, href = category.hash()
            ) {
                Text(category.lowercase())
            }
        }
    }

}
