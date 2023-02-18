package com.abogomazov.component

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ResponsiveStyle
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class H1Header(private val text: String) : Renderable {

    @Composable
    override fun render() {
        Span({
            classes(GlobalStyles.monospace, GlobalStyles.invertedText, ResponsiveStyle.largestText)
        }) {
            Text(text)
        }
    }

}

class H2Header(private val text: String) : Renderable {

    @Composable
    override fun render() {
        Span({
            classes(ResponsiveStyle.largerText)
        }) {
            Text(text)
        }
    }

}

class H3Header(private val text: String) : Renderable {

    @Composable override fun render() {
        Span({
            classes(GlobalStyles.monospace, ResponsiveStyle.largeText)
        }) {
            Text(text)
        }
    }

}

class H4Header(private val text: String) : Renderable {

    @Composable
    override fun render() {
        Span({
            classes(ResponsiveStyle.mediumText)
            style { fontWeight(GlobalStyles.lessBold) }
        }) {
            Text(text)
        }
    }

}

class LinkText(private val text: String) : Renderable {

    @Composable override fun render() {
        Span({
            classes(GlobalStyles.monospace, ResponsiveStyle.mediumText)
        }) {
            Text(text)
        }
    }

}

class RegularText(private val text: String) : Renderable {

    @Composable
    override fun render() {
        Span({
            classes(ResponsiveStyle.mediumText)
        }) {
            Text(text)
        }
    }

}
