


Feature: Search Functionality
         As a end user
         I want to search for a product
         So that i can view respective products
  @search
    Scenario Outline: valid search
      Given I am on home page
      When  I search for a product "<searchTerm>"
      Then  I should see all the products
      Examples:
        | searchTerm                       |
        | Printed Chiffon Dress            |
        | Printed Dress                    |
        | Faded Short Sleeve T-shirts      |
