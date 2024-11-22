

dependencies {
  implementation(project(":src:domain", configuration = "default"))
  implementation(libs.bundles.spring)
  implementation(kotlin("stdlib"))
}

