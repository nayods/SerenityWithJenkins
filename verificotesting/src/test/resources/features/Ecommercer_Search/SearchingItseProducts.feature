Feature: Searching by keyword

  Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'wool'
    Then I should only see items related to 'wool'
    
      Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'shoes'
    Then I should only see items related to 'shoes'
    
      Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'suits'
    Then I should only see items related to 'suits'
    
      Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'garments'
    Then I should only see items related to 'garments'
    
      Scenario: Should list items related to a specified keyword
    Given I want to buy a wool scarf
    When I search for items containing 'toys'
    Then I should only see items related to 'toys'
  