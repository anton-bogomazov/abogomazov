package com.abogomazov.app.chassis

import androidx.compose.runtime.Composable
import com.abogomazov.app.chassis.ChassisStyles.viewContainer
import org.jetbrains.compose.web.dom.Div

@Composable fun ViewContainer(router: @Composable () -> Unit) {
    Div({
        classes(viewContainer)
    }) {
        router()
    }
}
