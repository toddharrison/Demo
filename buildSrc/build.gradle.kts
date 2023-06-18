plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    // https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    // Convention Plugins
    implementation("org.jetbrains.kotlin.jvm", "org.jetbrains.kotlin.jvm.gradle.plugin", libs.versions.kotlin.get())
    implementation("org.jetbrains.kotlinx.kover", "org.jetbrains.kotlinx.kover.gradle.plugin", libs.versions.kover.get())
}
