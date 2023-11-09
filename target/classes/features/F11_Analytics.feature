#Author: your.email@your.domain.com



Feature:   Validation for the Analytics


Scenario: Validation for the Analytics

#TC020 Validation for the Analytics

    When Click Fleet User for Analytics
    Then Enter Fleet ID for Analytics as '6174242'
    Then Enter the Username for Analytics as 'demouser@amberconnect.co.za'
    Then Enter the password for Analytics as 'Amber@2327'
    Then Select User Type as Admin for Analytics
    Then Select the Privacy Policy checkbox for Analytics
    Then click Login button for Analytics
    Then Click on the Analytics
    Then Assertion on the All vehicles in the Key Performance Indicators and Yesterday
    Then click on the fleet summary in the vehicle reports
    Then Export as image and pdf and xls for last ten days
    Then Export as image and pdf and xls for Today
    Then Export as image and pdf and xls for Yesterday
    Then Export as image and pdf and xls for custom and last month
  
    Then click on the back buttton 
    Then click on the vehicle summary and click ok button
    Then click on the filter and SADEMO5 and apply for Analytics
    Then Assertion in the SAdemo5 in Key Performance Indicators and Yesterday
    Then Export as image and pdf and xls for last ten days
    Then Export as image and pdf and xls for This month
   
    Then click on the Trip reports
    Then Export as image and pdf and xls for last ten days for Trip reports
    Then Export as image and pdf and xls for This month for Trip reports
   
    Then click on the Highlights
    Then Export as image and pdf and xls for last ten days for Highlights
    Then Export as image and pdf and xls for This month for Highlights



