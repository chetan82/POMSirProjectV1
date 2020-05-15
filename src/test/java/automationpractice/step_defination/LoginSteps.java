package automationpractice.step_defination;

import automationpractice.page_object.BasePage;
import automationpractice.page_object.HomePage;
import automationpractice.page_object.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps extends BasePage {

    public LoginPage loginPage;

    @When("^User click on Sign-in Link$")
    public void user_click_on_Sign_in_Link() throws Throwable {
        logger.info("*********Click On Sign In Page********");
        loginPage=new LoginPage();
           loginPage.SignIn();
    }

    @Then("^User should be on login page$")
    public void user_should_be_on_login_page() throws Throwable {
        Thread.sleep(5000);
       logger.info("**********  Sign In To Page************");

        assertThat(loginPage.TxtAuthentication(),equalTo("AUTHENTICATION"));
    }

    @And("^User enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_email_as_and_password_as(String email, String password) throws Throwable {
        logger.info("********** Providing Login Details************");
        loginPage.EnterEmail(email, password);

    }

    @And("^User Click on Sign in$")
    public void user_Click_on_Sign_in() throws Throwable {
      loginPage.ButtonSignIn();


    }


    @Then("^User should be login successfully$")
    public void user_should_be_login_successfully() throws Throwable {

       logger.info("********** Loging Passed************");

        assertThat(loginPage.txtMyAccount(),equalTo("MY ACCOUNT"));
        }

    @And("^User should see their name \"([^\"]*)\"$")
    public void user_should_see_their_name(String name) throws Throwable {

        logger.info("********** Account Holder Name Passed************");
        String accountName=   loginPage.nameOfAccount();
        //System.out.println(accountName);
        assertThat(accountName,equalTo(name));

    }
    @Then("^User validate the \"([^\"]*)\" message$")
    public void user_validate_the_message(String error) throws Throwable {

        logger.info("********** Verified All Error Messsages************");

        String errorMsg=loginPage.getError();
        System.out.println("Error Message:   "+errorMsg);
        assertThat(loginPage.getError(),equalTo(error));


        }



  /*  @Then("^User validate the error message$")
    public void user_validate_the_error_message(DataTable table) throws Throwable {
      //  List<List<String>> list = table.raw();
         List<List<String>> list =table.asMaps(String.class,String.class);
        for (int i = 0; i < list.size(); i++) {
              assertThat(list.get(i).get("error"),equalTo(loginPage.getError()));
           // System.out.println(list.get(i).get("error"));

        }  */

}
