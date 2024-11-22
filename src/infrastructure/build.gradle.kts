plugins {
  id("application")

}

application {
  mainClass.set("com.alejandromateo.hexagonal.infrastructure.SpringAppKt")
}

dependencies {
  implementation(project(":src:application", configuration = "default"))

  implementation(libs.bundles.spring)
  implementation(kotlin("stdlib"))

  testImplementation(libs.bundles.testbase)
}
