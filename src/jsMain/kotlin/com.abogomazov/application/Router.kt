package com.abogomazov.application

import com.abogomazov.IS_BLOG_ENABLED
import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import com.abogomazov.application.content.AboutMeView
import com.abogomazov.application.content.GreetingView
import com.abogomazov.application.content.pageNotFound.PageNotFoundView
import com.abogomazov.application.content.blog.BlogPostView
import com.abogomazov.application.content.blog.BlogView
import com.abogomazov.application.content.cv.CvView
import com.abogomazov.application.content.portfolio.PortfolioCase
import com.abogomazov.application.content.portfolio.PortfolioCaseView
import com.abogomazov.application.content.portfolio.PortfolioView

const val INITIAL_PATH = "/"

@Composable fun routeOnView() {
    HashRouter(initPath = INITIAL_PATH) {
        route(INITIAL_PATH) { GreetingView() }
        route(Category.ROOT.path()) { GreetingView() }
        route(Category.ABOUT_ME.path()) { AboutMeView() }
        route(Category.CV.path()) { CvView() }
        route(Category.PORTFOLIO.path()) {
            route(INITIAL_PATH) { PortfolioView() }
            string { uri ->
                PortfolioCase.fromUri(uri)
                    .map { case -> PortfolioCaseView(case) }
                    .mapLeft { PortfolioView() }
            }
            noMatch { PageNotFoundView() }
        }
        if (IS_BLOG_ENABLED) {
            route(Category.BLOG.path()) {
                route(INITIAL_PATH) { BlogView() }
                string { postTitle -> BlogPostView(postTitle) }
                noMatch { PageNotFoundView() }
            }
        }
        noMatch { PageNotFoundView() }
    }
}
