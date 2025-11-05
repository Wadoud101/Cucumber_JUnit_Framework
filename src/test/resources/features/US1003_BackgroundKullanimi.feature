
Feature: US103 Kullanici ortak baslangic adimlari background ile calistirir

  Background:
    Given user could get in main page

  Scenario: TC04 user dynamically could find result for phone search
    When search for "dress" in search box
    Then test that search result found
    And close the page

  Scenario: TC05 user dynamically could find result for phone search
    When search for "phone" in search box
    Then test that search result found
    And close the page


  Scenario: TC06 user dynamically could find result for phone search
    When search for "java" in search box
    Then test that what is search result
    And close the page