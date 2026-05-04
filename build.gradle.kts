// Top-level build file where you can add configuration options common to all sub-projects/modules.

android {
    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false

            // IMPORTANT: makes release APK installable for testing
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
