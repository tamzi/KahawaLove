plugins {
    alias(libs.plugins.kahawalove.android.feature)
    alias(libs.plugins.kahawalove.android.library.compose)
}

android {
    namespace = "com.kahawalove.menu"
}

dependencies {
    implementation(project(":mkahawa"))
    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
}