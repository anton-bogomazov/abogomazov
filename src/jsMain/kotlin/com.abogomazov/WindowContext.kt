package com.abogomazov

import com.abogomazov.application.domain.Uri
import kotlinx.browser.window

object WindowContext {

    fun hash() = Uri.from(window.location.hash)

    fun width() = window.innerWidth

    fun print() = window.print()

}
