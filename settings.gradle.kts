pluginManagement {
    repositories {
        mavenLocal()
        jcenter()
        gradlePluginPortal()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlinx")
        maven("https://dl.bintray.com/mipt-npm/scientifik")
        maven("https://dl.bintray.com/mipt-npm/dev")
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlinx-atomicfu" -> useModule("org.jetbrains.kotlinx:atomicfu-gradle-plugin:${requested.version}")
                "scientifik.mpp", "scientifik.publish" -> useModule("scientifik:gradle-tools:${requested.version}")
            }
        }
    }
}

enableFeaturePreview("GRADLE_METADATA")

//rootProject.name = "plot"

include(
    ":plotlykt-core",
    ":plotlykt-server",
    ":examples"
)