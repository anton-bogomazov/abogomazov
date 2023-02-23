package com.abogomazov.greeting

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.*
import com.abogomazov.app.style.ResponsiveStyle
import com.abogomazov.app.style.TextStyle

class Greeting(
    private val aboutMeText: String,
    private val siteGuideText: String,
) : Renderable {

    @Composable override fun render() {
        CenteredLayout {
            ColumnLayout {
                RegularText(TextStyle.medium, TextStyle.monospace, TextStyle.inverted, TextStyle.italic) {
                    "The site is under construction and may contain irrelevant content, bugs and broken layout."
                }

                WithClass(ResponsiveStyle.topPadded) {
                    RegularText(TextStyle.large) {
                        "Hello, my name is\n"
                    }
                    RegularText(TextStyle.larger, TextStyle.inverted, TextStyle.monospace) {
                        "Anton Bogomazov"
                    }
                }

                WithClass(ResponsiveStyle.topPadded) {
                    RegularText(TextStyle.medium) {
                        aboutMeText
                    }
                    RegularText(TextStyle.medium) {
                        siteGuideText
                    }
                }
            }
        }
    }

}
