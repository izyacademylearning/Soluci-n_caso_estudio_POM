Feature: Izyacademy feature

  Scenario Outline: Izyacademy feature
    Given The user enter the page
    When user enter the email as email with the <fila>
    And user enter the password as password with the <fila>
    And User go to post page
    Then user create the new category
    #Then the <user> looks at the home page

    Examples:
      | fila | user      |
      | 1   | jtest     |



