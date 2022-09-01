Feature:Verify the login fuctionality in Facebook application

@Regression
Scenario:Verify login functionality for valid username and invalid password
Given User is on Facebook login page
When User enters username and password
|username|password |
|user1   |password1|
And user clicks on login button
Then Error page is displayed


@Smoke
Scenario:Verify login functionality for valid username and invalid password
Given User is on Facebook login page
When User enters username and password
|username|password |
|user2   |password2|
And user clicks on login button
Then Error page is displayed


@Sanity
Scenario:Verify login functionality for valid username and invalid password
Given User is on Facebook login page
When User enters username and password
|username|password |
|user3   |password3|
And user clicks on login button
Then Error page is displayed
