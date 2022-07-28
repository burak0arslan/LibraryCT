Feature: Student Login Functionality
  As a student user I should be able to login to LibraryCT

  @StudentLogin
  Scenario: Student Login
    Given student is on the login Page
    Then verify that the URL is "https://library2.cybertekschool.com/login.html"
    When student enters valid email address and password
    And student click sign in button
    Then verify that there are 2 models on the page