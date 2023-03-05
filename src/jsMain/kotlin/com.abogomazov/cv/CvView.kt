package com.abogomazov.cv

import androidx.compose.runtime.Composable
import com.abogomazov.cv.content.CvContent
import com.abogomazov.cv.content.header.CvContacts
import com.abogomazov.cv.content.header.CvHeader
import com.abogomazov.cv.content.section.*
import com.abogomazov.property.ContactProperty
import com.abogomazov.property.CvContent as CvContentProps

@Composable fun CvView(cvContent: CvContentProps, contacts: List<ContactProperty>) {
    Cv(
        menu = CvContainerMenu(),
        content = CvContent(
            header = CvHeader(
                fullname = "${cvContent.firstname} ${cvContent.surname}",
                position = cvContent.position,
                cvContacts = CvContacts(contacts.filter { it.important })
            ),
            summary = Summary(cvContent.summary),
            experience = Experience.from(cvContent.experience.reversed()),
            education = Education.from(cvContent.education.reversed()),
            skills = Skill.from(cvContent.skills),
            projects = Project.from(cvContent.projects),
            languages = Language.from(cvContent.languages),
        )
    ).render()
}
