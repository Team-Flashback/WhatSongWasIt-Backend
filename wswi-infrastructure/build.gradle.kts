plugins {
    id("org.springframework.boot") version PluginVersion.SPRING_BOOT
    id("io.spring.dependency-management") version PluginVersion.SPRING_DEPENDENCY_MANAGEMENT
    kotlin("plugin.spring") version PluginVersion.SPRING_PLUGIN
    kotlin("plugin.jpa") version PluginVersion.JPA_PLUGIN
}

dependencies {
    implementation(project(":wswi-domain"))
    implementation(project(":wswi-application"))
    implementation(project(":wswi-presentation"))
}