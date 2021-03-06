# SoapUI Maven Automation Example

* [soapui-maven-example](https://github.com/O5ten/soapui-maven-example)
* [JDK 8u191](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [XML Formatter](https://www.freeformatter.com/xml-formatter.html)
* [Online JSON Viewer](http://jsonviewer.stack.hu)


Это пример настройки для SoapUI-maven интеграции, используя простой очень простой pom, чтобы включить плагин soapui maven.
Его можно использовать для придания API-теста автоматизации для вашего проекта или использования его в качестве инструмента мониторинга службы.

Run with:
```bash
   mvn clean install
```

SoapUI-проект [soapui-maven-example.xml](example-hello/soapui-maven-example.xml) содержит один `testSuite` и `restMockService` который подымается на порту `8080` и с единственным ресурсом [/hello](http://localhost:8080/hello)

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


---

Пример реального SoapUI-проекта [MDES-soapui-project.xml](MDES/MDES-soapui-project.xml) сгенерированного с помощью инструмента [SoapUI](https://www.soapui.org)  

---


* https://coderanch.com/t/669860/java/javafx-packages-java-Fedora-Gnu
* http://qaru.site/questions/494249/jfxrtjar-not-in-jdk-18
* http://qaru.site/questions/148010/whats-the-location-of-the-javafx-runtime-jar-file-jfxrtjar-on-linux
* https://www.oracle.com/webfolder/technetwork/tutorials/OracleCode/Windows-HOL-setup.pdf


# [Регрессионное тестирование](https://ru.wikipedia.org/wiki/Регрессионное_тестирование)

Такие ошибки — когда после внесения изменений в программу перестаёт работать то, что должно было продолжать работать — называют регрессионными ошибками.
Регрессионное тестирование может быть выполнено и вручную, но чаще всего это делается с помощью специализированных программ, позволяющих выполнять все регрессионные тесты автоматически.


* https://community.smartbear.com/t5/SoapUI-Open-Source/Eclipse-Maven-integration-of-Soapui-free-edition/td-p/123128
* https://community.smartbear.com/t5/SoapUI-Open-Source/Eclipse-Maven-integration-of-Soapui-free-edition/td-p/123128/page/2
