package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.ResponsiveProperties
import com.abogomazov.application.CenteredLayout
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.WithClass
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

class GreetingView : Renderable {

    object Style : StyleSheet(GlobalStyles) {
        val myNameIs by style {
            fontSize(ResponsiveProperties.largeScreenText.large)

            media(ResponsiveProperties.mediumScreen) {
                self style {
                    fontSize(ResponsiveProperties.mediumScreenText.large)
                }
            }

            media(ResponsiveProperties.smallScreen) {
                self style {
                    fontSize(ResponsiveProperties.smallScreenText.large)
                }
            }
        }

        val name by style {
            fontSize(ResponsiveProperties.largeScreenText.larger)

            media(ResponsiveProperties.mediumScreen) {
                self style {
                    fontSize(ResponsiveProperties.mediumScreenText.larger)
                }
            }

            media(ResponsiveProperties.smallScreen) {
                self style {
                    fontSize(ResponsiveProperties.smallScreenText.larger)
                }
            }
        }

        val contentText by style {
            fontSize(ResponsiveProperties.largeScreenText.medium)

            media(ResponsiveProperties.mediumScreen) {
                self style {
                    fontSize(ResponsiveProperties.mediumScreenText.medium)
                }
            }

            media(ResponsiveProperties.smallScreen) {
                self style {
                    fontSize(ResponsiveProperties.smallScreenText.medium)
                }
            }
        }

        val bottomPadded by style {
            paddingBottom(12.px)

            media(ResponsiveProperties.mediumScreen) {
                self style {
                    paddingBottom(8.px)
                }
            }

            media(ResponsiveProperties.smallScreen) {
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
                        fontSize(ResponsiveProperties.largeScreenText.medium)
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
