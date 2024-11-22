plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.7.22"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-validation:2.6.6")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.25")
    testImplementation("io.mockk:mockk:1.12.7")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
}
