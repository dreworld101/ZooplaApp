Feature: Commercial Property For sale

  Background:
    Given User is on the home page of "zoopla website"

  @Drew
  Scenario: Search for Commercial property
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    Then The page displays "search for commercial properties to let across the uk"


  Scenario: Commercial property type
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the property types drop down button
    Then The page displays "commercial property type"

  Scenario: Commercial units
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the units drop down button
    Then The page displays "commercial units"


  Scenario: Commercial min    unit size
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the min unit size drop down button
    Then The page displays "commercial min unit size"

  Scenario: Commercial max unit size
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the max unit size drop down button
    Then The page displays "commercial max unit size"

  Scenario: Commercial min price
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the min price drop down button
    Then The page displays "commercial min price"

  Scenario: Commercial max price
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the max price drop down button
    Then The page displays "commercial max price"

  Scenario: Commercial advance search option
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the advance search option drop down button
    Then The page displays "commercial advance search option"

  Scenario: Distance from location
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the advance search option drop down button
    And click on the distance from location drop down button
    Then The page displays "distance from location"

  Scenario: Added option
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the advance search option drop down button
    And click on the added drop down button
    Then The page displays "added option"

  Scenario: Sort by option
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And click on the advance search option drop down button
    And click on the sort by drop down button
    Then The page displays "sort by option"

  Scenario Outline: Commercial property search by location
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And Enter post code in the "<searchlocation>"
    And click the "search button"
    Then The page displays "property type for sale in the location"
    Examples:
      | searchlocation |
      | N3 2HT         |

  Scenario Outline: Commercial property for sale and select Feet Options
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And User enter post code in the "<searchlocation>"
    And Enters "<propertytype>", "<units>", "<minunitsize>", "<maxunitsize>", "<minprice>", "<maxprice>"
    And click the "search button"
    Then The page displays "property type for sale in the location"
    Examples:
      | searchlocation | propertytype    | units       | minunitsize | maxunitsize | minprice | maxprice  |
      | N3 2HT         | Retail premises | Square feet | 100 ft      | 100,000 ft  | 10,000   | 1,000,000 |

  Scenario Outline: Commercial property for sale and select sq metres Options
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And User enter post code in the "<searchlocation>"
    And Enters "<propertytype>", "<units>", "<minunitsizesqmetres>", "<maxunitsizesqmetres>", "<minprice>", "<maxprice>" in square metres
    And click the "search button"
    Then The page displays "property type for sale in the location"
    Examples:
      | searchlocation | propertytype | units         | minunitsizesqmetres | maxunitsizesqmetres | minprice | maxprice  |
      | EN10 6FH       | offices      | square metres | 100 m               | 10,000 m            | 10,000   | 1,000,000 |


  Scenario Outline: Advance Option to only show property for sale
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And User enter post code in the "<searchlocation>"
    And Enters "<propertytype>", "<units>", "<minunitsize>", "<maxunitsize>", "<minprice>", "<maxprice>"
    Then click on the advance search option drop down button
    And Enters "<distancelocation>", "<added>", "<sortby>", "<keywords>"
    And Select check boxes to only show property for sale
    And click the "search button"
    Then The page displays "property type for sale in the location"
    Examples:
      | searchlocation | propertytype    | units       | minunitsize | maxunitsize | minprice | maxprice  | distancelocation | added        | sortby       | keywords |
      | N3 2HT         | Retail premises | Square feet | 100 ft      | 100,000 ft  | 10,000   | 1,000,000 | Within 20 miles  | Last 30 days | Lowest price | Any      |


  Scenario Outline: Advance Opddtion  to only show business for sale
    When User hover mouseover commercial and click "uk commercial property for sale link" on the drop down list
    And User enter post code in the "<searchlocation>"
    And Enters "<propertytype>", "<units>", "<minunitsize>", "<maxunitsize>", "<minprice>", "<maxprice>"
    Then click on the advance search option drop down button
    And Enters "<distancelocation>", "<added>", "<sortby>", "<keywords>"
    And Select check boxes to only show business for sale
    And click the "search button"
    Then The page displays "property type for sale in the location"
    Examples:
      | searchlocation | propertytype    | units       | minunitsize | maxunitsize | minprice | maxprice  | distancelocation | added        | sortby       | keywords |
      | N3 2HT         | Retail premises | Square feet | 100 ft      | 100,000 ft  | 10,000   | 1,000,000 | Within 20 miles  | Last 30 days | Lowest price | Any      |





