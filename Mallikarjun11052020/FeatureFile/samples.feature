Feature: Smoke Test

@Scenario1
Scenario: Login logout
 Given I have url
 When I enter the credentials
 And I click login button
 Then I am able to navigate to Homepage
 When I click on Transfer Between Accounts
 And Enter the required details
 Then Transfer functionality is successfully verified
 
 
