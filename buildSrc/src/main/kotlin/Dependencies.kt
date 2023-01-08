object Gradle {
    val daggerHilt by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Version.daggerPluginHilt}" }
}

object Plugin {
    val application by lazy { "com.android.application" }
    val library by lazy { "com.android.library" }
    val android by lazy { "android" }
    val kotlinAndroid by lazy { "org.jetbrains.kotlin.android" }
    val daggerHilt by lazy { "dagger.hilt.android.plugin" }
    val daggerHiltLib by lazy { "com.google.dagger.hilt.android" }
    val kapt by lazy { "kapt" }
}

object Deps {
    val core by lazy { "androidx.core:core-ktx:${Version.core}" }
    val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Version.appCompat}" }

    object Compose {
        val activity by lazy { "androidx.activity:activity-compose:${Version.composeActivity}" }
        val ui by lazy { "androidx.compose.ui:ui:${Version.compose}" }
        val toolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Version.composeTooling}" }
        val tooling by lazy { "androidx.compose.ui:ui-tooling:${Version.composeTooling}" }
        val material by lazy { "androidx.compose.material:material:${Version.composeMaterial}" }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout-compose:${Version.composeConstraintLayout}" }
        val navigation by lazy { "androidx.navigation:navigation-compose:${Version.composeNavigation}" }
        val hilt by lazy { "androidx.hilt:hilt-navigation-compose:${Version.composeHilt}" }
        val lifecycle by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.composeLifecycle}" }
        val runtimeCompose by lazy { "androidx.compose.runtime:runtime:1.2.1" }
        val compilerCompose by lazy { "androidx.compose.compiler:compiler:1.3.1" }
        val uiTooling by lazy { "androidx.compose.ui:ui-tooling:1.2.1" }
    }

    object DaggerHilt {
        val core by lazy { "com.google.dagger:hilt-android:${Version.daggerHilt}" }
        val compiler by lazy { "com.google.dagger:hilt-compiler:${Version.daggerHilt}" }
        val hiltCommon by lazy { "androidx.hilt:hilt-common:1.0.0" }
    }

    object Retrofit {
        val core by lazy { "com.squareup.retrofit2:retrofit:${Version.retrofit}" }
        val gsonConverter by lazy {"com.squareup.retrofit2:converter-gson:${Version.retrofit}"}
        val scalarConverter by lazy { "com.squareup.retrofit2:converter-scalars:${Version.retrofit}" }
    }

    object OkHttp {
        val logging by lazy {"com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"}
    }

    object Timber  {
        val log by lazy {  "com.jakewharton.timber:timber:${Version.timber}" }
    }

    object Coroutine {
        val android by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}" }
    }

    object Tests {
        val jUnit by lazy { "junit:junit:${Version.jUnit}" }
    }

    object AndroidTest {
        val extJUnit by lazy { "androidx.test.ext:junit:${Version.extJUnit}" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Version.espresso}" }
        val composeJUnit by lazy { "androidx.compose.ui:ui-test-junit4:${Version.compose}" }
    }

    object Modules {
        const val path = "path"

        object Common {
            private const val common = ":common:"
            const val database = "${common}database"
            const val datastore = "${common}datastore"
            const val network = "${common}network"
            const val data = "${common}data"
            const val model = "${common}model"
            const val resources = "${common}resources"
            const val utils = "${common}utils"
        }

        object Feature {
            private const val features = ":features:"
            const val news = "${features}news"
            const val onboarding = "${features}onboarding"
            const val home = "${features}home"
            const val explore = "${features}explore"
            const val bookmark = "${features}bookmark"
            const val profile = "${features}profile"
        }

        const val navigation = ":navigation"
    }
}