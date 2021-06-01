/*
 * Copyright (c) 2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "org.acra.example"
        minSdkVersion(16)
        targetSdkVersion(30)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    val acraVersion = "5.8.2"
    implementation("ch.acra:acra-http:$acraVersion")

    annotationProcessor("com.google.auto.service:auto-service:1.0")
    compileOnly("com.google.auto.service:auto-service-annotations:1.0")
}
