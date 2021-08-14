Feature: Cash Withdrawal
  Scenario: Successful Withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful Withdrawal from a wallet in credit
    Given I have deposited $300 in my wallet
    When I request $301
    Then $301 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $400 in my wallet
    When I request $400
    Then $400 should be dispensed