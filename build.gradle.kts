import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(kotlin("reflect"))
    //implementation("org.junit.jupiter:junit-jupiter:5.9.2")
    //testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
    //testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
    testImplementation(files("lib/univ.nantes.umlchecker-2.0.jar"))

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}