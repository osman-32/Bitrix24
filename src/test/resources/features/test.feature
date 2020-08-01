@mention
Feature: Bitrix search feature
  Agile story: As a user i should be able login and user should be able to mention by clicking on the Add
  mention icon and select contacts from the lists provided in dropdown.

  Given User is on the login page
  Scenario: Verification that user selected from the lists
    When  User enters credentials on login page
    Then  User clicks on Add mention icon
    Then  User Adds mention
    And  User selects contacts from the lists provided from in dropdown
