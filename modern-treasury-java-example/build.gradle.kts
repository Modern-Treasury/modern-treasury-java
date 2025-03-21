plugins {
    id("modern-treasury.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":modern-treasury-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.moderntreasury.api.example.Main"
}
