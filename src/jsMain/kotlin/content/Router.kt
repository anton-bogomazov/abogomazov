package content

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import content.view.*
import content.view.blog.BlogPostView
import content.view.blog.BlogView
import content.view.cv.CvView
import content.view.portfolio.PortfolioCase
import content.view.portfolio.PortfolioCaseView
import content.view.portfolio.PortfolioView

@Composable
fun route() {
    HashRouter(initPath = "/") {
        route("/") { GreetingView() }
        route("root") { GreetingView() }
        route("about-me") { AboutMeView() }
        route("cv") { CvView() }
        route("portfolio") {
            route("/") { PortfolioView() }
            string { uri -> handlePortfolioCaseString(uri) }
            noMatch { PageNotFoundView() }
        }
        route("blog") {
            route("/") { BlogView() }
            int { /* todo handle blog post id */ }
            noMatch { PageNotFoundView() }
        }
        noMatch { PageNotFoundView() }
    }
}

@Composable
private fun handlePortfolioCaseString(uri: String) {
    val case = PortfolioCase.fromUri(uri)
    return if (case.error != null) PortfolioView() else PortfolioCaseView(case.result!!)
}
