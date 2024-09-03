plugins {
    alias(libs.plugins.kahawalove.android.application)
    alias(libs.plugins.kahawalove.android.application.compose)
}

android {
    namespace = "com.tamzi.mkahawademo"

    defaultConfig {
        applicationId = "com.tamzi.mkahawademo"
        versionCode = 1
        versionName = "0.0.01" // X.Y.ZZ; X = Major, Y = minor, Z = Patch level can be many digits

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":mkahawa"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.monitor)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.compose.ui.test)
    androidTestImplementation(kotlin("test"))
    androidTestImplementation(libs.androidx.ui.test.junit4)

}

dependencyGuard {
    configuration("releaseRuntimeClasspath")
}
