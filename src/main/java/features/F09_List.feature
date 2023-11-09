#Author: your.email@your.domain.com

Feature:   Validation for the List


Scenario:  Validation for the List

#TC018 Click on the Alwyn street

    When Click Fleet User for Alwyn street
    Then Enter Fleet ID for Alwyn street as '6174242'
    Then Enter the Username for Alwyn street as 'demouser@amberconnect.co.za'
    Then Enter the password for Alwyn street as 'Amber@2327'
    Then Select User Type as Admin for Alwyn street
    Then Select the Privacy Policy checkbox for Alwyn street
    Then click Login button for Alwyn street
    Then Click on the trips for Alwyn street
    Then click on the filter and SADEMO5 and apply for Alwyn street
    Then click on the List and click on the first three check boxes
    Then click on the classify selected trips and click on the Business
    Then click on the Download and click on Export in XLS
    Then click on the first Link nearby end
    Then Assertion of the Business
