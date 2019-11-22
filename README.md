# An E2E Test Project for manual and autmation testing

# 1- Introduction
## • In this project I have prepared some test cases for manual and automation to make some transactions for http://cafetownsend-angular-rails.herokuapp.com/login application. 
## • There are many test scenarios under the https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/tree/master/docs/test-cases folder. 
![test_cases](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/TestCases.PNG)
## • If you want to run full suite as manuel, please apply the AlLCases sheet in excel file. 
## • But if you want to run only specific scenarios, you can switch to particular sheet in same excel file. 
## • For more, please download file.
## • Tester can decide to which tests should be automated or manual according to the scenarios. Each test step has test data and requirement if needed. So, if you want to gain a clear path, just follow the scenario :)


# 2- For Automation, Why Selenium, Maven and Cucumber?

Basically for these frameworks / concepts we can say:
## • Selenium : This article describes clearly https://dzone.com/articles/11-reasons-why-go-for-automation-testing-using-sel
## • Maven: Dependency Management is clearly declared in Maven
## • Cucumber: Understandable format (like plain English) to Business Analysts, Developers, Testers, etc

## 2.1 Framework
Here are a framework that i developed for automation tests using maven and junit with cucumber
## Consider the following user story for automated test examples:
### Feature1:  Add user to list    
#### • As a Test Automation Developer
#### • I want to login to application and
#### • I want to add item to list

### Feature2:  Valid Login  
#### • As a Test Automation Developer
#### • I want to login to application and
#### • I try to close browser

## 2.2 Framework structure looks as below.
![framework_template_1](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/ProjectStructure.png)

# I used Page Object Design Pattern in this framework. 
## Some Advantages of POM
### • Avoid to write the duplicate locators for same WebElement
### • Maintenance of the test script which becomes very easy
### • Robust and more readable
### • The Object-oriented approach makes the framework programmer friendly

# 3- Running
In above framework there are two simple scenarios for login and adding a record to 'http://cafetownsend-angular-rails.herokuapp.com/'
### • For execute the test scenarios follow the steps below
Requirements:
- Java 1.8 or higher
- Maven 3.6 or higher

#### • First, clone or download the project to your computer
#### • Open the project in eclipse (File->Open Projects From File System)
#### • Under the src/test/java package find the runners
#### • In a runner class right click on mouse and run as JUnit test scenario as below 
![framework_template_1](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/RunCucumberTest.png)
#### • or watch this video
https://youtu.be/wvrdnVB5Xus
#### • Thats it :)


# 4- Reports
• Junit and Cucumber you provides effective report types to us. You can see this reports under the TestReports folder after the execution. Here are some of them: 
### Console Output 
![console](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/CucumberConsoleResult.PNG)
### HTML Report 
![htmlreport](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/TestOutput.PNG)
### Junit Report 
![htmlreport](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/CucumberJunitResult.PNG)


