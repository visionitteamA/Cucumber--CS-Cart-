@addTocart 
Feature: Add to cart 
	to validate products are added or not
Background: pre Requiste and signin 
	Given As a user when I launch application in "chrome" 
	And navigate to "https://demo.cs-cart.com" 
	When I click on my Account link at the top right 
	And clicked on sign in button 
	Then sign in pop up is displayed 
	And "customer@example.com" and "customer" already entered 
	When I click on sign in button 
	Then I am logged in to the application 
Scenario: add to cart single product 
	When i Enter "computer" in top search box 
	And I click on search button 
	Then Page navigates to product search result 
	And Product results are 1 
	When i click on list view button 
	Then Products are displayed in list view 
	When I click add to cart for product code "H0217E3OE9" 
	Then my cart is updated with product quantity as 1 and correct total price 
	And close the browser 
	
	
	
