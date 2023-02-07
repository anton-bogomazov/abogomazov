package com.abogomazov.application

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import com.abogomazov.application.content.AboutMeView
import com.abogomazov.application.content.GreetingView
import com.abogomazov.application.content.PageNotFoundView
import com.abogomazov.application.content.cv.CvView
import com.abogomazov.application.content.portfolio.PortfolioCase
import com.abogomazov.application.content.portfolio.PortfolioCaseView
import com.abogomazov.application.content.portfolio.PortfolioView
import com.abogomazov.application.domain.Category
import com.abogomazov.property.PropertyContext

const val INITIAL_PATH = "/"

@Composable fun routeOnView() {
    HashRouter(initPath = INITIAL_PATH) {
        route(INITIAL_PATH) { GreetingView() }
        route(Category.ROOT.path()) { GreetingView() }
        if (PropertyContext.featureFlags.isAboutMeEnabled) {
            route(Category.ABOUT_ME.path()) { AboutMeView() }
        }
        if (PropertyContext.featureFlags.isCvEnabled) {
            route(Category.CV.path()) { CvView() }
        }
        if (PropertyContext.featureFlags.isPortfolioEnabled) {
            route(Category.PORTFOLIO.path()) {
                route(INITIAL_PATH) { PortfolioView() }
                string { uri ->
                    PortfolioCase.fromUri(uri)
                        .map { case -> PortfolioCaseView(case) }
                        .mapLeft { PortfolioView() }
                }
                noMatch { PageNotFoundView() }
            }
        }
        if (PropertyContext.featureFlags.isBlogEnabled) {
            route(Category.BLOG.path()) {
                noMatch { PageNotFoundView() }
            }
        }
        noMatch { PageNotFoundView() }
    }
}
