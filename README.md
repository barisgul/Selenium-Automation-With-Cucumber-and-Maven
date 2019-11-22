# Selenium-Automation-With-Cucumber-and-Maven
A Selenium Test Automation Framework with Maven and Cucumber 

# Framework structure looks as below.
![framework_template_1](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/ProjectStructure.png)

# I used Page Object Design Pattern in this framework. 
## Some Advantages of POM
### • Avoid to write the duplicate locators for same WebElement
### • Maintenance of the test script which becomes very easy
### • Robust and more readable
### • The Object-oriented approach makes the framework programmer friendly

# Running
In above framework there are two simple scenarios for login and adding a record to 'http://cafetownsend-angular-rails.herokuapp.com/'
## Consider the following user story:
As a client I want to add ,delete and update employees to list or from list. In framework i write 2 scenarios for login and adding an employee.
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


# Reports
• Junit and Cucumber you provides effective report types to us. You can see this reports under the TestReports folder after the execution. Here are some of them: 
### Console Output 
![console](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/CucumberConsoleResult.PNG)
### HTML Report 
![htmlreport](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/TestOutput.PNG)
### Junit Report 
![htmlreport](https://github.com/barisgul/Selenium-Automation-With-Cucumber-and-Maven/blob/master/docs/images/CucumberJunitResult.PNG)


