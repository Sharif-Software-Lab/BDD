@tag
  Feature: Calculator

  Scenario Outline: Add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result is <result>

    Examples:
    | first | second | result |
    | 1 | 12 | 13 |
    | -1 | 6 | 5 |
    | 2 | 2 | 4 |
