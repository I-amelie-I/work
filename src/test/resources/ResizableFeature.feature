@Feature_questions
Feature: Resizable

  @High @Question @Resizable
  Scenario: Resizable
    Given I'm on main page
    And I select "Resizable" category
    And I click on "Default functionality" button
    And I resize the window in 'Default functionality' section
    And I click on "Animate" button
    And I resize the window in 'Animate' section
    And I click on "Constrain resize area" button
    And I resize the window in 'Constrain resize area' section
    And I click on "Helper" button
    And I resize the window in 'Helper' section
    And I click on "Max/Min size" button
    And I resize the window in 'Max/Min size' section