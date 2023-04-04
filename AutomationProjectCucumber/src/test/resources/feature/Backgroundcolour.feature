@Regression
Feature: Validation for the background changing colors.

@Scenario1
Scenario: User should be able to change the background color to blue.
Given User is on the set SkyBlue Background button
When User clicks on the set SkyBlue Background button
Then The background color should change to sky blue

 @Scenario2
  Scenario: User should be able to change the background color to white.
Given User is on the set SkyWhite Background button
When User clicks on the set SkyWhite Background button
Then The background color should change to White
  