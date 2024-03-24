# QA Automation - Native App

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

There is no need to start the appium server manually, as the program will do so upon execution.

From the directory of the POM.xml :

```
mvn clean install
```

You can use the [uiautomatorviewer](https://developer.android.com/training/testing/ui-testing/uiautomator-testing) to inspect elements on Android devices, or you can use [Appium Desktop](https://github.com/appium/appium-desktop)


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - Framework
* [Appium](http://appium.io/) -  Native App automation framework
* [Allure](https://allurereport.org/) -  Allure report

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