object Version{
    const val core = "1.7.0"
    const val appcompat = "1.6.1"
    const val constrainlayout = "2.1.4"
    const val androidmaterial = "1.9.0"


    const val testImplJunit = "4.13.2"
    const val testImplTest = "1.1.5"
    const val testImplExspresso = "3.5.1"

    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalersConvertors = "2.1.0"

    const val kotlinCoroutines = "1.6.4"

    const val coroutinesLifecycleScope = "2.5.1"

    const val glide = "4.12.0"

    const val viewModelDeligate = "1.6.0"

    const val dagger = "2.44"
    const val hiltCompiler = "1.0.0"

    const val roomVersion = "2.4.3"

    const val swipeRefresh = "1.1.0"

    const val lottieAnimations = "3.4.2"

}

object Deps{
    const val  core = "androidx.core:core-ktx:${Version.core}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val constrainlayout = "androidx.constraintlayout:constraintlayout:${Version.constrainlayout}"
    const val androidmaterila = "com.google.android.material:material:${Version.androidmaterial}"
}

object TestImplementation{
    const val junit = "junit:junit:${Version.testImplJunit}"
}

object AndroidTestImplementation{
    const val junit = "androidx.test.ext:junit:${Version.testImplTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.testImplExspresso}"
}

object Retrofit{
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Version.scalersConvertors}"
}
object Coroutines{
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinCoroutines}"

    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-Android:${Version.kotlinCoroutines}"
}

object CoroutineLifecycleScope{
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.coroutinesLifecycleScope}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.coroutinesLifecycleScope}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val annotationProcessor = "com.github.bumptech.glide:compiler:${Version.glide}"
}

object ViewModelDelegate{
    const val viewModelDeligate = "androidx.activity:activity-ktx:${Version.viewModelDeligate}"

}

object DaggerHilt{
    const val hilt = "com.google.dagger:hilt-android:${Version.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Version.dagger}"
    const val hiltCompiler = "android.hilt:hilt-compiler:${Version.hiltCompiler}"
}

object Room{
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomVersion}"
    const val room  = "androidx.room:room-ktx:${Version.roomVersion}"
}

object CircularProgress{
    const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipeRefresh}"
}

object LottieAnimations{
    const val lottieAnimations = "com.airbnb.android:lottie:${Version.lottieAnimations}"
}
