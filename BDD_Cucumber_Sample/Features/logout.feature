Feature: Logout  of the application
Scenario: LogOut Test
Given I launch the chrome browser
When I enter the url "https://www.saucedemo.com/"
And I enter the username "standard_user"
And I enter the password "secret_sauce"
And I click submit
Then I am logged in successfully
And I click menu
And I click logout
Then I am logged out of the application