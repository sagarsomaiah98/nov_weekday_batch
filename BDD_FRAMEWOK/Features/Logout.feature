Feature: Logout of the application
Scenario: LogOut
Given Launch the browser and enter the url 
When I enter the username "standard_user" and enter the password "secret_sauce"
And I click submit
Then I logOut