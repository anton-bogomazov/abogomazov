package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.cv.header.CvHeader
import com.abogomazov.application.content.cv.layout.*
import com.abogomazov.property.cvContent
import org.jetbrains.compose.web.dom.Div

@Composable fun CvView() {
    Div({
        classes(GlobalStyles.flexColumn)
    }) {
        CvContainerHeader.render()
        CvContainerLayout {
            CvHeader.render()
            CvMainLayout {
                CvCentralSection {
                    Section("Experience", Experience.from(cvContent.experience)).render()
                    Section("Education", Education.from(cvContent.education)).render()
                }
                CvSideSection {
                    Section("Skills", Skill.from(cvContent.skills)).render()
                    Section("Projects", Project.from(cvContent.projects)).render()
                    Section("Languages", Language.from(cvContent.languages)).render()
                }
            }
        }
    }
}
