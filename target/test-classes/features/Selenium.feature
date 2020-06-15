Feature: Search and place order for vegetable
  
 @test1
 Scenario: Search for item and validate the result
    Given User is on GreenCart Landing page
    When User serch for "Cucumber" vegetable
    Then "Cucumber" results are displayed

  @test2
  Scenario: Search for item and then move to check out page
    Given User is on GreenCart Landing page
    When User serch for "Brinjal" vegetable
    Then Added items to cart
    And User Proceed to check out page
    Then Verify selected "Brinjal" items are displayed in Checkout page

  @test3
  Scenario Outline: Search for items and then move to check out page for "<TC>"
    Given User is on GreenCart Landing page
    When User serch for "<Name>" vegetable
    Then Added items to cart
    And User Proceed to check out page
    Then Verify selected "<Name>" items are displayed in Checkout page

    Examples: 
      | TC   | Name     |
      | TC01 | Cucumber |
      | TC02 | Beetroot |
