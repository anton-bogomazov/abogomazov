package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.application.ColumnLayout
import com.abogomazov.application.content.cv.header.CvHeader
import com.abogomazov.application.content.cv.layout.*
import com.abogomazov.application.content.cv.section.*
import com.abogomazov.property.PropertyContext

@Composable fun CvView() {
    ColumnLayout {
        CvContainerHeader.render()
        Cv()
    }
}

@Composable fun Cv() {
    CvContainerLayout {
        CvHeader.render()
        CvMainLayout {
            CvCentralSection {
                listOf(
                    Section("Summary", listOf(Summary(PropertyContext.cvContent.summary)), true),
                    Section("Experience", Experience.from(PropertyContext.cvContent.experience.reversed())),
                    Section("Education", Education.from(PropertyContext.cvContent.education.reversed()))
                ).forEach { it.render() }
            }
            CvSideSection {
                listOf(
                    Section("Skills", Skill.from(PropertyContext.cvContent.skills), true),
                    Section("Projects", Project.from(PropertyContext.cvContent.projects)),
                    Section("Languages", Language.from(PropertyContext.cvContent.languages))
                ).forEach { it.render() }
            }
        }
    }
}
