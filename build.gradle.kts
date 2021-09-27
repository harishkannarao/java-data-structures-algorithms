plugins {
	id("java")
}

// variables for gradle.properties
val javaVersion: String by project
val className: String by project
val junitVersion: String by project
val assertjVersion: String by project

group = "com.harishkannarao.java.dsa"
version = ""
java.sourceCompatibility = JavaVersion.toVersion(javaVersion)

allprojects {

	apply(plugin= "java")

	repositories {
		mavenCentral()
	}

	dependencies {
		testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
		testImplementation("org.assertj:assertj-core:$assertjVersion")
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	task<JavaExec>("runClass") {
		description = "Execute Main Program"
		mainClass.set(className)
		classpath = sourceSets["main"].runtimeClasspath
		dependsOn(tasks["compileJava"])
	}
}
