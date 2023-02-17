package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.layout.CvCentralSection
import com.abogomazov.application.content.cv.layout.CvMainLayout
import com.abogomazov.application.content.cv.layout.CvSideSection
import com.abogomazov.component.H2Header
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object CvHeader : Renderable {

    @Composable override fun render() {
        RowLayout {
            CvCentralSection {
                FullnamePositionHeader(
                    fullname = "${PropertyContext.cvContent.firstname} ${PropertyContext.cvContent.surname}",
                    position = PropertyContext.cvContent.position
                ).render()
            }
            CvSideSection { Contacts.render() }
        }
    }

}
