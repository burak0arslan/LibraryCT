Feature: Adding a new user to the system.
@AddingUser
  Scenario: Librarian should be able to add a new user.
    Given librarian is on the homePage_2
    When librarian click User module
    And librarian click "+Add User" button
    When librarian enter full name, password, email and address
    And librarian click save changes
    Then verify a new user is created