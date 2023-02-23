package com.abogomazov.cv.content.section

import androidx.compose.runtime.Composable
import com.abogomazov.app.component.RegularText
import com.abogomazov.app.component.Renderable
import com.abogomazov.app.component.RowLayout
import com.abogomazov.app.style.LayoutStyle
import com.abogomazov.cv.component.SectionEntity
import com.abogomazov.property.LanguageProperty
import org.jetbrains.compose.web.dom.A

class Language(
    private val language: LanguageEnum,
    private val level: CefrLevel,
    private val certificate: Certificate? = null
) : Renderable {

    enum class LanguageEnum { Russian, English, German }
    enum class CefrLevel { A1, A2, B1, B2, C1, C2, Native }
    data class Certificate(val link: String)

    companion object {
        fun from(property: List<LanguageProperty>) =
            property.map {
                Language(
                    language = it.language,
                    level = it.level,
                    certificate = it.certificate?.let { cert -> Certificate(cert) }
                )
            }
    }

    @Composable override fun render() {
        SectionEntity {
            RowLayout(LayoutStyle.spaced) {
                RegularText { language.name }

                A {
                    certificate?.let {
                        RegularText { "Certified " }
                    }.let {
                        RegularText { level.toString() }
                    }
                }
            }
        }
    }
}
