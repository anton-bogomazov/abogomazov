package application.router

import IS_BLOG_ENABLED
import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import application.content.AboutMeView
import application.content.GreetingView
import application.content.pageNotFound.PageNotFoundView
import application.content.blog.BlogPostView
import application.content.blog.BlogView
import application.content.cv.CvView
import application.content.portfolio.PortfolioCase
import application.content.portfolio.PortfolioCaseView
import application.content.portfolio.PortfolioView

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
        if (IS_BLOG_ENABLED) {
            route(BLOG_VIEW_ROUTE) {
                route(ROOT_ROUTE) { BlogView() }
                string { postTitle -> BlogPostView(postTitle) }
                noMatch { PageNotFoundView() }
            }
        }
        noMatch { PageNotFoundView() }
    }
}
