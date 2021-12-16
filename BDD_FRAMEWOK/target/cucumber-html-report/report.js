$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
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
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 4018326000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 61
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 314250000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 3416722100,
  "status": "passed"
});
formatter.after({
  "duration": 723912200,
  "status": "passed"
});
formatter.uri("Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout of the application",
  "description": "",
  "id": "logout-of-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "LogOut",
  "description": "",
  "id": "logout-of-the-application;logout",
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
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I logOut",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 2190833100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 61
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 345830700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 3493392500,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepDefintion.i_logOut()"
});
formatter.result({
  "duration": 2345937200,
  "status": "passed"
});
formatter.after({
  "duration": 743502300,
  "status": "passed"
});
formatter.uri("PlaceOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart and Place Order",
  "description": "",
  "id": "add-to-cart-and-place-order",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Place order",
  "description": "",
  "id": "add-to-cart-and-place-order;place-order",
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
formatter.step({
  "line": 6,
  "name": "I add the item to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the details \"Dean\" \"Win\" \"2134\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click continue",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify total value",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click Finish",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the order",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 2191008700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 61
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 341221000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 3500457100,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_add_the_item_to_the_cart()"
});
formatter.result({
  "duration": 70143100,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_click_cart()"
});
formatter.result({
  "duration": 95737100,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_click_checkout()"
});
formatter.result({
  "duration": 86848100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dean",
      "offset": 21
    },
    {
      "val": "Win",
      "offset": 28
    },
    {
      "val": "2134",
      "offset": 34
    }
  ],
  "location": "OrderStepDefinition.i_enter_the_details(String,String,String)"
});
formatter.result({
  "duration": 293829200,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_click_continue()"
});
formatter.result({
  "duration": 97217400,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_verify_total_value()"
});
formatter.result({
  "duration": 39252200,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_click_Finish()"
});
formatter.result({
  "duration": 71034200,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_verify_the_order()"
});
formatter.result({
  "duration": 2268333500,
  "status": "passed"
});
formatter.match({
  "location": "OrderStepDefinition.i_navigate_to_home_page()"
});
formatter.result({
  "duration": 83306900,
  "status": "passed"
});
formatter.after({
  "duration": 803485200,
  "status": "passed"
});
});