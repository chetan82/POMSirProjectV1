package automationpractice.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class=\"login\"]")
    private WebElement clickSignIn;

    @FindBy(xpath ="//h1[@class='page-heading']")
    private WebElement txtAuthentication;

    @FindBy(id ="email")
    private  WebElement emailBox;

    @FindBy(id="passwd")
    private WebElement passwdBox;


    @FindBy(id="SubmitLogin")
    private WebElement clickButtonSignIn;

    @FindBy(xpath ="//h1[@class='page-heading']")
    private WebElement txtMyAccount;

    @FindBy(xpath = "//a[@class='account']")
    private  WebElement getAccountName;

    @FindBy(xpath ="//div[@class='alert alert-danger']" )
    private WebElement txtError;


    public void SignIn(){
        clickSignIn.click();
    }

    public String TxtAuthentication() {
       // String s =txtAuthentication.getText();
        //System.out.println(s);
        return txtAuthentication.getText();

    }

    public  void EnterEmail(String email,String password){
        emailBox.sendKeys(email);
        passwdBox.sendKeys(password);

    }

    public  void ButtonSignIn(){
        clickButtonSignIn.click();

    }

    public String txtMyAccount(){
        return txtMyAccount.getText();
    }

 public String nameOfAccount() {
     return getAccountName.getText();
 }

 public  String getError(){
        return txtError.getText();
 }

 }