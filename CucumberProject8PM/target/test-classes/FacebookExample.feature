Feature:Verify login fuctionality in Facebook application
Scenario Outline:Verify login functionality for valid username and valid password
Given User is on Facebook login page
When User enters  "<username>" and  "<password>"
And user clicks on login button
Then Error page is dispalyed
Examples:

|username|password|
|user1|test123|
|user2|pass123|
|user3|pass124|
|user4|pass678|