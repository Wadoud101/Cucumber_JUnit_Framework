
Feature: US1001 test search on testotomasyonu pages
  Scenario: TC01 user could find result for phone search
    Given user could get in main page
    When search for phone in search box
    Then test that search result found
    And close the page


  Scenario: TC02 user could find result for shoe search
    Given user could get in main page
    When search for shoe in search box
    Then test that search result found
    And close the page