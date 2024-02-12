Feature: login feature

  Scenario Outline: Login feature
    Given The user enter the page
    When the user enter the email as email with the <row>
    And the user enter the password as password with the <row>
    Then the <user> looks at the home page

    Examples:
      | row | user      |
      | 1   | jtest     |
      | 2   | johantest |
      | 3   | test      |


