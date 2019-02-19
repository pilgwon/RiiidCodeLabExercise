plugins {
  kotlin("jvm") version "1.3.21"
  application
}

application {
  mainClassName = "app.pilgwon.example.MainKt"
}

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
}



