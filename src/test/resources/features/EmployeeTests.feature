Feature: Employee Tests
  As a Test Automation Developer
  I want to login to application and
  I want to add item to list

  @add
  Scenario: Add user to list  
		Given I am a user of http://cafetownsend-angular-rails.herokuapp.com/login
		When I log in using valid credentials
		| userName |   Luke        | 
    | password |   Skywalker   | 
		Then I should be logged in
		Then I click to Create button
		Then I fill the employee fields with below criterias
		| FirstName |   fName         | 
    | LastName  |   lName         |
    | StartDate |   2019-11-22    |
    | Email     |   temp@temp.com |
    When I click to Add button employee should be added   
    Then I click on Logout button
    Then I should logout successfully
    Then I close browser
 
