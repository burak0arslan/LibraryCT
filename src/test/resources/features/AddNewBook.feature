Feature: Adding a new book
  As a librarian I should be able to add a new book.

  @addingANewBook
  Scenario: librarian adding a new book
    Given librarian is on the homePage
    When librarian clicks Books module
    And librarian clicks "+Add Book" button
    When librarian enter BookName, ISBN, Year, Author and Description
    And librarian clicks save changes button
    Then verify anew book is added
