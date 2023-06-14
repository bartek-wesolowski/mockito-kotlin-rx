import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.maven.publish)
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    api(libs.mockito.kotlin)
    api(libs.rxjava)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01, true)
    signAllPublications()

    coordinates("io.github.bartek-wesolowski", "mockito-kotlin-rx", "2.0.0")

    pom {
        name.set("Mockito-Kotlin-Rx")
        description.set("RxJava extensions for Mockito-Kotlin.")
        inceptionYear.set("2023")
        url.set("https://github.com/bartek-wesolowski/mockito-kotlin-rx")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("bartek-wesolowski")
                name.set("Bartosz Wesołowski")
                url.set("https://github.com/bartek-wesolowski/")
            }
        }
        scm {
            url.set("https://github.com/bartek-wesolowski/mockito-kotlin-rx")
            connection.set("scm:git:git://github.com/bartek-wesolowski/mockito-kotlin-rx.git")
            developerConnection.set("scm:git:ssh://git@github.com:bartek-wesolowski/mockito-kotlin-rx.git")
        }
    }
}