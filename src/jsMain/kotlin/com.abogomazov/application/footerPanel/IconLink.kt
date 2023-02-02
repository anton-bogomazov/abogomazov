package com.abogomazov.application.footerPanel

import androidx.compose.runtime.Composable
import com.abogomazov.application.socialMediaLink.Icon
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A

class IconLink(
    private val link: String,
    private val icon: Icon,
) {

    companion object {
        private val ICON_PADDING = 6.px
    }

    @Composable fun render() {
        A(href = link, attrs = {
            target(ATarget.Blank)
            style { padding(ICON_PADDING) }
        }) { icon.render() }
    }

}
