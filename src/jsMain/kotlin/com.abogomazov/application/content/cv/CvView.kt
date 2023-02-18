package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.component.Section
import com.abogomazov.application.content.cv.header.Contacts
import com.abogomazov.application.content.cv.header.CvHeader
import com.abogomazov.application.content.cv.section.*
import com.abogomazov.property.PropertyContext

@Composable fun CvView() {
    ColumnLayout {
        CvContainerMenu.render()
        Cv()
    }
}

@Composable fun Cv() {
    val fullname = "${PropertyContext.cvContent.firstname} ${PropertyContext.cvContent.surname}"
    val position = PropertyContext.cvContent.position
    val contacts = Contacts(PropertyContext.contacts.web.filter { !it.ignore })

    CvContainerLayout {
        CvHeader(fullname, position, contacts).render()
        RowLayout {
            CvCentralSection {
                listOf(
                    Section("Summary", listOf(Summary(PropertyContext.cvContent.summary))),
                    Section("Experience", Experience.from(PropertyContext.cvContent.experience.reversed())),
                    Section("Education", Education.from(PropertyContext.cvContent.education.reversed()))
                ).forEach { it.render() }
            }
            CvSideSection {
                listOf(
                    Section("Skills", Skill.from(PropertyContext.cvContent.skills)),
                    Section("Projects", Project.from(PropertyContext.cvContent.projects)),
                    Section("Languages", Language.from(PropertyContext.cvContent.languages))
                ).forEach { it.render() }
            }
        }
    }
}
