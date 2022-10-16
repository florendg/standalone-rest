plugins {
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("dev.vultureweb.jakarta.booty.Boot")
}

dependencies {
    implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")
    implementation("org.jboss.resteasy:resteasy-core:6.2.0.Final")
    implementation("org.jboss.resteasy:resteasy-undertow:6.2.0.Final")
    implementation("org.jboss.resteasy:resteasy-json-binding-provider:6.2.0.Final")
}

