Feature: View Home

  Background:
    Given User is on the home page of "zoopla website"


  Scenario Outline: View property in my Area
    When User click on the "view my home" button
    And Enters "<postcode>" and click on locate address
    And click the select drop down button
    Then The page displays different addresses
    Examples:
      | postcode |
      | N3 2HT   |
      | EN10 6FH |

  Scenario Outline: View property relationship type
    When User click on the "view my home" button
    And Enters "<postcode>" and click on locate address
    And Select "<address>" and click on the select address submit button
    Then The page displays select relationship to this home
    Examples:
      | postcode | address                         |
      | N3 2HT   | 20 Oakfield Road, London N3 2HT |


  Scenario Outline: Select home owner as relationship status
    When User click on the "view my home" button
    And Enters "<postcode>" and click on locate address
    And Select "<address>" and click on the select address submit button
    And Select owner as relationship to this home
    Then My home property details are displayed
    Examples:
      | postcode | address                         |
      | N3 2HT   | 20 Oakfield Road, London N3 2HT |