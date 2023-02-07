package com.abogomazov.property

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json

object PropertyContext {

    val contacts = readProperty(Contacts.serializer(), js("require('./contacts.json')"))
    val cvContent = readProperty(CvContent.serializer(), js("require('./cv-content.json')"))
    val greetingContent = readProperty(GreetingContent.serializer(), js("require('./greeting-content.json')"))
    val featureFlags = readProperty(FeatureFlags.serializer(), js("require('./feature-flags.json')"))


    private fun <T> readProperty(deserializer: DeserializationStrategy<T>, obj: Any): T {
        return Json.decodeFromString(deserializer, JSON.stringify(obj))
    }
}
