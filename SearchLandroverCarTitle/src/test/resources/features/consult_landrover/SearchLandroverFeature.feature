Feature: User want to be able to search car by Title

Scenario: Searching Landrover website by title of cars
Given I am on the Landrover webpage
When I enter the title 'evouge'
Then I should be able to see the title 'EXPLORE LAND ROVER'