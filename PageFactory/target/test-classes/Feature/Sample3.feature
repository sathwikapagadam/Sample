Feature:
Scenario: To check login functionality of the Application
Given User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When User enters the 	Login Credentials
|TestData1.xlsx|
And User clicks on the Login button
Then User verifies the Profile Account
And User closes the Browser


