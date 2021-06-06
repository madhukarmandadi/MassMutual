Feature: Exercise Application Test
Background:
Given User launch browser
When User navigates to home page
Then Validate home page is displayed
When User navigates to values page
Then Validate values page displayed

Scenario: Validate Values Count

When User counts number of values
Then Validate values count should be greater than zero
And Validate values count should be equal to 5
And Validate values are displayed with currency sign


Scenario: Validate Total Balance with Sum of 5 values

When User perform addition on all the values
Then Validate Total balance matches with addition of all the values



