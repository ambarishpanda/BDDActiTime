Feature: ActiTime Leave Type Management

  Scenario: Create Edit and Delete Leave Type

    Given User is logged into ActiTime application

    When User clicks on leave List Management
    And User clicks on Leave Types
    And User clicks on New Leave Type button
    And User enters leave type name
    And User clicks on leave save button
    Then Leave type should be created successfully

    When User clicks on Leave name
    And User edits the leave name
    Then Leave type should be edited successfully

    When User clicks on Three Dot icon
    And User clicks on Delete icon
    And User clicks on leave oK delete button
    And User clicks on Leave Cross icon
    Then Leave type should be deleted successfully