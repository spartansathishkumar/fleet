#Author: your.email@your.domain.com

Feature: Validation of small map-big map-Dashboard loop


Scenario:  Validation of small map-big map-Dashboard loop

#TC012 Loop on the live tracking
    When Click Fleet User for live tracking with maps
    When Enter Fleet ID for live tracking with maps as '6174242'
    And Enter the Username for live tracking with maps as 'demouser@amberconnect.co.za'
    And Enter the password for live tracking with maps as 'Amber@2327'
    And Select User Type for live tracking with maps as Admin 
    Then Select the Privacy Policy checkbox for live tracking with maps
    Then Click Login button for live tracking with maps
    Then Click on the Trips for live tracking with maps
     Then click the Filter icon and click on the SADEMO5 and Apply for live tracking with maps
    Then click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps
    Then click on the live tracking in the dashboard and assertion on the live tracking


    Then Click on the Trips for live tracking with maps
    Then click the Filter icon and click on the SADEMO5 and Apply for live tracking with maps
    Then click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps
    Then click on the Trips in the Dashboard
    
 
    Then Click on the Trips for live tracking with maps
     Then click the Filter icon and click on the SADEMO5 and Apply for live tracking with maps
      Then click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps
     Then click on the Disable engine in the dashboard and close the information pop up by click on the close 

    
     Then Click on the Trips for live tracking with maps
     Then click the Filter icon and click on the SADEMO5 and Apply for live tracking with maps
      Then click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps
     Then click on the Alerts in the dashboard and assert on All notifications
  
 Scenario:  Validation for the small map-big map-Dashboard-Events-Share location-loop 
 #TC013 Loop on the Events   
   When Click Fleet User for live tracking with maps
    When Enter Fleet ID for live tracking with maps as '6174242'
    And Enter the Username for live tracking with maps as 'demouser@amberconnect.co.za'
    And Enter the password for live tracking with maps as 'Amber@2327'
    And Select User Type for live tracking with maps as Admin 
    Then Select the Privacy Policy checkbox for live tracking with maps
    Then Click Login button for live tracking with maps
     Then Click on the Trips for events
     Then click the Filter icon and click on the SADEMO5 and Apply for events
      Then click on the personal in the classify trip and click on the small map and assertion of personal for live tracking with maps
     Then click on the Events in the dashboard and assert on All notifications
 
 
     Then Click on the Trips for share location
     Then click the Filter icon and click on the SADEMO5 and Apply for share location
     Then click on the personal in the classify trip and click on the small map and assertion of personal for share location
     Then click on the share location in the dashboard and close the pop up
     
     
     
     
     