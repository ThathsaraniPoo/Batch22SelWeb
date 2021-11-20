Feature:
  As a new user to the system
  I need to register to the system
  So that I can obtain their services

  Background: User is on Mercury Registration Page
    Given  User is on Home Page -->Register Page

  Scenario: New User Registration
    Given  User enter first name as "Thathsarani"
    And  User enter last name as "Poornima"
    And  User enter phone  as "0114911304"
    And  User enter email as "jasid@gmail.com"
    And  User enter user name as "Poornima"
    And  User enter password as "Poornima"
    And  User enter confirm password as "Poornima"
    When  User clicks on Submit button
    Then The actualMessage displays as "Dear Thathsarani Poornima,"