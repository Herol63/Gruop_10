
Feature: Login Function

  Accounts are: username,password

  Background:
    Given The user is on the login page

  Scenario Outline: Login as a user
    When The user enters the "<username>" and "<password>" information
    Then The user should be able to login


    Examples:
      | username                        | password |
      | helpdesk1@cybertekschool.com    | UserUser |

  Scenario: User should be able to click on upload files icon to upload files and pictures from local disk
    When User can click on more option
    Then User can click on file btn
    And User can click on upload files icon

  Scenario: User should be able to add users and from employees and Department contact list
    When User can click on more option
    Then User can click on Appreciation btn
    And User click on add employees btn and add employee

  Scenario: User should be able to attach link by clicking on the link icon
    When User click attach link icon
    Then Employee attach by clicking link icon

  Scenario: User should be insert videos by clicking video icon
    When User click on video icon
    Then video icon is clickable

  Scenario:User should be able to create a quote by clicking on the comma icon
    When User click on comma icon
    Then comma is displayed

  Scenario: User should be able to add mention by clicking on the mention icon
    When User click on add mention icon
    Then add mention icon is displayed

  Scenario: User should be able to visual editor and see editor test-bar
    When User click on visual editor
    Then Editor test-bar is displayed

  Scenario: User should be able to topic icon and see announcement topic text box
    When User click on topic icon
    Then Text box is displayed
  @063
  Scenario: User should be able to add tags by selecting existing tags
    When User click on add tags
    Then Add tags icon is displayed