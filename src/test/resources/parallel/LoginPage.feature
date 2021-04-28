Feature: Login page

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forget password link
Given user is on login page 
Then forget your password link should be displayed

Scenario: Login with correct cred
Given user is on login page 
When user enters username "amitkjhajharia@gmail.com"
And user enters password "selenium@123"
And user clicks on Login button
Then user gets the title of the page 
And page title should be "My account - My Store"


