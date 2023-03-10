package com.abogomazov.application.content.portfolio

import androidx.compose.runtime.Composable
import com.abogomazov.application.content.portfolio.case.AutomatingLibraryPublicationCase
import com.abogomazov.application.content.portfolio.case.FunctionalToImperativeCase
import arrow.core.Either

private const val AUTOMATING_LIBRARY_PUBLICATION_DESCRIPTION = "Automate library publication"
private const val FUNCTIONAL_TO_IMPERATIVE_DESCRIPTION = "Transform functional wat to write reactor code to imperative"

enum class PortfolioCase(
    val tag: Tag,
    val company: Company,
    val description: String,
    val content: @Composable () -> Unit
) {
    AUTOMATING_LIBRARY_PUBLICATION(Tag.DX, Company.DOMCLICK, AUTOMATING_LIBRARY_PUBLICATION_DESCRIPTION, { AutomatingLibraryPublicationCase() }),
    FUNCTIONAL_TO_IMPERATIVE(Tag.DX, Company.DOMCLICK, FUNCTIONAL_TO_IMPERATIVE_DESCRIPTION, { FunctionalToImperativeCase() });

    enum class Tag { DX }
    enum class Company { DOMCLICK, BEELINE, TRADESHIFT, PERSONAL }

    fun toUri(origin: String) = "$origin/#portfolio/${name.replace("_", "-").lowercase()}"

    companion object {
        fun fromUri(uri: String): Either<IllegalStateException, PortfolioCase> {
            return try {
                val portfolioCase = PortfolioCase.valueOf(uri.replace("-", "_").uppercase())
                Either.Right(portfolioCase)
            } catch (e: IllegalStateException) {
                Either.Left(e)
            }
        }
    }
}
