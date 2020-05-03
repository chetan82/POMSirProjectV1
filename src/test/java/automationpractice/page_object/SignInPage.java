package automationpractice.page_object;

import automationpractice.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends DriverHelper {
    public SignInPage() { PageFactory.initElements(driver, this);
    }
    @FindBy(id ="email" )
    private WebElement emailBox;

    @FindBy(id="passwd")
    private WebElement passwdBox;

    @FindBy(id="SubmitLogin")
    private WebElement buttonSignIn;

    @FindBy(name="same")
    private WebElement checkboxSelected;

    @FindBy(name ="processAddress")
    private WebElement clickProceedTocheckout;

    @FindBy(id="cgv")
    private WebElement selectTermsServicesCheckbox;

    @FindBy(name = "processCarrier")
    private WebElement shippingProceedToCheckout;

    @FindBy(className = "page-heading")
    private WebElement shippingText;



   public void setEmailBox(String email,String password) {
       emailBox.sendKeys(email);
       passwdBox.sendKeys(password);

    }

  public void signIn(){
       buttonSignIn.click();
    }

    public boolean checkBox(){

     return checkboxSelected.isSelected();
    }

    public  void ProceedTocheckout(){
       clickProceedTocheckout.click();
    }

    public void termsOfServicesCheckbox(){
       selectTermsServicesCheckbox.click();

       }

       public  void setShippingProceedToCheckout(){
       shippingProceedToCheckout.click();
       }

       public String shipping(){
        return shippingText.getText();
       }

}
