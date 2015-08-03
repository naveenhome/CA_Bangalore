Feature: Quick Post

As a employee 
I want to share a ride
So that anyone can travel with me

Scenario: Valid post
Given user has entered valid data
When click on "Submit"
Then system should display message "Post was successful."

Scenario: InValid post
Given user has not entered valid data
When click on "Submit"
Then system should display message "Post was unsuccessful."

Scenario: username cannot be blank
Given user enter name as "" and source as "ABC", destination as "XYZ", time as "5:30" and email "abc.com" and phone as "98105"
When click on "Submit"
Then system should display message "Name cannot be blank"

Scenario: Source cannot be blank
Given user enter name as "Naveen" and source as "", destination as "XYZ", time as "5:30" and email "abc.com" and phone as "98105"
When click on "Submit"
Then system should display message "Name cannot be blank"
