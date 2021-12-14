$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddTocart.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart Feature",
  "description": "",
  "id": "add-to-cart-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "AddTocart Test",
  "description": "",
  "id": "add-to-cart-feature;addtocart-test",
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
formatter.step({
  "line": 8,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "item is added to cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_launch_the_chome_browser()"
});
formatter.result({
  "duration": 414341800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_url()"
});
formatter.result({
  "duration": 111500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_username_and_password()"
});
formatter.result({
  "duration": 120100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login()"
});
formatter.result({
  "duration": 122200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_in_successfully()"
});
formatter.result({
  "duration": 106900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_add_to_cart()"
});
formatter.result({
  "duration": 112500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.item_is_added_to_cart_successfully()"
});
formatter.result({
  "duration": 104300,
  "status": "passed"
});
formatter.uri("Login.feature");
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
  "duration": 101700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_url()"
});
formatter.result({
  "duration": 73400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_the_username_and_password()"
});
formatter.result({
  "duration": 83500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login()"
});
formatter.result({
  "duration": 84200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_in_successfully()"
});
formatter.result({
  "duration": 67200,
  "status": "passed"
});
});