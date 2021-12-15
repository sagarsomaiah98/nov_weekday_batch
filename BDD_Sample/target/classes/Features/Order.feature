Feature: Add to cart Feature
Scenario: AddTocart Test
Given I launch the chome browser
When I enter the url
When I enter the username and password
And I click login
Then I am logged in successfully
And I click on add to cart
When I click on cart
When I click checkout
And I enter the details
And I click continue
When I click finish
Then order is placed successfully