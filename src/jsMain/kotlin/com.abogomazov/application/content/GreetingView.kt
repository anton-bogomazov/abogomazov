package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.CenteredLayout
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

class GreetingView : Renderable {

    @Composable override fun render() {
        CenteredLayout {
            Div({ classes(GlobalStyles.flexColumn) }) {
                Span({
                    classes(GlobalStyles.monospace, GlobalStyles.invertedText)
                    style {
                        fontSize(GlobalStyles.medium)
                        fontStyle("italic")
                        paddingBottom(12.px)
                    }
                }) { Text("The site is under construction"); Br(); Text("and may contain irrelevant content, bugs and broken layout.") }
                Div({
                    style {
                        fontSize(GlobalStyles.larger)
                        paddingBottom(12.px)
                    }
                }) {
                    Span({
                        classes(GlobalStyles.monospace)
                        style { fontSize(GlobalStyles.large) }
                    }) { Text("Hello, my name is"); Br() }
                    Span({ classes(GlobalStyles.invertedText, GlobalStyles.monospace) }) { Text("Anton Bogomazov") }
                }
                Div({
                    style {
                        fontSize(GlobalStyles.large)

                        paddingBottom(12.px)
                    }
                }) { Text(PropertyContext.greetingContent.aboutMe) }
                Div({
                    style {
                        fontSize(GlobalStyles.large)
                    }
                }) { Text(PropertyContext.greetingContent.siteGuide) }
            }
        }
    }

}
