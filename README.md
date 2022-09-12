# JavaForAutomation
Automation using selenium 4
Java 11 or above is required

## Selenium 4
Launch browser

```java
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();

String url = "https://example.com";

//Open the browser window
driver.get(url);

//Maximize the browser window
driver.manage().window().maximize();

```

Close browser

```java
driver.quit();
```

### Editing pom.xml

Selenium 4 dependency

```
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
 <groupId>org.seleniumhq.selenium</groupId>
 <artifactId>selenium-java</artifactId>
 <version>4.4.0</version>
</dependency>
```

Webdrivermanager dependency 

```
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
 <groupId>io.github.bonigarcia</groupId>
 <artifactId>webdrivermanager</artifactId>
 <version>5.2.3</version>
</dependency>
```
