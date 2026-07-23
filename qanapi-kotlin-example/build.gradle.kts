plugins {
    id("qanapi.kotlin")
    application
}

dependencies {
    implementation(project(":qanapi-kotlin"))
}

application {
    // Use `./gradlew :qanapi-kotlin-example:run` to run `Main`
    // Use `./gradlew :qanapi-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "cloud.qanapi.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
