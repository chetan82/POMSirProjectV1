package automationpractice.step_defination;

import automationpractice.driver.DriverHelper;
import automationpractice.Hooks;
import automationpractice.page_object.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomePageStep {


    // WebDriver driver;
    //  String url = "http://automationpractice.com/index.php";

    public HomePage hp = new HomePage();

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        String pageTitle = hp.getPageTitle();
        assertThat(pageTitle, is(equalToIgnoringCase("My Store")));

        }

    @When("^user click all buttons on menubar$")
    public void user_click_all_buttons_on_menubar() throws Throwable {
        List<String> ac= hp.menuBar();
        assertThat(ac,hasItems("WOMEN" , "DRESSES" , "T-SHIRTS"));
        }

    @And("^user click on return home page$")
    public void user_click_on_home_page() throws Throwable {
        hp.returnToHomepage();
    }

    @And("^user click on all image links and banners$")
    public void user_click_on_all_image_links_and_banners() throws Throwable {
        hp.homePageImageLinks();

        }

    @When("^user click on POPULAR and BEST SELLERES tab$")
    public void user_click_on_POPULAR_and_BEST_SELLERES_tab() throws Throwable {
        List<String> ac= hp.homePageTabs();
       //System.out.println(ac);
        assertThat(ac,hasItems("Blouse","Blouse"));
        }



}