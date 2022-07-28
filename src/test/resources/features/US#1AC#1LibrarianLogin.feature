Feature: user should be able to login using librarian credentials

 @Group1_SAS
 Scenario: logging in with librarian credentials
  Given librarian is on the login page
  Then verify that the title is Login - Library
  When librarian enters valid email address and password
  And librarian click sign in button
  Then verify that there are 3 models on the page