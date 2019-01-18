Feature: What day is today?
  Today is expected to be a Friday

  # This is a comment line

  Scenario: Is it still Friday?
    Given today is Sunday
    When I ask if it's Friday yet
    Then I should be told "Nope"

  Scenario:  Today is Friday?
    Given today is Friday
    When I ask if it's Friday yet
    Then I should be told "TGIF"

  Scenario Outline: Today is Friday or might be not
    Given today is "<day>"
    When I ask if it's Friday yet
    Then I should be told "<answer>"

    Examples:
    | day | answer |
    | Friday | TGIF |
    | Sunday | Nope |
    | Any other Day! | Nope |