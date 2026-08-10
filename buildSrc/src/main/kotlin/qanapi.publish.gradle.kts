import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Qanapi")
        description.set("Secure API with enforced API Key headers. Supports V2 and V3 endpoints.")
        url.set("https://docs.qanapi.com/")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Qanapi")
                email.set("support@qanapi.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/qanapi/qanapi-sdk-kotlin.git")
            developerConnection.set("scm:git:git://github.com/qanapi/qanapi-sdk-kotlin.git")
            url.set("https://github.com/qanapi/qanapi-sdk-kotlin")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
