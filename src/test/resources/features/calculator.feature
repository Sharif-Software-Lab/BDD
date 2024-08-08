@tag
Feature: Calculator

  Scenario: Multiply two numbers
    Given Two input values, 2 and 3
    When I multiply the two values
    Then I expect the result is 6
  
  Scenario: Divide two numbers
    Given Two input values, -12 and 3
    When I divide the first values by the second value
    Then I expect the result is -4
  
  Scenario: Exponential two numbers
    Given Two input values, 2 and 4
    When I exponentiate the first value by the second value
    Then I expect the result is 16

  Scenario Outline: Add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result is <result>

    Examples:
    | first | second | result |
    | 1 | 12 | 13 |
    | -1 | 6 | 5 |
    | 2 | 2 | 4 |
