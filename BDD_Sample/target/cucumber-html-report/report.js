$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JANBASK/NOV WEEKDAY BATCH/BDD_Sample/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Valid login test",
  "description": "",
  "id": "login-feature;valid-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the chome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I am logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_launch_the_chome_browser()"
});
formatter.result({
  "duration": 3929938400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_url()"
});
formatter.result({
  "duration": 803522200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_username_and_password()"
});
formatter.result({
  "duration": 332885800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login()"
});
formatter.result({
  "duration": 3167915400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_in_successfully()"
});
formatter.result({
  "duration": 61233600,
  "status": "passed"
});
});