Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

    Scenario Outline: Create a Citizenship
      Given  Navigate to Citizenships page
      Then Click on add button
      Then Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
      When  Click on save button
      Then  Success message should be displayed
      Examples:
        |CizitenshipName  |CitizenshipShortName
        |RGP11  |rg11
        |RGP22  |rg22
        |RGP33  |rg33
        |RGP44  |rg44
