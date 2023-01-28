package application.content.view

import GlobalStyles.selectedText
import androidx.compose.runtime.Composable
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
    val aboutMe = "I'm a software engineer with a focus on web technologies. " +
            "I strive to create systems that are not only reliable, but also easy to understand and maintain."
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
                Span({ classes(selectedText) }) { Text("Anton Bogomazov") }
            }
        }
        Span({
            style {
                fontSize(24.px)
            }
        }) {
            Text(aboutMe)
        }
    }
}

@Composable
fun SiteGuide() {
    val guide = "Here, you'll find an overview of my professional background and experience in the \"about_me\" section, " +
            "as well as my resume in the \"cv\" section. The \"portfolio\" showcases some of my past projects and " +
            "the \"blog\" includes my thoughts and insights on various topics related to my field."
    Div {
        Header({
            style {
                fontSize(24.px)
            }
        }) {
            Text(guide)
        }
    }
}
