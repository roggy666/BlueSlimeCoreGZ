fun getEnvOrProp(variableName: String, propertyName: String): String {
    val environmentProvider = providers.environmentVariable(variableName)
    val propertyProvider = providers.gradleProperty(propertyName)
    return environmentProvider.orElse(propertyProvider).orElse("").get()
}

tasks.named("jar") {
    enabled = false
}

subprojects {
    repositories {
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://maven.elmakers.com/repository/")
        maven("https://repo.codemc.io/repository/nms/")

        mavenLocal()
    }

    dependencies {
        // Local Dependencies
        compileOnly(project(path = ":shaded", configuration = "shadow"))
        compileOnly(project(":utility"))
    }
}
