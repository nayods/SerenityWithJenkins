Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: Looking up the definition of 'apple'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'apple'
    Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'

  Scenario: Looking up the definition of 'pear'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'pear'
    Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'

  Scenario: Looking up the definition of 'mango'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'mango'
    Then they should see the definition 'A tropical Asian fruit tree, Mangifera indica.'
    
  Scenario: Looking up the definition of 'cucumber'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'cucumber'
    Then they should see the definition 'The edible fruit of this plant, having a green rind and crisp white flesh.'
    
   