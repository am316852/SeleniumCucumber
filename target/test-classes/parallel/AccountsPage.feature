Feature: Accounts page

Background: 
Given user has already loged in to application 

|username|password|
|amitkjhajharia@gmail.com|selenium@123|


Scenario: Page Title
Given user is on accounts page
When user gets the title of the page
Then page title should be "My account - My Store"


Scenario: Accounts Section
Given user is on accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6



