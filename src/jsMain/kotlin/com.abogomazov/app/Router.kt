package com.abogomazov.app

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import com.abogomazov.application.content.AboutMeView
import com.abogomazov.application.content.portfolio.PortfolioCase
import com.abogomazov.application.content.portfolio.PortfolioCaseView
import com.abogomazov.application.content.portfolio.PortfolioView
import com.abogomazov.cv.CvView
import com.abogomazov.domain.Category
import com.abogomazov.pageNotFound.PageNotFoundView
import com.abogomazov.pageNotFound.StubView
import com.abogomazov.property.Contacts
import com.abogomazov.property.CvContent
import com.abogomazov.property.FeatureFlags
import com.abogomazov.property.readProperty

const val INITIAL_PATH = "/"

@Composable fun routeOnView() {
    val featureFlags = readProperty(FeatureFlags.serializer(), js("require('./feature-flags.json')") as Any)
    HashRouter(initPath = INITIAL_PATH) {
        route(INITIAL_PATH) { StubView() }
        route(Category.ROOT.path()) { StubView() }
        if (featureFlags.isAboutMeEnabled) {
            route(Category.WHOAMI.path()) { AboutMeView() }
        }
        if (featureFlags.isCvEnabled) {
            route(Category.CV.path()) {
                CvView(
                    contacts = readProperty(Contacts.serializer(), js("require('./contacts.json')") as Any).web,
                    cvContent = readProperty(CvContent.serializer(), js("require('./cv-content.json')") as Any)
                )
            }
        }
        if (featureFlags.isPortfolioEnabled) {
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
        if (featureFlags.isBlogEnabled) {
            route(Category.BLOG.path()) {
                noMatch { PageNotFoundView() }
            }
        }
        noMatch { PageNotFoundView() }
    }
}
