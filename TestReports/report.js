$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/EmployeeTests.feature");
formatter.feature({
  "line": 1,
  "name": "Employee Tests",
  "description": "As a Test Automation Developer\nI want to login to application and\nI want to add item and delete record from list",
  "id": "employee-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Add user to list",
  "description": "",
  "id": "employee-tests;add-user-to-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@addAndDelete"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am a user of http://cafetownsend-angular-rails.herokuapp.com/login",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I log in using valid credentials",
  "rows": [
    {
      "cells": [
        "userName",
        "Luke"
      ],
      "line": 10
    },
    {
      "cells": [
        "password",
        "Skywalker"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click to Create button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I fill the employee fields with below criterias",
  "rows": [
    {
      "cells": [
        "FirstName",
        "fName"
      ],
      "line": 15
    },
    {
      "cells": [
        "LastName",
        "lName"
      ],
      "line": 16
    },
    {
      "cells": [
        "StartDate",
        "2019-11-22"
      ],
      "line": 17
    },
    {
      "cells": [
        "Email",
        "temp@temp.com"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click to Add button employee should be added",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "i click to my added item",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "i click to delete button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "popup message should be appeared",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "i click to OK button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I click on Logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I should logout successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "UITestSteps.userOfCafetownsend()"
});
formatter.result({
  "duration": 13456072700,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.loginWithCredentials(DataTable)"
});
formatter.result({
  "duration": 806253200,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.successLogon()"
});
formatter.result({
  "duration": 50866400,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.clickOnCreate()"
});
formatter.result({
  "duration": 585679600,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.setEmployeeData(DataTable)"
});
formatter.result({
  "duration": 1380305000,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.clickOnAdd()"
});
formatter.result({
  "duration": 808558400,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.clickOnAddedItemFromList()"
});
formatter.result({
  "duration": 163577800,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.clickOnDelete()"
});
formatter.result({
  "duration": 344705800,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.popupMessageShouldBeAppeared()"
});
formatter.result({
  "duration": 11657700,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.clickOnPopupOk()"
});
formatter.result({
  "duration": 18376100,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.logout()"
});
formatter.result({
  "duration": 79700,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.logoutIsSucceed()"
});
formatter.result({
  "duration": 67000,
  "status": "passed"
});
formatter.match({
  "location": "UITestSteps.closeBrowser()"
});
formatter.result({
  "duration": 899694400,
  "status": "passed"
});
});