Feature: Login Create Edit Delete User Logout

  Scenario: Create, Edit and Delete User

    Given User is on Home Page
    When User clicks on Users
    And User clicks on New User button
    And User enters user details
    And User clicks on Save button
    And User clicks on Cross icon

    When User clicks on User Name
    And User edits user details

    When User clicks on Name for Delete
    And User deletes the user
