@Feature_SmallCategories
Feature: SmallCategories

  @High @Slider
  Scenario: Slider
    Given I'm on main page
    And I select "Slider" category
    And Drag slider


  @High @Tabs
  Scenario: Tabs
    Given I'm on main page
    And I select "Tabs" category
    And Select tabs


  @High @Tooltip
  Scenario: Tooltip
    Given I'm on main page
    And I select "Tooltip" category
    And I click on "Default functionality" button
    And I navigate to 'Your age' textinput
    And I click on "custom animation demo" button
    And I show all custom animation





