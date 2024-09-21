plugins {
    alias(libs.plugins.kahawalove.android.feature)
    alias(libs.plugins.kahawalove.android.library.compose)
}

android {
    namespace = "com.kahawalove.feature.offers"
}

dependencies {
    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
}