package content

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import content.view.*

@Composable
fun route() {
    HashRouter(initPath = "/") {
        route("/") { GreetingView() }
        route("/about-me") { AboutMeView() }
        route("/cv") { CvView() }
        route("/portfolio") { PortfolioView() }
        route("/blog") { BlogView() }
        noMatch { GreetingView() }
    }
}
