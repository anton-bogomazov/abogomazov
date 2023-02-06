package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.cv.CvView
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        style { padding(0.px, 20.percent) }
    }) {
        routeOnView()
    }
}
