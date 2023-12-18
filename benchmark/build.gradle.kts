plugins {
    id("com.android.library")
    id("androidx.benchmark")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    kotlin("plugin.serialization") version "1.8.20"
    kotlin("kapt")
}


android {
    namespace = "com.jiang.json.benchmark"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.benchmark.junit4.AndroidBenchmarkRunner"
//        testInstrumentationRunnerArguments["androidx.benchmark.profiling.mode"] = "StackSampling"
//        testInstrumentationRunnerArguments["androidx.benchmark.dryRunMode.enable"] = "true"
        testInstrumentationRunnerArguments["androidx.benchmark.suppressErrors"]= "EMULATOR,LOW_BATTERY,DEBUGGABLE"

    }

    testBuildType = "release"
    buildTypes {
        debug {
            // Since isDebuggable can"t be modified by gradle for library modules,
            // it must be done in a manifest - see src/androidTest/AndroidManifest.xml
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "benchmark-proguard-rules.pro"
            )
        }
        release {
            isDefault = true
        }
    }
}

dependencies {
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.benchmark:benchmark-junit4:1.1.1")
    // Add your dependencies here. Note that you cannot benchmark code
    // in an app module this way - you will need to move any code you
    // want to benchmark to a library module:
    // https://developer.android.com/studio/projects/android-library#Convert
    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.google.code.gson:gson:2.10")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    implementation("com.alibaba.fastjson2:fastjson2:2.0.40.android4")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    implementation("com.google.protobuf:protobuf-java:3.24.3")
    implementation("com.google.protobuf:protobuf-java-util:3.24.3")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")

    implementation("com.NBXXF.gson_plugin:lib_gson_annotation:1.4.0-SNAPSHOT")
    kapt("com.NBXXF.gson_plugin:lib_gson_plugin_kapt:1.4.0-SNAPSHOT")
}
kapt {
    arguments {
        arg("factory", "com.xxf.json.gson.plugin.AutoTypeAdapterFactory")
        //arg("pro", project.name)
    }
}
