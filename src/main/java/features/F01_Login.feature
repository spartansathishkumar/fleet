#Author: your.email@your.domain.com
Feature: Validation for the incorrect and correct credententials and Dashboard 


Scenario:  Validation for the incorrect FLEET ID 

#TC001 Negative login with invalid FLEET ID
    Given Click Fleet User option
    When Enter Fleet ID as '6174241'
    And Enter the Username as 'demouser@amberconnect.co.za'   
    And Enter the password as 'Amber@2327'
    And Select User Type as Admin
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Need to show error message1
    
    
    
Scenario:  Validation for the and incorrect Username 

 #TC002 Negative login with incorrect Username
 
    When Click Fleet User option
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'memouser@amberconnect.co.za'
    Then Enter the password as 'Amber@2327'
    Then Select User Type as Admin
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Need to show error message2  
    
Scenario:  Validation for the incorrect Password  

  #TC003 Negative login with incorrect Password
     When Click Fleet User option
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'demouser@amberconnect.co.za'         
    Then Enter the password as 'amber@2327'
    Then Select User Type as Admin
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Need to show error message3    
    
Scenario:  Validation for the incorrect group 

  #TC004 Negative login with incorrect group  
    When Click Fleet User option 
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'demouser@amberconnect.co.za'
    Then Enter the password as 'Amber@2327'
    Then Select User Type as Group
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Need to show error message4  
    
 Scenario:  Validation for the not selected policy
 
 #TC005 Negative login with not selected policy 
    When Click Fleet User option     
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'demouser@amberconnect.co.za'
    Then Enter the password as 'amber@2327'
    Then Select User Type as Admin
    Then click Login button
    Then Need to show error message5  

Scenario:  Validation for the correct credententials and Dashboard 

#TC006 Postive login with valid input credentials
    When Click Fleet User option
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'demouser@amberconnect.co.za'
    Then Enter the password as 'Amber@2327'
    Then Select User Type as Admin
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Need to assert Bird eye view
  

    Then Click on the bird eye view icon2
    Then click the Filter icon and Clear All option for all the vehicles
    Then SADemo1 is selected in the SADemo group under Demo group and click Apply
    Then Check whether the SADemo1 vehicle is displayed or not using assertion
    

    Then Click on the SADemo1 vehicle for the tracking  
    Then Click on the tracking in the dashboard 
    Then Check whether the tracking icon is selected or not using Assertion
    

    Then Click on the bird eye view icon for the trips
    Then click the Filter icon and Clear All option for all the vehicles for the trips
    Then SADemo1 is selected in the SADemo group under Demo group and click Apply for the trips
    Then Click on the SADemo1 vehicle for the trips
    Then Click on the trips in the dashboard 
    Then Check whether the trips icon is selected or not using Assertion
    
    

    Then Click on the bird eye view icon for the Alerts
    Then click the Filter icon and Clear All option for all the vehicles for the Alerts
    Then SADemo1 is selected in the SADemo group under Demo group and click Apply for the Alerts
    Then Click on the SADemo1 vehicle for the Alerts
    Then Click on the Alerts in the dashboard 
    Then Check whether the Alerts icon is selected or not using Assertion
    
    
    Scenario:  Validation for the events and share location and dash camera 
   
#TC007 Validation for the Events
    When Click Fleet User option
    Then Enter Fleet ID as '6174242'
    Then Enter the Username as 'demouser@amberconnect.co.za'
    Then Enter the password as 'Amber@2327'
    Then Select User Type as Admin
    Then Select the Privacy Policy checkbox
    Then click Login button
    Then Click on the bird eye view icon for the Events
    Then click the Filter icon and Clear All option for all the vehicles for the Events
     Then SADemo1 is selected in the SADemo group under Demo group and click Apply for the Events
    Then Click on the SADemo1 vehicle for the Events
    Then Click on the Events in the dashboard 
    Then Check whether the Events icon is selected or not using Assertion
    

    Then Click on the bird eye view icon for the Share location
    Then click the Filter icon and Clear All option for all the vehicles for the Share location
    Then SADemo1 is selected in the SADemo group under Demo group and click Apply for the Share location
    Then Click on the SADemo1 vehicle for the Share location
    Then Click the Share location icon in the Dashboard and click for about one hour and share the location
   
    
 
    Then Click on the bird eye view icon for the Dash Camera
    Then click the Filter icon and Clear All option for all the vehicles for the Dash Camera
     Then SADemo1 is selected in the SADemo group under Demo group and click Apply for the Dash Camera
    Then Click on the SADemo1 vehicle for the Dash Camera
    Then Click on the Dash Camera in the dashboard 


    
    
    
     
    
    