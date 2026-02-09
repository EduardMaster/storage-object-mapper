plugins {
    java
    kotlin("jvm") version "2.1.10"
    `maven-publish`
}

group = "br.com.eduard"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "br.com.eduard"
            artifactId = "storage"
            version = project.version as String
            from(components["java"])
        }
    }
}


repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven("https://jitpack.io")
}
//mavenGoogle()
dependencies {
    compileOnly(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.9.1")
    implementation("com.github.EduardMaster:java-utils:1.0.0")
}
