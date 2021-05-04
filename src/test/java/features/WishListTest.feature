Feature:

  @all
  Scenario:
    Given I search телефон product
    And I put 2 found product in the wishlist
    And I go to basket
    Then I check 1 product in basket