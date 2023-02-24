package com.abogomazov.app.chassis

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.ColumnLayout
import com.abogomazov.app.routeOnView
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.domain.Category
import com.abogomazov.property.Contacts
import com.abogomazov.property.readProperty
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Main

@Composable fun Application() {
    ColumnLayout {
        Header({ classes(LayoutStyle.nonPrintable, ChassisStyles.topFixed) }) {
            Menu(categories = Category.categories()).render()
        }
        Main {
            ViewContainer { routeOnView() }
        }
        Footer({ classes(LayoutStyle.nonPrintable, ChassisStyles.bottomFixed) }) {
            FooterPanel(
                contacts = readProperty(Contacts.serializer(), js("require('./contacts.json')") as Any).web,
                copyrightText = "${Typography.copyright} 2023 Anton Bogomazov",
            ).render()
        }
    }
}
