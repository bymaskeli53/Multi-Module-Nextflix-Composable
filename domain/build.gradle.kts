plugins {
    id("kotlin")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Kotlin.coroutines}")
    implementation("javax.inject:javax.inject:${Jvm.inject}")
    
    implementation("com.squareup.retrofit2:retrofit:${Network.retrofit}")
}