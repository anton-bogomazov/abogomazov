package com.abogomazov.greeting

import androidx.compose.runtime.Composable
import com.abogomazov.property.PropertyContext

@Composable fun GreetingView() {
    Greeting(
        aboutMeText = PropertyContext.greetingContent.aboutMe,
        siteGuideText = PropertyContext.greetingContent.siteGuide,
    ).render()
}
