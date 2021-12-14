Feature: Login to orange hrm application
Scenario: Login Orange Test
Given I launch the Firefox Browser
When I navigate to url
And I enter the username
And I enter the password
And I click on login
Then I am on home page