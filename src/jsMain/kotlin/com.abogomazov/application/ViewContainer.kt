package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.application.ApplicationLayoutStyles.viewContainer
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        classes(viewContainer)
    }) {
        routeOnView()
    }
}
