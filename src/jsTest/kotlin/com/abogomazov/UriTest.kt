package com.abogomazov

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class UriTest : StringSpec({

    val uri = Uri.from("/#about_me--..-or_not?")

    "from - create uri from string" {
        uri.toString() shouldBe "about-me-or-not"
    }

    "hashed - return hashed uri" {
        uri.hashed() shouldBe "#about-me-or-not"
    }

    "toEnumCompatibleString - return conventional enum string" {
        uri.toEnumCompatibleString() shouldBe "ABOUT_ME_OR_NOT"
    }

})
