Feature: login module 

Scenario: validate the sign in popup 
	Given As a user when I launch application in "chrome" 
	And navigate to "https://demo.cs-cart.com" 
	When I click on my Account link at the top right 
	And clicked on sign in button 
	Then sign in pop up is displayed 
	And "customer@example.com" and "customer" already entered 
	When I click on sign in button 
	Then I am logged in to the application 
	
	
