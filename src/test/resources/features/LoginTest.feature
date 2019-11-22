Feature: Cafe Townsend Test Cases
As a test automation developer 
I try to login with valid credentials and
I try to close browser

@validLogin
Scenario: Valid Login
		Given I am a user of http://cafetownsend-angular-rails.herokuapp.com/login
		When I log in using valid credentials
		| userName |   Luke        | 
    | password |   Skywalker   | 
		Then I should be logged in
		Then I click on Logout button
		Then I should logout successfully
		Then I close browser