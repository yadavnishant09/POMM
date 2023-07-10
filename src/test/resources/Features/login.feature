Feature: As a user,
				 I want to login to application
				 
				 
Scenario: Verify if login iss successful when entered username and password 

  Given user is on  login page
  When user enters username and password
  And user clicks login buutton
  Then user is logged into application