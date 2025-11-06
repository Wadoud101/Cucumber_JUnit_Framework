
Feature: US1004 Negative Login Attempts
  Scenario Outline: TC10 liste olarak verilen gecersiz email ve password

    Given user get to the "toURL"
    Then click the account login button
    When enter "<givenEmail>" as email address
    And enter "<givenPassword>" as password
    And press the sign in button
    And wait for 1 second
    Then verify that he could not entered to the system
    And close the page

    Examples:

      |givenEmail           |givenPassword     |
      |toGecerliMail        |toGecersizPass    |
      |toGecersizMail       |toGecersizPass    |
      |toGecerliMail2       |toGecersizPass    |
      |toGecersizMail       |toGecerliPass     |