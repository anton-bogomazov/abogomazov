package application.content

import androidx.compose.runtime.Composable
import application.router.routeOnView
import application.content.styles.ViewContainerStyles.viewContainer
import org.jetbrains.compose.web.dom.Div

@Composable
fun ViewContainer() {
    Div({
        classes(viewContainer)
    }) {
        routeOnView()
    }
}
