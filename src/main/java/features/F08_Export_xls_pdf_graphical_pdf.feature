#Author: your.email@your.domain.com

Feature:   Validation for the Export files


Scenario:  Validation for the Export files

#TC017 Export xls pdf and graphical pdf files after clicking filter and SADEMO5

    When Click Fleet User for files
    Then Enter Fleet ID for files as '6174242'
    Then Enter the Username for files as 'demouser@amberconnect.co.za'
    Then Enter the password for files as 'Amber@2327'
    Then Select User Type as Admin for files
    Then Select the Privacy Policy checkbox for files
    Then click Login button for files
    Then Click on the trips for files
    Then click on the filter and SADEMO5 and apply for files 
    Then click on the Download and click on Export in xls
    Then click on the Download and click on Export in pdf
    Then click on the Download and click on Export in Graphical pdf
    
    
    



    Then click on the personal and small map for files 
    Then click on the Export trip and Export in XLS
    Then click on the Export trip and Export in pdf
    Then  click on the Export trip and Click on the Trips Detail log
