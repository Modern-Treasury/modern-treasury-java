plugins {
    id("application")
    id("modern-treasury.java")
}

dependencies {
    implementation(project(":modern-treasury-java"))
}

application {
    mainClass.set("com.moderntreasury.example.Main")
}
