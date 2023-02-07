package com.abogomazov.application.content

import com.abogomazov.GlobalStyles.invertedText
import androidx.compose.runtime.Composable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun GreetingView() {
    Section({
        style {
            display(DisplayStyle.Block)
            boxSizing("border-box")
        }
    }) {
        AboutMe()
        SiteGuide()
    }
}

@Composable
fun AboutMe() {
    Div {
        Header({
            style {
                fontSize(48.px)
            }
        }) {
            Span { Text("Hello, ") }
            Span {
                Span {
                    Text("my name is")
                    Br()
                }
                Span({ classes(invertedText) }) { Text("Anton Bogomazov") }
            }
        }
        Span({
            style {
                fontSize(24.px)
            }
        }) {
            Text(PropertyContext.greetingContent.aboutMe)
        }
    }
}

@Composable
fun SiteGuide() {
    Div {
        Header({
            style {
                fontSize(24.px)
            }
        }) {
            Text(PropertyContext.greetingContent.siteGuide)
        }
    }
}
