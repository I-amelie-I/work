@Feature_Autocomplete
Feature: Autocomplete

  @High @Question @Autocomplete
  Scenario: Autocomplete
    Given I'm on main page
    And I select "Autocomplete" category
    And I click on "Default functionality" button
    And I enter "G" into query string in 'Default functionality' section
    When I select "Groovy" from dropdown list
    Then "Groovy" is displayed in query string in 'Default functionality' section
    And I enter "A" into query string in 'Default functionality' section
    When I select "Asp" from dropdown list
    Then "Asp" is displayed in query string in 'Default functionality' section
    And I click on "Multiple Values" button
    And I enter "A" into query string in 'Multiple Values' section
    And I select "ActionScript" from dropdown list
    And I enter "J" into query string in 'Multiple Values' section
    And I select "Java" from dropdown list
    And I enter "C" into query string in 'Multiple Values' section
    When I select "C++" from dropdown list
    Then "ActionScript, Java, C++" is displayed in query string in 'Multiple Values' section
    And I click on "Categories" button
    And I enter "P" into query string in 'Categories' section
    When I select "annttop C13" from dropdown list
    Then "annttop C13" is displayed in query string in 'Categories' section
    And I enter "h" into query string in 'Categories' section
    When I select "andreas johnson" from dropdown list
    Then "andreas johnson" is displayed in query string in 'Categories' section