plugins {
    id("modern-treasury.kotlin")
    id("modern-treasury.publish")
}

dependencies {
    api(project(":modern-treasury-java-core"))

    implementation("com.google.guava:guava:33.0.0-jre")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
}
