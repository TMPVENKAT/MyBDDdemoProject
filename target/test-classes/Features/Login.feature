Feature: Login page automation of SauceDemo app

Scenario Outline: Verify login is successful with valid credentials
Given User is in the login page
When User enters the "<username>" and "<password>"
And clicks the OK Button
Then User is navigated to the home page
And Browser is closed

Examples:
|username| |password|
|standard_user| |secret_sauce|
|lockedout_user| |secret_sauce|
|problem_user| |secret_sauce|
|performance_glitch_user| |secret_sauce|