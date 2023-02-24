package com.abogomazov.greeting

import androidx.compose.runtime.Composable
import com.abogomazov.property.GreetingContent

@Composable fun GreetingView(content: GreetingContent) {
    Greeting(
        aboutMeText = content.aboutMe,
        siteGuideText = content.siteGuide,
    ).render()
}
