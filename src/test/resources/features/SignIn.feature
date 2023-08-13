@SignIn
Feature: SignInFeature


  Scenario: Should not be able to register a new account if required fields are not filled (fill no fields)
    When I open the app
    And I click link with text Create an Account
    And I click button Submit
    Then I should see validation error This is a required field. for field firstName on the 'Create an Account' page
    And I should see validation error This is a required field. for field lastName on the 'Create an Account' page
    And I should see validation error This is a required field. for field email on the 'Create an Account' page
    And I should see validation error This is a required field. for field password on the 'Create an Account' page
    And I should see password strength meter error with text No Password on the 'Create an Account' page
    And I should see validation error This is a required field. for field passwordConfirm on the 'Create an Account' page