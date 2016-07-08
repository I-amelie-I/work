@Feature_questions
  Feature: Selectable

    @High @Question @Selectable
      Scenario: Selectable
      Given I'm on main page
      And I select "Selectable" category
      And I select all Items one by one in 'Default functionality' section
      And I select all Items in in 'Default functionality' section
      And I click on "Display as grid" button
      And I select all Items one by one in 'Display as grid' section
      And I select all Items in 'Display as grid' section
      And I click on "Serialize" button
      And I select all Items one by one in 'Serialize' section
      And I select all Items in 'Serialize' section
