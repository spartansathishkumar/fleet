#Author: your.email@your.domain.com

Feature:   Validation for the Multi Trip View


Scenario: Validation for the Multi Trip View

#TC019 Click on the Live tracking

    When Click Fleet User for Multi Trip View
    Then Enter Fleet ID for Multi Trip View as '6174242'
    Then Enter the Username for Multi Trip View as 'demouser@amberconnect.co.za'
    Then Enter the password for Multi Trip View as 'Amber@2327'
    Then Select User Type as Admin for Multi Trip View
    Then Select the Privacy Policy checkbox for Multi Trip View
    Then click Login button for Multi Trip View
    Then Click on the trips for Multi Trip View
    Then click on the filter and SADEMO5 and apply for Multi Trip View
    
    Then click on the Multi Trip View2 
   