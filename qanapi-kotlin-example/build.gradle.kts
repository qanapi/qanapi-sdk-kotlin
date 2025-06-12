plugins {
    id("qanapi.kotlin")
    application
}

dependencies {
    implementation(project(":qanapi-kotlin"))
}

application {
    mainClass = "com.qanapi.api.example.MainKt"
}
