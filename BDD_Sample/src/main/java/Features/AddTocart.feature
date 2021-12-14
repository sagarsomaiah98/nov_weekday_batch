Feature: Add to cart Feature
Scenario: AddTocart Test
Given I launch the chome browser
When I enter the url
When I enter the username and password
And I click login
Then I am logged in successfully
And I click on add to cart
Then item is added to cart successfully