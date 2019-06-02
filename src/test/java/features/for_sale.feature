Feature: Property For sale

  Background:
    Given User is on the home page of "zoopla website"

  @Drew
  Scenario Outline: Property for sale
    When User enter post code in the "<searchlocation>"
    And click the "search button"
    Then The page displays properties for sale
    Examples:
      | searchlocation |
      | EN10 6FH       |

  Scenario: Property for Sale Validate Min Price
    When User click on min price drop down button
    Then The page displays "min prices"


  Scenario: Property for sale Validate Max Price
    When User click max price drop down button
    Then The page displays "max prices"


  Scenario: Property for sale Validate property types
    When User click on property type drop down button
    Then The page displays "property types"


  Scenario: Property for sale Validate bedrooms
    When User click on bedrooms drop down button
    Then The page displays "bedrooms"


  Scenario Outline: Property for sale and select Options
    When User enter post code in the "<searchlocation>"
    And Enter "<minprice>", "<maxprice>", "<propertytype>", "<bedrooms>"
    And click the "search button"
    Then The page displays properties for sale
    Examples:
      | searchlocation | minprice | maxprice | propertytype | bedrooms |
      | N3 2HT         | 10,000   | 950,000  | FLAT         | 3        |

