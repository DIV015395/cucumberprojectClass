Feature: feature to check google search functionality

  Scenario: validate google search is working
    Given Browser is open
    And User is on google page
    When user enters a text in the search box
    And press enter
    Then user is navigated to search results