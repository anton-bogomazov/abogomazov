package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.Responsive
import com.abogomazov.application.CenteredLayout
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.WithClass
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

class GreetingView : Renderable {

    object Style : StyleSheet(GlobalStyles) {
        val myNameIs by style {
            fontSize(Responsive.largeScreenText.large)

            media(Responsive.mediumScreen) {
                self style {
                    fontSize(Responsive.mediumScreenText.large)
                }
            }

            media(Responsive.smallScreen) {
                self style {
                    fontSize(Responsive.smallScreenText.large)
                }
            }
        }

        val name by style {
            fontSize(Responsive.largeScreenText.larger)

            media(Responsive.mediumScreen) {
                self style {
                    fontSize(Responsive.mediumScreenText.larger)
                }
            }

            media(Responsive.smallScreen) {
                self style {
                    fontSize(Responsive.smallScreenText.larger)
                }
            }
        }

        val contentText by style {
            fontSize(Responsive.largeScreenText.medium)

            media(Responsive.mediumScreen) {
                self style {
                    fontSize(Responsive.mediumScreenText.medium)
                }
            }

            media(Responsive.smallScreen) {
                self style {
                    fontSize(Responsive.smallScreenText.medium)
                }
            }
        }

        val bottomPadded by style {
            paddingBottom(12.px)

            media(Responsive.mediumScreen) {
                self style {
                    paddingBottom(8.px)
                }
            }

            media(Responsive.smallScreen) {
                self style {
                    paddingBottom(6.px)
                }
            }
        }
    }

    @Composable override fun render() {
        CenteredLayout {
            ColumnLayout {

                Span({
                    classes(GlobalStyles.monospace, GlobalStyles.invertedText)
                    style {
                        fontSize(GlobalStyles.medium)
                        fontStyle("italic")
                        paddingBottom(12.px)
                    }
                }) {
                    Text("The site is under construction")
                    Br()
                    Text("and may contain irrelevant content, bugs and broken layout.")
                }

                WithClass(Style.bottomPadded) {
                    Span({
                        classes(Style.myNameIs, GlobalStyles.monospace)
                    }) {
                        Text("Hello, my name is")
                        Br()
                    }
                    Span({
                        classes(Style.name, GlobalStyles.invertedText, GlobalStyles.monospace)
                    }) {
                        Text("Anton Bogomazov")
                    }
                }
                WithClass(Style.bottomPadded) {
                    Span({ classes(Style.contentText) }) {
                        Text(PropertyContext.greetingContent.aboutMe)
                    }
                }
                WithClass(Style.bottomPadded) {
                    Span({ classes(Style.contentText) }) {
                        Text(PropertyContext.greetingContent.siteGuide)
                    }
                }
            }
        }
    }

}
