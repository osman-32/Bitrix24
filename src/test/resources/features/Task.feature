@task
  Feature: Task creation
   Agile Story:  As a user, I should be able to assign
   tasks by clicking on Task tab under Active Stream.

Background: User should be on the Home page
  Given User is on the Home page
  When User clicks on Tasks
  Then Url should contain tasks
  And User should click on "New Task" button

  Scenario: User should be able to click on "High priority"
    When User clicks on "High priority" checkbox
    Then "High priority" checkbox should be enabled

