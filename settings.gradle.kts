pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            // Plugin versions
            version("agp", "8.1.2")
            version("kotlin", "1.8.10")

            version("androidx-activity", "1.7.2")
            version("androidx-composeBOM", "2023.09.02")
            version("androidx-core", "1.12.0")
            version("androidx-lifecycle", "2.6.2")
            version("hilt", "2.48")

            // Test versions
            version("androidx-test-espresso", "3.5.1")
            version("androidx-test-junitExt", "1.1.5")
            version("junit", "4.13.2")

            plugin("android-application", "com.android.application").versionRef("agp")
            plugin("kotlin", "org.jetbrains.kotlin.android").versionRef("kotlin")
            plugin("hilt", "com.google.dagger.hilt.android").versionRef("hilt")

            library("androidx-activity-compose", "androidx.activity", "activity-compose")
                .versionRef("androidx-activity")
            library("androidx-compose-bom", "androidx.compose", "compose-bom").versionRef("androidx-composeBOM")
            library("androidx-compose-material3", "androidx.compose.material3", "material3").withoutVersion()
            library("androidx-compose-ui", "androidx.compose.ui", "ui").withoutVersion()
            library("androidx-compose-uiGraphics", "androidx.compose.ui", "ui-graphics").withoutVersion()
            library("androidx-compose-uiToolingPreview", "androidx.compose.ui", "ui-tooling-preview").withoutVersion()
            library("androidx-core-ktx", "androidx.core", "core-ktx").versionRef("androidx-core")
            library("androidx-lifecycle-ktx", "androidx.lifecycle", "lifecycle-runtime-ktx")
                .versionRef("androidx-lifecycle")
            library("hilt-core", "com.google.dagger", "hilt-android").versionRef("hilt")
            library("hilt-compiler", "com.google.dagger", "hilt-android-compiler").versionRef("hilt")

            // Debug dependencies
            library("androidx-compose-debug-uiTooling", "androidx.compose.ui", "ui-tooling").withoutVersion()
            library("androidx-compose-debug-uiTestManifest", "androidx.compose.ui", "ui-test-manifest").withoutVersion()

            // Test dependencies
            library("androidx-compose-test-junit4", "androidx.compose.ui", "ui-test-junit4").withoutVersion()
            library("androidx-test-espresso", "androidx.test.espresso", "espresso-core")
                .versionRef("androidx-test-espresso")
            library("androidx-test-junitExt", "androidx.test.ext", "junit").versionRef("androidx-test-junitExt")
            library("junit", "junit", "junit").versionRef("junit")
        }
    }
}

rootProject.name = "Compose"
include(":app")
