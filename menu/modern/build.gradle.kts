repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://maven.elmakers.com/repository/")
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    // Local Dependencies
    compileOnly(project(":menu"))

    // Spigot API
    compileOnly("org.spigotmc:spigot-api:1.21.8-R0.1-SNAPSHOT")
}
