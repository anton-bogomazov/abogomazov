package com.abogomazov.cv

import androidx.compose.runtime.Composable
import com.abogomazov.cv.content.CvContent
import com.abogomazov.cv.content.header.CvContacts
import com.abogomazov.cv.content.header.CvHeader
import com.abogomazov.cv.content.section.*
import com.abogomazov.property.PropertyContext

@Composable fun CvView() {
    val cvProperties = PropertyContext.cvContent
    Cv(
        menu = CvContainerMenu(),
        content = CvContent(
            header = CvHeader(
                fullname = "${cvProperties.firstname} ${cvProperties.surname}",
                position = cvProperties.position,
                cvContacts = CvContacts(PropertyContext.contacts.web.filter { it.important })
            ),
            summary = Summary(cvProperties.summary),
            experience = Experience.from(PropertyContext.cvContent.experience.reversed()),
            education = Education.from(PropertyContext.cvContent.education.reversed()),
            skills = Skill.from(PropertyContext.cvContent.skills),
            projects = Project.from(PropertyContext.cvContent.projects),
            languages = Language.from(PropertyContext.cvContent.languages),
        )
    ).render()
}
