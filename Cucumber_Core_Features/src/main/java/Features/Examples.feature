Feature: Login Functionality

Scenario Outline: Verify login
Given Launch the browser and navigate to application
When I enter "<username>" and "<password>"
And I click login
And I close the browser
Examples:
|username|password|
|standard_users|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|