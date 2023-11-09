#Author: your.email@your.domain.com
Feature: Validation for the logout


Scenario: TC016 Validation for the logout
     
   When Click Fleet User option for the logout
    When Enter Fleet ID for the logout as '6174242'
    And Enter the Username for the logout as 'demouser@amberconnect.co.za'
    And Enter the password for the logout as 'Amber@2327'
    And Select User Type as Admin for the logout
    Then Select the Privacy Policy checkbox for the logout
    Then Click Login button for the logout
    Then Click on the welcome SA demo and logout
    Then Validate the logout