@regression @smoke @us-248
Feature: Amazon Cart Functionality 

Discripton: User should able to add items in cart

			Background: 
			Given open amazon Homepage  
				
 			
	
			Scenario: Amazon cart functionality
					Given Search for shirt
 					When Select the first shirt on item list
 					And Select Size
 					And Select color
 					And Select Quantity
 					Then select Add to cart
 