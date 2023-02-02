package com.abogomazov.application.content

import androidx.compose.runtime.Composable
import com.abogomazov.application.router.routeOnView
import com.abogomazov.application.content.style.ViewContainerStyles.viewContainer
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        classes(viewContainer)
    }) {
        routeOnView()
    }
}
