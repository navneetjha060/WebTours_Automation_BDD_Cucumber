Feature: To test login functionality


@SmokeTest
Scenario: Check login is successful with valid credentials
    Given User is on WebTours HomePage
    And User enters uname and pwd and clicks on Login
    Then Verify user is logged in 