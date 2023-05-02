Feature: Country Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
  @SmokeTest @Regression
  Scenario: Create Country
   # Given Navigate to Campus
   # When Enter username and password
   # And Click on Login Button
   # Then User should login successfully
    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed

  Scenario: Delete Country
    # Given Navigate to Campus
    # When Enter username and password
    # And Click on Login Button
    # Then User should login successfully
    And Navigate to Country page
    When Delete country
    Then Success message should be displayed

    Scenario:
      And Click on add button
      When Enter country name "USA1" and code as "U1"
      And  Click on save button



