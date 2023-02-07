package com.abogomazov.application.domain

class Uri private constructor(private val uriString: String) {

    companion object {
        private const val HASH = "#"
        private const val UNDERSCORE = "_"
        private const val HYPHEN = "-"
        private const val nonWord = "[\\W_]+"

        fun from(string: String) =
            Uri(string.lowercase()
                .substringAfter(HASH)
                .split(nonWord.toRegex())
                .dropLastWhile { it.isBlank() }
                .joinToString(HYPHEN))
    }

    override fun toString() = uriString

    fun hashed() = "#$uriString"

    fun toEnumCompatibleString() = uriString.replace(HYPHEN, UNDERSCORE).uppercase()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class.js != other::class.js) return false

        other as Uri

        if (uriString != other.uriString) return false

        return true
    }

    override fun hashCode(): Int {
        return uriString.hashCode()
    }

}
