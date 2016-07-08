@Feature_Sortable
Feature: Sortable test

  @High @Sortable
  Scenario: Sortable
    Given I'm on main page
    And I select "Sortable" category
    And I click on "Default functionality" button
    And I reorder elements in a list
    And I click on "Connect Lists" button
    And I reorder elements in 'Connect Lists' section
    And I click on "Display as grid" button
    And I reorder elements in 'Display as grid' section
    And I click on "Portlets" button
    And I reorder elements in 'Portlets' section






