@tag
Feature:Change

@smoke @user
Scenario:ChangePassword
Given I enter password as "sham@123"
And I enter confirm password as "sham@123"
Then The password is changed

@user 

Scenario:Logout
Given Click logout button
Then Home page is displayed

@scale

Scenario:BookTickets
Given Customer name 
And click booking
Then Ticket is booked




