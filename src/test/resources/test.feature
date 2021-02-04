Feature:
Given I have 2 numbers
I would like to calculate sum of 2 numbers

  Scenario Outline: Calculate sum of 2 numbers
    Given I have <a> and <b>
    When I calculate the sum
    Then I should verify that the sum is <sum>
    @bhavani1
    Examples:
      | a  | b  | sum |
      | 5  | 10 | 15  |
      | 10 | 25 | 35  |
      | 5  | 6  | 11  |
    @bhavani2
    Examples:
      | a  | b  | sum |
      | 50  | 100 | 150  |
      | 100 | 250 | 350  |
      | 50  | 60  | 110  |

  @bhavani3
  Scenario Outline: Calculate sum of 2 numbers
    Given I have <a> and <b>
    When I calculate the sum
    Then I should verify that the sum is <sum>
    Examples:
      | a  | b  | sum |
      | 25 | 10 | 35  |
