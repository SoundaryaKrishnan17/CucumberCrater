#Author: your.email@your.domain.com

Feature: Creating a new customer
  
  Scenario: Add Customer
    Given User launch crater site
    And User click on login button
    When User create on new customer
    And User filling up all the details
    And User edit all details
    Then I validate the outcomes
    And check more outcomes


  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
