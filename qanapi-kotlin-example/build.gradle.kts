plugins {
    id("qanapi.kotlin")
    application
}

dependencies {
    implementation(project(":qanapi-kotlin"))
}

application {
    mainClass = "cloud.qanapi.example.MainKt"
}
