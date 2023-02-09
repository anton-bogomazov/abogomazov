package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object CvHeader : Renderable {

    @Composable override fun render() {
        Div({ classes(GlobalStyles.flexColumn) }) {
            Div({
                classes(GlobalStyles.flexRow)
                style { justifyContent(JustifyContent.SpaceBetween) }
            }) {
                FullnamePositionHeader(
                    fullname = "${PropertyContext.cvContent.firstname} ${PropertyContext.cvContent.surname}",
                    position = PropertyContext.cvContent.position
                ).render()
                Contacts.render()
            }
            Span { Text(PropertyContext.cvContent.summary) }
        }
    }

}
