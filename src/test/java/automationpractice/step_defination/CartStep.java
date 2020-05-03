package automationpractice.step_defination;

import automationpractice.driver.DriverHelper;
import automationpractice.page_object.CartPage;
import automationpractice.page_object.HomePage;
import automationpractice.page_object.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.StringCharacterIterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.equalTo;

public class  CartStep  {

   // WebDriver driver;

   // String url = "http://automationpractice.com/index.php";



    public HomePage homePage;

    public CartPage cartPage= new CartPage();
    public SignInPage signInPage= new SignInPage();


    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
       /* System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage=new HomePage();
        String pageTitle = homePage.getPageTitle();
        assertThat(pageTitle, is(equalToIgnoringCase("My Store")));
*/
    }

    @When("^user click on BESTSELLER and add product to cart$")
    public void user_click_on_BESTSELLER_and_add_product_to_cart() throws Throwable {


        cartPage.BestSellersTab();
       cartPage.scrollToProduct();
       cartPage.hoverOnDress();
       //Thread.sleep(4000);
       cartPage.addProduct();

       // System.out.println(cartPage);
      //  driver.findElement(By.xpath( "//ul[@id='blockbestsellers']//following-sibling::a[@data-id-product='7']")).click();

    }

    @Then("^user Add the Quantity and Size of the product$")
    public void user_Add_the_Quantity_and_Size_of_the_product() throws Throwable {

       Thread.sleep(5000);
        cartPage.addQuantity();
        cartPage.setSelectSizeOfDress();


    }

    @Then("^user select color and add the product$")
    public void user_select_color_and_add_the_product() throws Throwable {
        cartPage.chooseDressColor();
        cartPage.addToCartButton();

    }

    @When("^user proceed to checkout$")
    public void user_proceed_to_checkout() throws Throwable {
        //String act=cartPage.hoverOnDress();
   //     assertThat(cartPage.hoverOnDress(),is(equalToIgnoringCase("Printed Chiffon Dress")));
       // assertThat(act,true);
        cartPage.ProceedToChekout();

    }

    @Then("^product move to shopping cart summary$")
    public void product_move_to_shopping_cart_summary() throws Throwable {
       Thread.sleep(4000);
     assertThat(cartPage.Summary(),is(containsString("Summary")));

       cartPage.ProceedToChekout();

    }
    @When("^user enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_email_as_and_password_as(String email, String password) throws Throwable {
  signInPage.setEmailBox(email, password);
  signInPage.signIn();

    }



    @Then("^user confirm address$")
    public void user_confirm_address() throws Throwable {
        signInPage.checkBox();
        assertThat(signInPage.checkBox(),is(true));////*****Verfy delivery address as the billing address is Selected
        System.out.println(signInPage.checkBox());
        signInPage.ProceedTocheckout();


    }

    @Then("^user select terms of services for shipping$")
    public void user_select_terms_of_services_for_shipping() throws Throwable {

        signInPage.termsOfServicesCheckbox();
        assertThat(signInPage.shipping(),is(equalToIgnoringCase("SHIPPING")));
        signInPage.setShippingProceedToCheckout();

    }

    @Then("^user click on pay by bank wire$")
    public void user_click_on_pay_by_bank_wire() throws Throwable {
        cartPage.bankWire();

    }

    @Then("^user click on I confirm my order$")
    public void user_click_on_I_confirm_my_order() throws Throwable {

        assertThat("BANK-WIRE PAYMENT.",is(equalToIgnoringCase(cartPage.bankWirePayment())));
        cartPage.iConfirmMyOrder();

    }

    @Then("^user should see order confirmation$")
    public void user_should_see_order_confirmation() throws Throwable {
        assertThat("Order confirmation",is(equalToIgnoringCase(cartPage.orderConfirmation())));
        System.out.println("Test Finished");
    }





}
