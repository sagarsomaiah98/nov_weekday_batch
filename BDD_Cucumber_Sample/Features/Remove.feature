Feature: Remove the item from cart
Scenario: Remove cart item
Given I launch the chrome browser
When I enter the url "https://www.saucedemo.com/"
And I enter the username "standard_user"
And I enter the password "secret_sauce"
And I click submit
When I click AddToCart
And I click on Cart
And I click on Remove
And I click on Continue Shopping
Then I am navigated to Home Page
