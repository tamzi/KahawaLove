pluginManagement {
    includeBuild("buildLogic")
    repositories {
        google()
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

rootProject.name = "KahawaLove"
include(":app")
include(":mkahawa")
include(":mkahawademo")
include(":feature:rewards")
include(":feature:offers")
include(":feature:menu")
include(":feature:order")
include(":feature:onboarding")
include(":feature:cart")
include(":feature:products")
include(":feature:about")
include(":feature:auth")
include(":feature:profile")
include(":feature:store")
include(":feature:home")
include(":feature:wallet")
include(":feature:news")
include(":feature:faq")
