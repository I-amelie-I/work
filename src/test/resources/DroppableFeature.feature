@Feature_Droppable
Feature: droppable test

  @High @Droppable
  Scenario: Droppable
    Given I'm on main page
    And I select "Droppable" category
    And I click on "Default functionality" button
    And I drag 'Drag me to my target' element
    And I click on "Accept" button
    And I drag elements in 'Accept' section
    And I click on "Prevent propagation" button
    And I drag elements in 'Prevent propagation' button
    And I click on "Revert draggable Position" button
    And I drag elements in 'Revert draggable Position' section
    And I click on "Shopping cart demo" button
    And I drag elements in 'Shopping cart demo' section






