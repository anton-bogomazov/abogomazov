package com.abogomazov.app.chassis

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.routeOnView
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.cv.CvView
import com.abogomazov.domain.Category
import com.abogomazov.property.Contacts
import com.abogomazov.property.CvContent
import com.abogomazov.property.readProperty
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable fun Application() {
    val categories = Category.categories()
    ColumnLayout {
        if (categories.size > 1) {
            Header({ classes(LayoutStyle.nonPrintable, ChassisStyles.topFixed) }) {
                Menu(categories = Category.categories()).render()
            }
        }
        Main {
            ViewContainer {
                if (categories.size > 1) {
                    routeOnView()
                } else {
                    CvView(
                        contacts = readProperty(Contacts.serializer(), js("require('./contacts.json')") as Any).web,
                        cvContent = readProperty(CvContent.serializer(), js("require('./cv-content.json')") as Any)
                    )
                }
            }
        }
        Footer({ classes(LayoutStyle.nonPrintable, ChassisStyles.bottomFixed) }) {
            FooterPanel(
                contacts = readProperty(Contacts.serializer(), js("require('./contacts.json')") as Any).web,
                copyrightText = "${Typography.copyright} 2023 Anton Bogomazov",
            ).render()
        }
    }
}
