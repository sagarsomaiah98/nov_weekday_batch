Feature: Login Feature
Scenario: Valid login test
Given I launch the chome browser
When I enter the url
When I enter the username and password
And I click login
Then I am logged in successfully