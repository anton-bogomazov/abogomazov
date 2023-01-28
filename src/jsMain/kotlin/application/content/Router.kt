package application.content

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import application.content.view.AboutMeView
import application.content.view.GreetingView
import application.content.view.PageNotFoundView
import application.content.view.blog.BlogView
import application.content.view.cv.CvView
import application.content.view.portfolio.PortfolioCase
import application.content.view.portfolio.PortfolioCaseView
import application.content.view.portfolio.PortfolioView

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
