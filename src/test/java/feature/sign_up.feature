Feature: Register

  Background:
    Given User is on the home page of "zoopla website"


  Scenario Outline: Registration include marketing preference
    When User click on the "signin button"
    And Click on the "register" link
    And Submit the form with the following details "<registeremail>", "<registerpassword>", "<aboutme>"
    And Clicks yes on both marketing option links and click the "register button"
    Then The page displays registration successful
    Examples:
      | registeremail   | registerpassword | aboutme             |
      | andre02@yahoo.com | andrew123        | i'm looking to rent |


  Scenario Outline: Registration exclude marketing preference
    When User click on the "signin button"
    And Click on the "register" link
    And Submit the form with the following details "<registeremail>", "<registerpassword>", "<aboutme>"
    Then Clicks no on both marketing option links and click the "register button"
    Then The page displays registration successful
    Examples:
      | registeremail | registerpassword | aboutme             |
      | afe01@yahoo.com | andrew123        | i'm looking to rent |


  Scenario Outline: Select property status
    When User click on the "signin button"
    And Click on the "register" link
    And Enters "<registeremail>", "<registerpassword>" and click on about me drop down
    Then The page displays property status
    Examples:
      | registeremail | registerpassword |
      | afe@yahoo.com | andrew123        |
