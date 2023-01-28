package header.menu

import application.header.menu.MenuCategory
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MenuCategoryTest : StringSpec({

    "fromHashOrRoot - return menu category corresponding hash value" {
        MenuCategory.from("#portfolio") shouldBe MenuCategory.PORTFOLIO
        MenuCategory.from("#about-me") shouldBe MenuCategory.ABOUT_ME
    }

    "fromHashOrRoot - return root category when hash value impossible to parse" {
        MenuCategory.from("") shouldBe MenuCategory.ROOT
        MenuCategory.from("#") shouldBe MenuCategory.ROOT
        MenuCategory.from("#wtf") shouldBe MenuCategory.ROOT
        MenuCategory.from("#unknown/sampletext") shouldBe MenuCategory.ROOT
    }

})
