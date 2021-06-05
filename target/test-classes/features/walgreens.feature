Feature: Verify added item in cart 

Background: Verify the browser is launched 
	Given user navigates to home page 
	Then verify the page is launched 
	
Scenario: 
	User searches item and finds and clips coupon for which user needs to signin to account 
	Given user enters item for search 
		|itemName|Tide| 
		#	And user checks product as per deals 
	When user selects product 
	And user looks for coupon and clips 
	And user needs to sign in to account 
		|email|pm2@gmail.com| 
		|pw|mnbv1234|
	And user selects the pickup option 
	Then user sees cart 
	And user verifies cart