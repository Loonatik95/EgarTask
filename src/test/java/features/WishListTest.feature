Feature:
  @all
  Scenario:
    Given I search телефон product
    And I pick 1 searched product
    And I go to basket
    Then I check 0 product in basket