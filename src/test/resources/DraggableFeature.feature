@Feature_Draggable
Feature: draggable test

  @High @Draggable
  Scenario: Draggable
    Given I'm on main page
    And I select "Draggable" category
    And I click on "Default functionality" button
    And I drag 'Drag me around' element
    And I click on "Constrain movement" button
    And I drag elements in 'Constrain movement' section
    And I click on "Cursor style" button
    And I drag elements in 'Cursor style' section
    And I click on "Events" button
    And I drag elements in 'Events' section
    And I click on "Draggable + Sortable" button
    And I drag elements in Draggable and Sortable section





