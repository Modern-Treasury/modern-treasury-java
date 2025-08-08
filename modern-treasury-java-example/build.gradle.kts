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
    // Use `./gradlew :modern-treasury-java-example:run` to run `Main`
    // Use `./gradlew :modern-treasury-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.moderntreasury.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
