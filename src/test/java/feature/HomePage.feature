Feature: Home page functionality

  As a end user
  check all the links ,banners and menu bar are redirecting
  to correct product/category pages

  Background:
    Given user is on home page
@run
  Scenario: verify that user can click on menu bar,image links and tab buttons to navigate to another page
    When user click all buttons on menubar
    And user click on return home page
    And user click on all image links and banners
    And user click on POPULAR and BEST SELLERES tab



