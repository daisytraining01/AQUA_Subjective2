Feature: Smoke Test

@Scenario2
Scenario: Login logout
Given I have url
When I enter the credentials
And I click login button
Then I see the homepage

