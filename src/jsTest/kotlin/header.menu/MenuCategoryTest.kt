package header.menu

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MenuCategoryTest : StringSpec({

    "fromHashOrRoot - return menu category corresponding hash value" {
        MenuCategory.fromHashOrRoot("#portfolio") shouldBe MenuCategory.PORTFOLIO
        MenuCategory.fromHashOrRoot("#about-me") shouldBe MenuCategory.ABOUT_ME
    }

    "fromHashOrRoot - return root category when hash value impossible to parse" {
        MenuCategory.fromHashOrRoot("") shouldBe MenuCategory.ROOT
        MenuCategory.fromHashOrRoot("#") shouldBe MenuCategory.ROOT
        MenuCategory.fromHashOrRoot("#wtf") shouldBe MenuCategory.ROOT
        MenuCategory.fromHashOrRoot("#unknown/sampletext") shouldBe MenuCategory.ROOT
    }

})
