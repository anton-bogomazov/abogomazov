package com.abogomazov.application

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.style.ViewContainerStyles.viewContainer
import com.abogomazov.application.routeOnView
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        classes(viewContainer)
    }) {
        routeOnView()
    }
}
