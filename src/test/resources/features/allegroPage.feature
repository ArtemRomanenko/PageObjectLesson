Feature: Allegro search

  Background:
    Given I open allegro home page

  Scenario Outline: Searching MacBook on Allegro
    Given I'm closing RODO banner
    And I provide searching "<query>"
    And I click search button
    And I select first non-promoted item
    Then Item price should be "<price>"

    Examples:
      | query            |  | price       |
      | Macbook pro 2020 |  | 7 199,00 zł |
