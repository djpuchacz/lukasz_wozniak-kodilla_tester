Feature: Is number divisible by 3 and/or 5?
  Everybody likes Math

  Scenario Outline: Is number divisible by 3, divisible by 5, divisible by 3 and 5
    Given number is <number>
    When I ask if number divisible by 3 or by 5 or 3 and 5
    Then I should get a answer <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 90 | "FizzBuzz" |
      | 1000 | "Buzz" |
      | 1001 | "None" |
