Feature: Sauce Login Feature
Scenario: Valid sauce login test
Given I launch the chome browser
When I enter the url
When I enter the username "performance_glitch_user" and password "secret_sauce"
And I click login
Then I am logged in successfully