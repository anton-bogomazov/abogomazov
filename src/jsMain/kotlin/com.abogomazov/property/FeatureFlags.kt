package com.abogomazov.property

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

val featureFlags = Json.decodeFromString(FeatureFlags.serializer(), JSON.stringify(js("require('./feature-flags.json')")))

@Serializable
data class FeatureFlags(
    val isAboutMeEnabled: Boolean,
    val isRootEnabled: Boolean,
    val isCvEnabled: Boolean,
    val isPortfolioEnabled: Boolean,
    val isBlogEnabled: Boolean
)
