
Feature: US1002 test search on testotomasyonu pages

  @parallel3
  Scenario: TC01 user dynamically could find result for phone search
    Given user could get in main page
    When search for "dress" in search box
    Then test that search result found

  @parallel1
  Scenario: TC01 user dynamically could find result for phone search
    Given user could get in main page
    When search for "phone" in search box
    Then test that search result found



    @parallel3
  Scenario: TC01 user dynamically could find result for phone search
    Given user could get in main page
    When search for "java" in search box
    Then test that what is search result
