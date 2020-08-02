@upload
Feature: Bitrix search features
  Agile story: As a user I should be able to click on upload files icon to upload
  files and pictures from local disks,
  download from external drive,
  select documents from bixtrix24,
  and create files to upload

  Scenario: Verification that user creates files to upload
    Given User enters credentials on login page
    When User clicks on upload files icon
    Then User uploads files and pictures from local disks
    Then User downloads from external drive
    Then User selects documents from bitrix24
    Then User creates files to upload