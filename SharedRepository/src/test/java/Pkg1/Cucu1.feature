Feature: Test Calculator
  I want to use this template for my feature file


  Scenario: Add Two Num
    Given I enter 50 in claculator
    And I press Add
   And I have enter 50 in claculator
   When I press equal symbol
   Then  the result should be 100 on the system