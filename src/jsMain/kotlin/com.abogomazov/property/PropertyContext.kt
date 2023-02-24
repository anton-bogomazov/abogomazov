package com.abogomazov.property

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json


fun <T> readProperty(deserializer: DeserializationStrategy<T>, obj: Any): T {
    return Json.decodeFromString(deserializer, JSON.stringify(obj))
}
