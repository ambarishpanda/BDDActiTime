Feature: ActiTime Customer Management

  Scenario: Create Edit and Delete Customer

    Given User is logged into ActiTime application

    When User clicks on Task
    And User clicks on Add New button
    And User clicks on New Customer button
    And User enters customer name
    And User clicks on Create Customer button
    Then Customer should be created successfully

    When User clicks on Edit button
    And User clicks on Customer name
    Then Customer should be edited successfully

    When User deletes the customer name
    Then Customer should be deleted successfully