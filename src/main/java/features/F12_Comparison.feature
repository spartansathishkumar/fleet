#Author: your.email@your.domain.com

Feature:   Validation for the comparison


Scenario: Validation for the comparison

#TC021 Validation for the comparison

    When Click Fleet User for comparison
    Then Enter Fleet ID for comparison as '6174242'
    Then Enter the Username for comparison as 'demouser@amberconnect.co.za'
    Then Enter the password for comparison as 'Amber@2327'
    Then Select User Type as Admin for comparison
    Then Select the Privacy Policy checkbox for comparison
    Then click Login button for comparison
    Then Click on the Analytics and comparison 
    Then Assertion of select maximum upto twenty vehicles for the comparison report
    Then Click the filter and select all the vehicles except SADEMO6 and apply
    Then Assertion for the Key Performance Indicators with selected vehicles
    Then Assertion for the comparison report with selected vehicles
    Then Screenshot of the first graph which is shown below the comparison report
    Then Screenshot of the second graph which is shown below the comparison report
    Then Screenshot of the third graph which is shown below the comparison report
    Then Click on the Trip reports and Screenshot of first graph which is shown below the Trip reports
    Then Screenshot of second graph which is shown below the Trip reports
    Then Click on the Analytics report and export files for the default date range
    Then Select the last month
    Then Screenshot of the second graph under last month
    Then Screenshot of the third graph under last month
    Then Click on the Trip reports and Screenshot of the first graph under last month
    Then Take screenshot of the second graph under last month
    Then click on the back and highlights 
    Then Assertion for the Select atleast one vehicle to proceed and click ok button
    Then Click on the filter and SADEMO5 and apply 
    Then Take first screenshot under Highlights for SAdemo5
    Then Take second screenshot under Highlights for SAdemo5
    Then Take third screenshot under Highlights for SAdemo5
    Then Export the files for the default date range
    Then Click on the custom and select August month completely and apply 
    Then Take the first graph screenshot of Highlights for SAdemo5 under August month 
    Then Take the second graph screenshot of Highlights for SAdemo5 under August month 
    Then Take the third graph screenshot of Highlights for SAdemo5 under August month 
    
     
     
     
     
     
     
