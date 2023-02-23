package com.abogomazov.pageNotFound

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.CenteredLayout
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.style.TextStyle

@Composable fun StubView() {
    val classes = arrayOf(
        TextStyle.larger,
        TextStyle.inverted,
        TextStyle.monospace
    )

    CenteredLayout {
        RegularText(*classes) { "<THIS_PAGE_IS_UNDER_CONSTRUCTION>" }
    }
}
