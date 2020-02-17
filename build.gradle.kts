plugins {
    base

    java
    kotlin("jvm") version "1.3.61"
}

allprojects {
    group = "com.phodal.tbs"
    version = "0.0.3"
    description = "Chapi is A common language meta information convertor, convert different languages to same meta-data model"

    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
    }
}

dependencies {
    implementation("com.phodal:chapi-domain:0.0.3")
    implementation("com.phodal:chapi-application:0.0.3")
    implementation("com.phodal:chapi-ast-java:0.0.3")

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    // Kotlin reflection.
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))

    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    testRuntimeOnly("org.junit.platform:junit-platform-console:1.6.0")
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

//val compileKotlin: KotlinCompile by tasks
//compileKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}
//val compileTestKotlin: KotlinCompile by tasks
//compileTestKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}
