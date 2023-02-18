package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.layout.CvCentralSection
import com.abogomazov.application.content.cv.layout.CvSideSection
import com.abogomazov.component.H1Header
import com.abogomazov.component.H2Header
import com.abogomazov.component.Renderable
import com.abogomazov.property.PropertyContext

object CvHeader : Renderable {

    @Composable override fun render() {
        RowLayout {
            CvCentralSection {
                ColumnLayout {
                    val fullname = "${PropertyContext.cvContent.firstname} ${PropertyContext.cvContent.surname}"

                    H1Header(fullname).render()
                    H2Header(PropertyContext.cvContent.position).render()
                }
            }
            CvSideSection { Contacts.render() }
        }
    }

}
