package application.content.router

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
fun routeOnView() {
    HashRouter(initPath = INITIAL_PATH) {
        route(ROOT_ROUTE) { GreetingView() }
        route(ROOT_VIEW_ROUTE) { GreetingView() }
        route(ABOUT_ME_VIEW_ROUTE) { AboutMeView() }
        route(CV_VIEW_ROUTE) { CvView() }
        route(PORTFOLIO_VIEW_ROUTE) {
            route(ROOT_ROUTE) { PortfolioView() }
            string { uri ->
                PortfolioCase.fromUri(uri)
                    .map { case -> PortfolioCaseView(case) }
                    .mapLeft { PortfolioView() }
            }
            noMatch { PageNotFoundView() }
        }
        route(BLOG_VIEW_ROUTE) {
            route(ROOT_ROUTE) { BlogView() }
            int { /* todo handle blog post id */ }
            noMatch { PageNotFoundView() }
        }
        noMatch { PageNotFoundView() }
    }
}
