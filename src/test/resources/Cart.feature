
Feature: Cart functionality
         As a registered user i want to add the product to the cart , proceed for payment and received
         order confirmation

  Background:
            Given User is on home page
@checkout
  Scenario: Verify user can add single item to the cart from home page BESTSELLER and
           complete the the whole process of order and receive Order Confirmation.
     When user click on BESTSELLER and add product to cart
    And user Add the Quantity and Size of the product
    And user select color and add the product
    And user proceed to checkout
  #   Then product successfully added to cart
    And product move to shopping cart summary
    And user enter email as "finestsaffron@hotmail.co.uk" and password as "finestsaffron"
    And user confirm address
    And user select terms of services for shipping
    And user click on pay by bank wire
    And user click on I confirm my order
    Then user should see order confirmation


