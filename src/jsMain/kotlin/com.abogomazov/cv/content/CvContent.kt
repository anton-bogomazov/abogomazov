package com.abogomazov.cv.content

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.ResponsiveStyle
import com.abogomazov.cv.CvCentralSection
import com.abogomazov.cv.CvContainerLayout
import com.abogomazov.cv.CvSideSection
import com.abogomazov.cv.component.Section
import com.abogomazov.cv.content.header.CvHeader
import com.abogomazov.cv.content.section.*

class CvContent(
    private val header: CvHeader,
    private val summary: Summary,
    private val experience: List<Experience>,
    private val education: List<Education>,
    private val languages: List<Language>,
    private val projects: List<Project>,
    private val skills: List<Skill>,
) : Renderable {

    @Composable override fun render() {
        CvContainerLayout {
            header.render()
            RowLayout(ResponsiveStyle.transformableToColumn) {
                CvCentralSection {
                    listOf(
                        Section("Summary", listOf(summary)),
                        Section("Experience", experience),
                        Section("Education", education)
                    ).forEach { it.render() }
                }
                CvSideSection {
                    listOf(
                        Section("Skills", skills),
                        Section("Projects", projects),
                        Section("Languages", languages)
                    ).forEach { it.render() }
                }
            }
        }
    }
}
