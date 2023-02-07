package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import com.abogomazov.GlobalStyles
import com.abogomazov.component.Renderable
import com.abogomazov.property.EducationProperty
import com.abogomazov.property.LanguageProperty
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
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

    private val PADDING = 10.px
    private val LANGUAGE_CERTIFICATE_LINK_TEXT = "Certificate"

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
        Div({
            classes(GlobalStyles.flexColumn)

            style {
                padding(PADDING)
            }
        }) {
            Div({ classes() }) {
                Span({ style { fontSize(GlobalStyles.medium) } }) { Text(language.name) }
            }
            Div({ style { fontStyle("italic") } }) {
                Span {
                    Text(level.toString())
                    certificate?.let {
                        // todo link to the cert
                        A {
                            Text(LANGUAGE_CERTIFICATE_LINK_TEXT)
                        }
                    }
                }
            }
        }
    }
}
