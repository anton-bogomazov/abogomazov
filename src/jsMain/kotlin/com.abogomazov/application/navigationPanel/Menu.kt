package com.abogomazov.application.navigationPanel

import com.abogomazov.GlobalStyles
import com.abogomazov.IS_BLOG_ENABLED
import com.abogomazov.Uri
import com.abogomazov.WindowContext
import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

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

    private enum class Category {
        ROOT,
        ABOUT_ME,
        CV,
        PORTFOLIO,
        BLOG;

        companion object {
            fun from(uri: Uri) =
                try {
                    // fixme intentional inconsistency: there is no IllegalStateException with disabled BLOG
                    Category.valueOf(uri.toEnumCompatibleString())
                } catch (e: IllegalStateException) {
                    ROOT
                }

            fun categories() = Category.values().subtract(if (!IS_BLOG_ENABLED) setOf(BLOG) else setOf())
        }

        fun lowercase() = name.lowercase()
        fun hash() = Uri.from(name).hashed()
    }

}
