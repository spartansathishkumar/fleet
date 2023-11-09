#Author: your.email@your.domain.com
Feature: Validation of Trips Data



Scenario:  Validation for the Trips with Test device
 #TC010 Validation for the Trips with Test device 
    When Click Fleet User for trips data
    When Enter Fleet ID for trips data as '6174242'
    And Enter the Username for trips data as 'demouser@amberconnect.co.za'
    And Enter the password for trips data as 'Amber@2327'
    And Select User Type for trips data as Admin 
    Then Select the Privacy Policy checkbox for trips data
    Then Click Login button for trips data
    Then Click on the Trips and Assertion of the Trips
     Then click the Filter icon and click on the Test device and Apply for today in Calendar 
    Then click on the today in Calendar and show the number of trips on today

    Then click on the yesterday in Calendar and show the number of trips on yesterday
   
  
 
    
    Then click on the last ten days in Calendar



  

    Then click on the this month in Calendar
    
   
  
    
    Then click on the last month in Calendar
    
  
   
     
    Then click on the older than six months in Calendar
    










 Scenario: Validation for the Trips with SADemo5
  #TC011 Validation for the Trips with SADemo5
    When Click Fleet User for trips data
    When Enter Fleet ID for trips data as '6174242'
    And Enter the Username for trips data as 'demouser@amberconnect.co.za'
    And Enter the password for trips data as 'Amber@2327'
    And Select User Type for trips data as Admin 
    Then Select the Privacy Policy checkbox for trips data
    Then Click Login button for trips data
    Then Click on the Trips and Assertion of the Trips
     Then click the Filter icon and click on the SADemo5 and Apply for today in Calendar 
    Then click on the today in Calendar and show the number of trips on today
      Then click on the yesterday in Calendar and show the number of trips on yesterday
     Then click on the last ten days in Calendar and click on load more on last ten days
      Then click on the this month in Calendar and click on load more on this month
        Then click on the last month in Calendar and click on the custom and click on one full month earlier from the pre-selected month and apply
       Then click on the older than six months in Calendar and click on one month earlier and click on the start and end date of the earlier month and apply
   
    
  
    
    
    
    
    
    
    
    
    
    
   