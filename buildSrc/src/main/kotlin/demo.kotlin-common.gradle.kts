import org.gradle.accessors.dm.LibrariesForLibs

// https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlinx.kover")
}

repositories {
    gradlePluginPortal()
}

dependencies {
    api(platform("org.jetbrains.kotlin:kotlin-bom"))

    testImplementation(kotlin("test"))
    testImplementation(libs.mockito.kotlin)
}

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

tasks {
    test {
        finalizedBy(tasks.koverHtmlReport)
    }
    koverHtmlReport {
        dependsOn(tasks.test)
    }
}

kover {
}
