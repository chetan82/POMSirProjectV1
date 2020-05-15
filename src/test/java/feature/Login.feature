Feature:Test Automation practice website login with valid and Invalid credentials

  @valid
  Scenario: Test login with valid credentials
    Given User is on home page
    When User click on Sign-in Link
    Then User should be on login page
    And User enter email as "finestsaffron@hotmail.co.uk" and password as "finestsaffron"
    And  User Click on Sign in
    Then User should be login successfully
    And User should see their name "Chet Chet"

  @invalid
  Scenario Outline: Test Login with Invalid credentials
    When User click on Sign-in Link
    Then User should be on login page
    And User enter email as "<e-mail>" and password as "<password>"
    And  User Click on Sign in
    Then User validate the "<error>" message
  #    | error                                        |
  #    | There is 1 error\nAuthentication failed.     |
    #  | There is 1 error\nAuthentication failed.     |
   #   | There is 1 error\nAn email address required. |
    #  | There is 1 error\nPassword is required.      |
    #  | There is 1 error\nAn email address required. |


    Examples:
      | e-mail                      | password           | error                                        |
      | finestsaf@hotmail.co.uk     | finestsaffron      | There is 1 error\nAuthentication failed.     |
      | finestsaffron@hotmail.co.uk | finestsaffron12345 | There is 1 error\nAuthentication failed.     |
      |                             |                    | There is 1 error\nAn email address required. |
      | finestsaffron@hotmail.co.uk |                    | There is 1 error\nPassword is required.      |
      |                             | finestsaffron      | There is 1 error\nAn email address required. |
