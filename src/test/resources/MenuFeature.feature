@Feature_questions
Feature: Menu
#com2
  @High @Question @Menu
  Scenario Outline: Menu

    Given I'm on main page
    And I select "Menu" category
      |sdasd|5|5|
      |sdasd|\||3|
          #lfsjglfjks
      |1|asdf|dsa|
    And I click on "Simple Menu" button
    #lfsjglfjks
    """
    Some multi-
    line text
    is here
    """

    And I click on each menu section one by one
    And I click on "Menu With Sub Menu" button 7 bb
    |ads|adsf|dd|
    |adf|adf |asd|
    And I click on each menu section and sub-section one by one
    And  jhkhkh <name>
    Examples:
    |name|
    |\||