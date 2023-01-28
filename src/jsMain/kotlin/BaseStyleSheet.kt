import org.jetbrains.compose.web.css.*

object BaseStyleSheet : StyleSheet() {

    val selectedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    val linkHover by style {
        self + hover style { color(Color.darkgray) }
    }

    init {
        universal style {
            fontFamily("monospace")

            color(Color.black)
            textDecoration("none")

            margin(0.px)

        }
    }
}
