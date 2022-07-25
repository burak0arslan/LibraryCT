
  Feature: Will be checking negative test scenario for student logging in and should be able to see "Sorry, Wrong Email or Password"

    @LoginWithInvalidCredentials

    Scenario: Student will be login in with invalid credentials
      Given user is on the loginPage
      When user enters invalid email or password
      And student clicks sign in button
      Then verify the error message "Sorry, Wrong Email or Password"