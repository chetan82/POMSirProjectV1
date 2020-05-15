package automationpractice.step_defination;

import automationpractice.page_object.BasePage;
import automationpractice.page_object.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomePageStep   {


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