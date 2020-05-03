
package automationpractice.step_defination;

import automationpractice.driver.DriverHelper;
import automationpractice.page_object.HomePage;
import automationpractice.page_object.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static  org.hamcrest.Matchers.*;


public class SearchStep  {

    public HomePage homePage;
    public SearchPage searchPage;
    public  DriverHelper driverHelper;


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
            homePage=new HomePage();
            String pageTitle = homePage.getPageTitle();
        assertThat(pageTitle, is(equalToIgnoringCase("My Store")));

    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String Text) throws Throwable {
         searchPage= new SearchPage();
          searchPage.searchBox(Text);
          searchPage.submitSearch();

    }

    @Then("^I should see all the products$")
    public void i_should_see_all_the_products()throws Throwable {
        driverHelper= new DriverHelper();

      String actual= searchPage.assertSearchedText();
      String expected=searchPage.assertSearchedIteam();
        //System.out.println(actual+"ex "+ expected);
       assertThat(actual,is(equalToIgnoringCase(expected)));


       }


}

