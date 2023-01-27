package content.view

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeView() {
    Section({
        style {
            display(DisplayStyle.Flex)
        }
    }) {
        Img("me.jpeg") {
            style {
                width(300.px)
                height(400.px)
            }
        }
        Text("I am a person who is deeply passionate about engineering and the complexity of smart design. From a young age, I have been fascinated by the world of technology and have always been eager to learn more about it. When I was just 12 years old, I began building my first website. Despite not having access to the internet, I was determined to read and translate songs by the band Rammstein. I downloaded the lyrics and wrapped them in a bunch of HTML with hypertext, creating my very first website.\n" +
                "\n" +
                "As I continued to explore the world of technology, I started experimenting with different programming languages such as Pascal and Delphi, drawn to the GUI builders. I also had a lot of fun playing around with GameMaker, particularly enjoying the Arkanoid games.\n" +
                "\n" +
                "Throughout my teenage years, I spent a lot of time tinkering with computer hardware, constantly breaking and fixing it as I learned more about it. I also became fascinated with experimenting with different operating systems, particularly Linux. I fell in love with the terminal and the open-source ideas that came with it.\n" +
                "\n" +
                "When it came time to choose a university, I initially chose to study medicine because of my love for natural sciences and chemistry. However, by the fourth year of my studies, I became disappointed in the work of a doctor and decided to switch to computer science and soldering things. I took a computer science course in university and did well, which made me realize that I wanted to take this field more seriously."
        )
        Text("After deciding to pursue a career in computer science, I dropped out of university and applied to School21, an ecole 42 franchise. The experience was incredibly inspiring, and I passed the entrance examinations after a month of non-stop coding in complete uncertainty. I spent a year there learning the fundamentals of computer science and trying out different areas of interest, such as swift, machine learning, computer vision, pentesting, and backend development, which is now my current passion.\n" +
                "\n" +
                "After gaining a solid foundation in core Java and Kotlin, I landed my first job as a Kotlin developer at Domclick, an average-sized company. My team was amazing and helped me a lot with learning new things. I was also involved in discussions and product-level decisions, not just low-level solutions or bugs. This helped me gain a lot of experience and helped me to grow as a developer.\n" +
                "\n" +
                "Throughout my life, I have always strived to be a part of the global world and culture, collaborating with people from other countries. So when the war in Ukraine started, I had to leave Russia and unfortunately, I had to change my job. I worked at Beeline for six months before moving on to my next opportunity.")
    }
}
