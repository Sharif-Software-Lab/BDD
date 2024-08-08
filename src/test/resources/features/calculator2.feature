@tag 
Feature: Calculator
  
  Scenario Outline: Do some math
    Given Two input values, <first> and <second> and the operation is <operation>
    When I do some math
    Then I expect the result is <result>
  
    Examples:
    | first | second | operation | result |
    | 1 | 2 | * | 2 |
    | 24 | 3 | / | 8 |
    | 3 | 4 | ^ | 81 |
    | -3 | 12 | + | 9 |
