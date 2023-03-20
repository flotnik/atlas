description = "Atlas Appium"

dependencies {
    api(project(":atlas-core"))
    api(project(":atlas-webdriver"))

    implementation("io.appium:java-client")
    implementation("org.seleniumhq.selenium:selenium-java")
    implementation("ru.yandex.qatools.matchers:webdriver-matchers")
    implementation("org.awaitility:awaitility")
    
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.apache.commons:commons-lang3")
    testImplementation("junit:junit")
}
