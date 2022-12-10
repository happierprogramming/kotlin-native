val ktor_version: String by project

plugins {
    kotlin("multiplatform") version "1.7.10"
}

group = "dw.org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation("io.ktor:ktor-server-core:$ktor_version")
                implementation("io.ktor:ktor-server-cio:$ktor_version")
            }
        }
        val nativeTest by getting
    }
}
