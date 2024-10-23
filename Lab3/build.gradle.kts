plugins {
    application
    id("java")

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:7.20.1")
    testImplementation("com.pholser:junit-quickcheck-core:1.0")
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("net.jqwik:jqwik:1.7.0")

}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "com.lab3.ZooApp"
}

