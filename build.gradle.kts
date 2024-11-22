plugins {
  kotlin("jvm") version "2.0.21"
  id("io.spring.dependency-management") version "1.1.3"
  id("application")
  alias(libs.plugins.githook)
}

allprojects {
  group = "com.alejandromateo"
  version = "0.0.1-SNAPSHOT"

  repositories {
    mavenCentral()
  }
}

subprojects {
  apply(plugin = "kotlin")
  apply(plugin = "io.spring.dependency-management")

  java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
  }

  dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}

tasks.register<Exec>("gitRestage") {
  description = "Add changes to staged files to git."
  commandLine = listOf("git", "update-index", "--again")
}

githook {
  failOnMissingHooksDir = true
  createHooksDirIfNotExist = true

  hooks.create("pre-commit") {
    task = "spotlessApply gitRestage -q spotlessCheck checkBranch"
    shell = "echo \"Latest changes have been autoformatted correctly with Spotless!\""
  }
}


