Feature:Log In Action
Scenario:On Successful Log In display a message as log in successful for valid input
Given user is on Home Page
When user enters user name
And user enters password
And clicks on submit button
Then validate User and display message as successful
And close