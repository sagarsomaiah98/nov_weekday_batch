$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JANBASK/OCT_WEEKDAY_BATCH/BDD_FRAMEWOK/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login-to-application;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the username \"standard_user\" and enter the password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click submit",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "status": "skipped"
});
});