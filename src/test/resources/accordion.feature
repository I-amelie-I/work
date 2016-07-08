@Feature_Accordion
Feature: accordion test

  @Accordion @DefaultFunctionality
  Scenario: Default functionality section 1 select
    Given I'm on main page
    And I select "Accordion" category
    When I select "Section 1" section
    And I select "Section 2" section
    And I select "Section 3" section
    And I select "Section 4" section

  @Accordion @CustomizeIcons
  Scenario: Customize icons section 2 select
    Given I'm on main page
    And I select "Accordion" category
    And I select "Customize icons" tab
    When I select "Section 2" section
    And I click on 'Toggle icons' button
    And I click on 'Toggle icons' button

  @Accordion @FillSpace @Section1
  Scenario: Fill Space section 1 select
    Given I'm on main page
    And I select "Accordion" category
    And I select "Fill Space" tab
    When I select "Section 1" section
    And I select "Section 2" section
    And I select "Section 3" section
    And I select "Section 4" section