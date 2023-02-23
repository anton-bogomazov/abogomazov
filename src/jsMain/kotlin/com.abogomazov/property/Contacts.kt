package com.abogomazov.property

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Contacts(
    val web: List<ContactProperty>
)

@Serializable
data class ContactProperty(
    val title: String,
    val username: String,
    val link: String,
    @SerialName("icon_path")
    val iconPath: String,
    val important: Boolean
)
