buildscript {
    val kotlinVersion = "1.1.0-rc-91"

    extra["kotlinVersion"] = kotlinVersion

    repositories {
        gradleScriptKotlin()
        mavenCentral()
        maven { setUrl("http://dl.bintray.com/kotlin/kotlin-eap-1.1") }
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
    }
}

val kotlinVersion = extra["kotlinVersion"] as String

subprojects {
    group = "br.com.sidlar.stopwatch.swkata"
    version = "0.0.1-SNAPSHOT"

    apply {
        plugin("kotlin")
        plugin("maven")
    }

    configure<JavaPluginConvention> {
        setSourceCompatibility(1.8)
        setTargetCompatibility(1.8)
    }

    repositories {
        mavenCentral()
        maven { setUrl("http://dl.bintray.com/kotlin/kotlin-eap-1.1") }
        maven { setUrl("https://jitpack.io") }
    }

    dependencies {
        compile(kotlinModule("stdlib", kotlinVersion))
        compile(kotlinModule("reflect", kotlinVersion))

        compile("org.threeten:threeten-extra:1.0")
        compile("org.apache.commons:commons-lang3:3.4")
        compile("org.apache.commons:commons-collections4:4.1")

        compile("com.google.guava:guava:21.0")

        testCompile("junit:junit:4.12")
        testCompile("org.assertj:assertj-core:3.6.2")
        testCompile("org.assertj:assertj-guava:3.1.0")
    }

}

