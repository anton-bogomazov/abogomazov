package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import com.abogomazov.property.cvContent
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object CvHeader : Renderable {

    @Composable override fun render() {
        Div({ classes(GlobalStyles.flexColumn) }) {
            FullnamePositionHeader("${cvContent.firstname} ${cvContent.surname}", cvContent.position).render()
            Contacts.render()
            Span { Text(cvContent.summary) }
        }
    }

}
