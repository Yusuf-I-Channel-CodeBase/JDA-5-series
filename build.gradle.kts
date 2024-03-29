plugins {
    id("java")
    id("application")
}

group = "io.github.realyusufismail"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JDA
    implementation("net.dv8tion:JDA:5.0.0-beta.20")

    // Jconfig
    implementation("io.github.realyusufismail:jconfig:1.1.2")

    // Classgraph
    implementation("io.github.classgraph:classgraph:4.8.165")

    // Logging
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("ch.qos.logback:logback-core:1.4.14")
    implementation("uk.org.lidalia:sysout-over-slf4j:1.0.2")

    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "io.github.realyusufismail.JDA5Bot"
}
