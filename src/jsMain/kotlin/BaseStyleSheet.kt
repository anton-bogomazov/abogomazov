import org.jetbrains.compose.web.css.*

object BaseStyleSheet : StyleSheet() {

    val selectedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    init {
        "a" style {
            hover style {
                color(Color.darkgray)
            }
        }

        universal style {
            fontFamily("monospace")

            color(Color.black)
            textDecoration("none")

            margin(0.px)
        }
    }
}
