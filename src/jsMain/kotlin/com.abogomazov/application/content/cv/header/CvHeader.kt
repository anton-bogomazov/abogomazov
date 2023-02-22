package com.abogomazov.application.content.cv.header

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.ResponsiveStyle
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.CvCentralSection
import com.abogomazov.application.content.cv.CvSideSection
import com.abogomazov.component.H1Header
import com.abogomazov.component.H2Header
import com.abogomazov.component.Renderable

class CvHeader(
    private val fullname: String,
    private val position: String,
    private val contacts: Contacts
) : Renderable {

    @Composable override fun render() {
        RowLayout(ResponsiveStyle.transformableToColumn) {
            CvCentralSection {
                ColumnLayout {
                    H1Header(fullname).render()
                    H2Header(position).render()
                }
            }
            CvSideSection { contacts.render() }
        }
    }

}
