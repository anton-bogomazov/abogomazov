import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
    val invertedText by style {
        backgroundColor(Color.black)
        color(Color.white)
    }

    // fixme it shouldn't be here and change the color
    val hoveredLink by style {
        self + hover style { color(Color.lightgray) }
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