import org.jetbrains.compose.web.css.*

object BaseStyleSheet : StyleSheet() {

    val selectedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    init {
        universal style {
            fontFamily("monospace")

            color(Color.black)
            textDecoration("none")

            margin(0.px)

            selector("a").style { hover { color(Color.darkgray) } }
        }
    }
}
