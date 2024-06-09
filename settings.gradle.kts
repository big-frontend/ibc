pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "icc"
include(":app")
include(
//    ":base-plugin", ":base-plugin-ktx",
//    ":ibc:ibc-api", ":ibc:ibc-processor", ":ibc:ibc-gradle-plugin",
//    ":temple-gradle-plugin"
)
 