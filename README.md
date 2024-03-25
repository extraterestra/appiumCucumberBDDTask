# QA Automation: Appium - Android - Java - Cucumber BDD - Allure report

* This is a Cucumber - Appium Framework for  Android devices

## Getting Started

```
git clone https://github.com/extraterestra/appiumCucumberBDDTask.git
```

### Prerequisites

* Maven Installed
* Java v11 installed and JAVA_HOME set
* Android Studio configured to launch an emulator
* A native app SDK 
* Configure Android Path on your environment variables

  ANDROID_HOME: root android sdk directory in Android Studio

  PATH: ANDROID_HOME + the following paths = platform-tools, tools, tools/bin

* [Appium](https://www.npmjs.com/package/appium)
```
npm i appium
```

### Installing

From the directory of the POM.xml :

```
mvn clean install
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - Framework
* [Appium](http://appium.io/) -  Native App automation framework
* [Allure](https://allurereport.org/) -  Allure report

On this stage of framework Appium server should be run manualy on background with command:
```
appium
```
Run with maven command:
```
mvn test -D"cucumber.filter.tags=@smoke"
```
Allure report to be generated with command:
```
allure serve
```
## Contributing

N/A

## Versioning

N/A

## Authors

* **Sergiy Kucheryavyy**


## License

N/A

## Acknowledgments

N/A