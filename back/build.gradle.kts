plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    id("org.openapi.generator") version "7.2.0"
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

openApiGenerate {
    generatorName = "spring"
    inputSpec = "$rootDir/apis/cf-rating-service.yaml"
    outputDir = "$rootDir/libraries/cf-rating-service-server"
    apiPackage = "com.pajehyk.generated.server.api"
    templateDir = "$rootDir/spring-template"
    modelPackage = "com.pajehyk.generated.server.model"
    invokerPackage = "com.pajehyk.generated.invoker"
    configOptions = buildMap {
        put("configPackage", "com.pajehyk.generated.configuration")
        put("useSpringBoot3", "true")
    }
}
