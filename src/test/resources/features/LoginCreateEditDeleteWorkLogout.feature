Feature: ActiTime Work Management

  Scenario: Create Edit and Delete Type of Work

    Given User is logged into ActiTime application

    When User clicks on work List Management
    And User clicks on Type of Work button
    And User clicks on New Type button
    And User enters work name
    And User clicks on work Save button
    Then Work should be created successfully

    When User clicks on Work name
    And User edits the work name
    Then Work should be edited successfully

    When User clicks on Work checkbox
    And User clicks on Delete button
    And User clicks on work OK Delete button
    And User clicks on work Cross icon
    Then Work should be deleted successfully