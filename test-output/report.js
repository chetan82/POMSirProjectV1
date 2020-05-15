$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Automation practice website login with valid and Invalid credentials",
  "description": "",
  "id": "test-automation-practice-website-login-with-valid-and-invalid-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 45230141600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-automation-practice-website-login-with-valid-and-invalid-credentials;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@valid"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Sign-in Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enter email as \"finestsaffron@hotmail.co.uk\" and password as \"finestsaffron\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click on Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should see their name \"Chet Chet\"",
  "keyword": "And "
});
formatter.match({
  "location": "CartStep.user_is_on_home_page()"
});
formatter.result({
  "duration": 1682348100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Sign_in_Link()"
});
formatter.result({
  "duration": 2415412800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 5521900600,
  "status": "passed"
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
  "location": "LoginSteps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1333859700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_Click_on_Sign_in()"
});
formatter.result({
  "duration": 3164418300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_login_successfully()"
});
formatter.result({
  "duration": 105747200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chet Chet",
      "offset": 28
    }
  ],
  "location": "LoginSteps.user_should_see_their_name(String)"
});
formatter.result({
  "duration": 83568300,
  "status": "passed"
});
formatter.write("finished scenario");
formatter.after({
  "duration": 2135690000,
  "status": "passed"
});
});