Feature:To Rent


  Background:
    Given User is on the home page of "zoopla website"

  Scenario Outline: Property To Rent
    When User click on the "to rent" link
    And Enter post code in the "<searchlocation>"
    And click the "search button"
    Then The page displays properties to rent
    Examples:
      | searchlocation |
      | N3 2HT         |


  Scenario: Property To Rent Validate Min Price
    When User click on the "to rent" link
    And Click on min price drop down button
    Then The page displays "min prices"


  Scenario: Property To Rent Validate Max Price
    When User click on the "to rent" link
    And Click on max price drop down button
    Then The page displays "max prices"


  Scenario: Property To Rent Validate property types
    When User click on the "to rent" link
    And Click on property type drop down button
    Then The page displays "property types"


  Scenario: Property To Rent Validate bedrooms
    When User click on the "to rent" link
    And Click on bedrooms drop down button
    Then The page displays "bedrooms"


  Scenario Outline: Property To Rent and select Options
    When User click on the "to rent" link
    And Enter post code in the "<searchlocation>"
    And Enter the following details "<minprice>", "<maxprice>", "<propertytype>", "<bedrooms>"
    And click the "search button"
    Then The page displays properties to rent
    Examples:
      | searchlocation | minprice   | maxprice   | propertytype | bedrooms |
      | N3 2HT         | £1,000 pcm | £3,000 pcm | FLAT         | 3        |






