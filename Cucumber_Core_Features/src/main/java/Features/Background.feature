Feature: Background
Background: Background test
Given I am running background test

Scenario: Verify login
Given Launch the browser and navigate to application
When I enter username and password
And I click login
And I close the browser

Scenario:Verify logout
Given I am on homepage
And I click logout button
Then i am logged out