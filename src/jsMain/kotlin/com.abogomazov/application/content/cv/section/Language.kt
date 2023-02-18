package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.component.RegularText
import com.abogomazov.component.Renderable
import com.abogomazov.property.LanguageProperty
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

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
            RowLayout(GlobalStyles.spaced) {
                RegularText(language.name).render()

                Span {
                    certificate?.let {
                        A {
                            Text("Certified ") // todo link to the cert
                        }
                    }
                    RegularText(level.toString()).render()
                }
            }
        }.render()
    }
}
