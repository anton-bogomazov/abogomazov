package com.abogomazov.app

import com.abogomazov.domain.Uri
import kotlinx.browser.window

object WindowContext {

    fun hash() = Uri.from(window.location.hash)

    fun width() = window.innerWidth

}
