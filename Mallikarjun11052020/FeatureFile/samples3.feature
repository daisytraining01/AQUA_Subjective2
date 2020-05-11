Feature: Smoke Test

@Scenario3
Scenario: Login logout
 Given I have url
 When I enter the credentials
 And I click login button
 Then I am able to navigate to Homepage
