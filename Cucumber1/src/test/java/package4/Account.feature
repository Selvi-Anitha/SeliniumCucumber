@tag
Feature:Create Account

@tag1
Scenario:Success

Given I want to create an account
When I enter my data

	| name  | password | status |
	| name1 | sham@123 | success|
	| name2 | ram@123  | fail   |
	
	Then I verify the account