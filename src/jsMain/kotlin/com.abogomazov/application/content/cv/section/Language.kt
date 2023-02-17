package com.abogomazov.application.content.cv.section

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.application.RowLayout
import com.abogomazov.application.content.cv.layout.SectionEntity
import com.abogomazov.component.Renderable
import com.abogomazov.property.LanguageProperty
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
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

    object Style : StyleSheet(GlobalStyles) {
        val spaced by style { justifyContent(JustifyContent.SpaceBetween) }
    }

    @Composable override fun render() {
        SectionEntity {
            RowLayout(Style.spaced) {
                Span({ style {
                    fontSize(GlobalStyles.medium)
                    fontWeight(GlobalStyles.lessBold)
                } }) { Text(language.name) }
                Span {
                    certificate?.let {
                        A {
                            Text("Certified ") // todo link to the cert
                        }
                    }
                    Text(level.toString())
                }
            }
        }.render()
    }
}
