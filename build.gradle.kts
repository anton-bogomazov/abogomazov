plugins {
    kotlin("multiplatform") version "1.7.20"
    id("org.jetbrains.compose") version "1.2.2"
    id("io.kotest.multiplatform") version "5.5.4"
}

group "com.abogomazov"
version "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
                implementation("app.softwork:routing-compose:0.2.11")
                implementation("io.arrow-kt:arrow-core:1.1.4")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation("io.kotest:kotest-framework-engine:5.0.2")
                implementation("io.kotest:kotest-assertions-core:5.0.2")
            }
        }
    }
}
