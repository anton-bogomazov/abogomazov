package com.abogomazov.cv.content.header

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.*
import com.abogomazov.app.style.ResponsiveStyle
import com.abogomazov.cv.CvCentralSection
import com.abogomazov.cv.CvSideSection

class CvHeader(
    private val fullname: String,
    private val position: String,
    private val cvContacts: CvContacts
) : Renderable {

    @Composable override fun render() {
        RowLayout(ResponsiveStyle.transformableToColumn) {
            CvCentralSection {
                ColumnLayout {
                    H1Header(fullname).render()
                    H2Header(position).render()
                }
            }
            CvSideSection { cvContacts.render() }
        }
    }

}
