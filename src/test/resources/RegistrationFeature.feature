@Feature_demoQA
Feature: registration test

  @High @DemoQA
  Scenario: Registration
    Given I'm on main page
    And I select "Registration" category
    And I enter "Albert" firstname
    And I enter "Einstein" lastname
    And I set "single" marital status
    And I set "reading" hobby
    And I select "Ukraine" in country dropdown
    And I select "10" "15" "1955" in date of birth dropdowns
    And I enter 880005000900 phone number
    And I enter "GUIDUSER" username
    And I enter "RandMail" e-mail
    And I enter "password" and confirm it
    When I press submit button
    Then Message 'Thank you for registration' is displayed



