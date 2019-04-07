Feature: Login

  Background:
    Given User is on the home page of "zoopla website"

  Scenario Outline: Login with remember me
    When User click on the "signin button"
    And Enters "<emailaddress>" and "<password>"
    And click on the "submit button"
    Then My zoopla account page is displayed
    Examples:
      | emailaddress         | password  |
      | omo_andy4u@yahoo.com | andrew123 |

  Scenario Outline: Login with existing account
    When User click on the "signin button"
    And Enters "<emailaddress>" and "<password>"
    And Click on the "remember me" check box
    And click on the "submit button"
    Then My zoopla account page is displayed
    Examples:
      | emailaddress         | password  |
      | omo_andy4u@yahoo.com | andrew123 |


  Scenario Outline: Forgotten password
    When User click on the "signin button"
    And Click on "forgotten your password" link
    And Enters "<forgotemailaddress>"
    And Click on submit forgot password button
    Then The page displayes we have sent an email to the address specified
    Examples:
      | forgotemailaddress |
      | afens@yahoo.com    |
