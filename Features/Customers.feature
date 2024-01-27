Feature: Customers 

Scenario: Add new Customer 
	Given User Launch Chrome Browser 
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboard 
	When User click on Customers Menu 
	And click on Customers Menu Item 
	And click on Add new button 
	Then User can view Add new Customer Page 
	When User enter Customer information 
	And Click on Save Button 
	Then User can view confirmation message "The new customer has been added successfully." 
	And close browser