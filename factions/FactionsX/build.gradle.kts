fun getEnvOrProp(variableName: String, propertyName: String): String {
    val environmentProvider = providers.environmentVariable(variableName)
    val propertyProvider = providers.gradleProperty(propertyName)
    return environmentProvider.orElse(propertyProvider).orElse("").get()
}

repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://maven.elmakers.com/repository/")
}

dependencies {
    // Local Dependencies
    compileOnly(project(":factions:abstract"))

    // FactionsX
    compileOnly("net.prosavage.factionsx:FactionsX:1.2-STABLE")
}
