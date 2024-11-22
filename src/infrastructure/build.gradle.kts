

dependencies {
  implementation(project(":src:application", configuration = "default"))

  implementation(libs.bundles.spring)
  implementation(kotlin("stdlib"))
}

