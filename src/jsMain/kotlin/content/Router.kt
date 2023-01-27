package content

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import content.view.*
import content.view.blog.BlogView
import content.view.cv.CvView
import content.view.portfolio.PortfolioView

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
