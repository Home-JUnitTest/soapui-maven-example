# SoapUI Maven Automation Example

* [soapui-maven-example](https://github.com/O5ten/soapui-maven-example)
* [JDK 8u191](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)



Это пример настройки для SoapUI-maven интеграции, используя простой очень простой pom, чтобы включить плагин soapui maven.
Его можно использовать для придания API-теста автоматизации для вашего проекта или использования его в качестве инструмента мониторинга службы.

Run with:
```bash
   mvn clean install
```

Проект SoapUI содержит один testsuite и mockService на 8080 с единственным ресурсом /hello

Единственный тестовый пример состоит из трех этапов.
### 1. Start the mockservice
```
  http://localhost:8080/hello
```
which returns 
```json
{
   "hello": "world"
}
```

### 2. HTTP GET Request to http://localhost:8080/hello
And one assertion
```
Assert that payload contains "world"
```

### 3. Stop the mockservice


* https://coderanch.com/t/669860/java/javafx-packages-java-Fedora-Gnu
* http://qaru.site/questions/494249/jfxrtjar-not-in-jdk-18
* http://qaru.site/questions/148010/whats-the-location-of-the-javafx-runtime-jar-file-jfxrtjar-on-linux
* https://www.oracle.com/webfolder/technetwork/tutorials/OracleCode/Windows-HOL-setup.pdf

