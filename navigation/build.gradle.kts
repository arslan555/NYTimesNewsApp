plugins {
    id(Plugin.library)
    id(Plugin.kotlinAndroid)
    kotlin(Plugin.kapt)
    id(Plugin.daggerHilt)
}

android {
    namespace = ConfigData.Package.navigationPackage
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion

        testInstrumentationRunner = ConfigData.testInstrumentRunner
        consumerProguardFiles(ConfigData.consumerRules)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ConfigData.defaultProguardFileName),
                ConfigData.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = ConfigData.jvmTarget
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.DaggerHilt.core)
    kapt(Deps.DaggerHilt.compiler)
    testImplementation(Deps.Tests.jUnit)
    androidTestImplementation(Deps.AndroidTest.extJUnit)
    androidTestImplementation(Deps.AndroidTest.espresso)
}