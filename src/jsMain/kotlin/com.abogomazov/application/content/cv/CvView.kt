package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.content.cv.header.CvHeader
import com.abogomazov.application.content.cv.layout.*
import com.abogomazov.property.PropertyContext
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
                    Section("Experience", Experience.from(PropertyContext.cvContent.experience)).render()
                    Section("Education", Education.from(PropertyContext.cvContent.education)).render()
                }
                CvSideSection {
                    Section("Skills", Skill.from(PropertyContext.cvContent.skills)).render()
                    Section("Projects", Project.from(PropertyContext.cvContent.projects)).render()
                    Section("Languages", Language.from(PropertyContext.cvContent.languages)).render()
                }
            }
        }
    }
}
