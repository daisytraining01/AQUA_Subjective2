Feature: This file contains all the scenarios related to rapidTest

Scenario: Verify if the user is able to deposit amount to savings account

Given user logs in to the application
Then user deposits amount to savings account and verifies the saving amount

Scenario Outline: Verify if user is able to withdraw amount

Given user logs in to the application
When the user withdraws "<Amount>" from savings account
Then the withdrawn amount should be deducted from savings account

Examples:
|Amount|
|1000.00|

