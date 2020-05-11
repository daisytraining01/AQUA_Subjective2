#Author: your.debasis@maveric.com

@tag
Feature:  Smoke test for Online Banking.
 

  @smoke01
  Scenario Outline: Login Functionality
    Given  I should be at the login page.
    And   I provide valid user name and password.
    When I click on Sign in  button.
    Then I should be able to Login.
    
    
    |  Name | labuser| 
    | Password | labuser@01|
    
 @smoke02
Scenario Outline: Unsuccessful login
Given I should be at Login Page
And I  enter "user" with "debasis27@gmail.com" 
And I enters "password" with "qs@1234"  
And  clicks on "sign in " button
Then error message displayed with wrong password
And user returns back on login page.
    
  
    |  Name |debasis27@gmail.com| 
    | Password | qs@1234|

