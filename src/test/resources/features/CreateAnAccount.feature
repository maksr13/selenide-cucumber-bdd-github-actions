@CreateAnAccount
Feature: CreateAnAccount


  Scenario: Should be able to register a new account
    When I open the app
    And I click link with text Create an Account
    Then I should see page title wrapper with text Create New Customer Account
    When I fill 'Create an Account' page with following data:
      | firstName | lastName   | email                            | password      | passwordConfirm |
      | Alice     | Wonderland | alice.wonderland@dispostable.com | 123890qwerty! | 123890qwerty!   |
    Then I should see password strength meter error with text Very Strong on the 'Create an Account' page
    When I click button Submit
    Then I should see page title wrapper with text My Account
    And I should see message success with text Thank you for registering with Main Website Store.
    And I should see box content with text 'Alice'
    And I should see box content with text 'Wonderland'
    And I should see box content with text 'alice.wonderland'@dispostable.com


  Scenario: Should not be able to register a new account if required fields are not filled (fill only firstNameField and try to submit form)
    # todo

  Scenario: Should not be able to register a new account if required fields are not filled (fill only lastNameField and try to submit form)
    # todo

  Scenario: Should not be able to register a new account if required fields are not filled (fill only firstNameField and try to submit form)
    # todo

  Scenario: Should not be able to register a new account if required fields are not filled (fill only lastNameField and try to submit form)
    # todo

  Scenario: Should not be able to register a new account if required fields are not filled (fill only firstNameField, lastNameField, emailField and try to submit form)
    # todo

  Scenario: Should not be able to register a new account if required fields are not filled (fill only firstNameField, lastNameField, emailField, passwordField and try to submit form)
    # todo

  Scenario: Should be able to register a new account if required fields are not filled and then filled
    # todo
