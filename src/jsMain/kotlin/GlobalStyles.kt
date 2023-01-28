import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
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
        }
    }
}
