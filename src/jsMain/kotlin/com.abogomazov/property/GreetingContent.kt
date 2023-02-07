package com.abogomazov.property

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GreetingContent(
    @SerialName("about_me")
    val aboutMe: String,
    @SerialName("site_guide")
    val siteGuide: String
)
