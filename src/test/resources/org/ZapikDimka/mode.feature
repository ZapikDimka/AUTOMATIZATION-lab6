Feature: Mode finder

  Scenario Outline: Finding the mode of an array
    When I get array <a>
    Then the mode is <b>

    Examples: array
      | a                               | b  |
      | [7, 8, 8, 9, 10, 11, 12]        | 8  |
      | [21]                            | 21 |
      | [-3, -3, 5, 0, 14, 15]          | -3 |
      | [5, 5, 5, 45, 45, 45, 45, 45]   | 45 |
      | [-7, -7, 8, 7, -8, 7]           | -7 |
