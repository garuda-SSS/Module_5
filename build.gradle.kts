plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5
    testImplementation(platform("org.junit:junit-bom:5.10.0")) // Управление версиями
    testImplementation("org.junit.jupiter:junit-jupiter-api")   // API тестов
    testImplementation("org.junit.jupiter:junit-jupiter-params") // Параметризованные тесты
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")  // Движок выполнения
    testRuntimeOnly("org.junit.platform:junit-platform-launcher") // Для Gradle 8+
}

tasks.test {
    useJUnitPlatform()

    // Настройки параллельности для Gradle
//    maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).coerceAtLeast(1) // Оптимальное число потоков

    // Логирование
    testLogging {
        events("passed", "skipped", "failed", "started")
        showStandardStreams = true  // Показывает stdout/stderr
        showCauses = true
    }

    // Настройки параллельности для JUnit
    systemProperties.putAll(mapOf(
        "junit.jupiter.execution.parallel.enabled" to "true",
        "junit.jupiter.execution.parallel.mode.default" to "concurrent",
        "junit.jupiter.execution.parallel.mode.classes.default" to "concurrent",
        "junit.jupiter.execution.parallel.config.fixed.parallelism" to 4
    ))
}
