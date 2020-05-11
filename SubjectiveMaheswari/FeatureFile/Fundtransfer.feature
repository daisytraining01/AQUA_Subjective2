 Feature: RapidTestPro application


Background: 

Given I have url
When I enter the username and password

@test1
Scenario: Fund Transfer Between Accounts
When I enter the fund details
And I click transfer button
Then I able to see the reduced balance

@test2
Scenario: Add/Edit Recipient
When I fill recipient information
And I click add button
Then I able to see the added recipient