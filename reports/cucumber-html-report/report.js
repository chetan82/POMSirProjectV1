$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cart.feature");
formatter.feature({
  "line": 2,
  "name": "Cart functionality",
  "description": "       As a registered user i want to add the product to the cart , proceed for payment and received\r\n       order confirmation",
  "id": "cart-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CartStep.user_is_on_home_page()"
});
formatter.result({
  "duration": 1114153700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify user can add single item to the cart from home page BESTSELLER and",
  "description": "       complete the the whole process of order and receive Order Confirmation.",
  "id": "cart-functionality;verify-user-can-add-single-item-to-the-cart-from-home-page-bestseller-and",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user click on BESTSELLER and add product to cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Add the Quantity and Size of the product",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select color and add the product",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#   Then product successfully added to cart"
    }
  ],
  "line": 16,
  "name": "product move to shopping cart summary",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter email as \"finestsaffron@hotmail.co.uk\" and password as \"finestsaffron\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user confirm address",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select terms of services for shipping",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on pay by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click on I confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should see order confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStep.user_click_on_BESTSELLER_and_add_product_to_cart()"
});
formatter.result({
  "duration": 32659400,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat automationpractice.page_object.CartPage.BestSellersTab(CartPage.java:60)\r\n\tat automationpractice.step_defination.CartStep.user_click_on_BESTSELLER_and_add_product_to_cart(CartStep.java:61)\r\n\tat ✽.When user click on BESTSELLER and add product to cart(Cart.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CartStep.user_Add_the_Quantity_and_Size_of_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_select_color_and_add_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_proceed_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.product_move_to_shopping_cart_summary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "finestsaffron@hotmail.co.uk",
      "offset": 21
    },
    {
      "val": "finestsaffron",
      "offset": 67
    }
  ],
  "location": "CartStep.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_confirm_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_select_terms_of_services_for_shipping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_click_on_pay_by_bank_wire()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_click_on_I_confirm_my_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CartStep.user_should_see_order_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home page functionality",
  "description": "\r\nAs a end user\r\ncheck all the links ,banners and menu bar are redirecting\r\nto correct product/category pages",
  "id": "home-page-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.user_is_on_home_page()"
});
formatter.result({
  "duration": 8308500,
  "error_message": "java.lang.NullPointerException\r\n\tat automationpractice.page_object.HomePage.getPageTitle(HomePage.java:44)\r\n\tat automationpractice.step_defination.HomePageStep.user_is_on_home_page(HomePageStep.java:37)\r\n\tat ✽.Given user is on home page(HomePage.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 10,
  "name": "verify that user can click on menu bar,image links and tab buttons to navigate to another page",
  "description": "",
  "id": "home-page-functionality;verify-that-user-can-click-on-menu-bar,image-links-and-tab-buttons-to-navigate-to-another-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user click all buttons on menubar",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click on return home page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on all image links and banners",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user click on POPULAR and BEST SELLERES tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.user_click_all_buttons_on_menubar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.user_click_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.user_click_on_all_image_links_and_banners()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.user_click_on_POPULAR_and_BEST_SELLERES_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 4,
  "name": "Search Functionality",
  "description": "       As a end user\r\n       I want to search for a product\r\n       So that i can view respective products",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "valid search",
  "description": "",
  "id": "search-functionality;valid-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product \"\u003csearchTerm\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see all the products",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-functionality;valid-search;",
  "rows": [
    {
      "cells": [
        "searchTerm"
      ],
      "line": 14,
      "id": "search-functionality;valid-search;;1"
    },
    {
      "cells": [
        "Printed Chiffon Dress"
      ],
      "line": 15,
      "id": "search-functionality;valid-search;;2"
    },
    {
      "cells": [
        "Printed Dress"
      ],
      "line": 16,
      "id": "search-functionality;valid-search;;3"
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts"
      ],
      "line": 17,
      "id": "search-functionality;valid-search;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "valid search",
  "description": "",
  "id": "search-functionality;valid-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product \"Printed Chiffon Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see all the products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.i_am_on_home_page()"
});
formatter.result({
  "duration": 685100,
  "error_message": "java.lang.NullPointerException\r\n\tat automationpractice.page_object.HomePage.getPageTitle(HomePage.java:44)\r\n\tat automationpractice.step_defination.SearchStep.i_am_on_home_page(SearchStep.java:29)\r\n\tat ✽.Given I am on home page(Search.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 24
    }
  ],
  "location": "SearchStep.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchStep.i_should_see_all_the_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "valid search",
  "description": "",
  "id": "search-functionality;valid-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product \"Printed Dress\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see all the products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.i_am_on_home_page()"
});
formatter.result({
  "duration": 1113800,
  "error_message": "java.lang.NullPointerException\r\n\tat automationpractice.page_object.HomePage.getPageTitle(HomePage.java:44)\r\n\tat automationpractice.step_defination.SearchStep.i_am_on_home_page(SearchStep.java:29)\r\n\tat ✽.Given I am on home page(Search.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 24
    }
  ],
  "location": "SearchStep.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchStep.i_should_see_all_the_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "valid search",
  "description": "",
  "id": "search-functionality;valid-search;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product \"Faded Short Sleeve T-shirts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see all the products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.i_am_on_home_page()"
});
formatter.result({
  "duration": 688800,
  "error_message": "java.lang.NullPointerException\r\n\tat automationpractice.page_object.HomePage.getPageTitle(HomePage.java:44)\r\n\tat automationpractice.step_defination.SearchStep.i_am_on_home_page(SearchStep.java:29)\r\n\tat ✽.Given I am on home page(Search.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 24
    }
  ],
  "location": "SearchStep.i_search_for_a_product(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchStep.i_should_see_all_the_products()"
});
formatter.result({
  "status": "skipped"
});
});