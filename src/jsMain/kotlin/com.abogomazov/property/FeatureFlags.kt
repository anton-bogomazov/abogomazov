package com.abogomazov.property

import kotlinx.serialization.Serializable

@Serializable
data class FeatureFlags(
    val isAboutMeEnabled: Boolean,
    val isRootEnabled: Boolean,
    val isCvEnabled: Boolean,
    val isPortfolioEnabled: Boolean,
    val isBlogEnabled: Boolean
)
