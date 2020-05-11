#Author: your.email@your.domain.com

@smoke03
Feature: Smoke test for Online Banking.
  Scenario Outline: Withdraw

 Given  I should be at the login page.
    And   I provide valid user name and password.
    When I click on Sign in  button.
    Then I should be able to Home page.
    And click on withdraw.
    And Select account type from drop down.
    And enter the amount in amount text box.
    And click on withdraw.
    Then I should be able to withdraw.
    
    
    
    
    
    @smoke04
  
  Scenario Outline: Withdraw
  Given  I should be at the login page.
    And   I provide valid user name and password.
    When I click on Sign in  button.
    Then I should be able to Home page.
    And click on withdraw.
    And Select account type from drop down.
    And enter the amount in amount text box.
    And click on withdraw.
    Then I should be able to withdraw.
  



  
