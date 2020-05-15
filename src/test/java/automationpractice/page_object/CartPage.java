package automationpractice.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class CartPage extends BasePage {
    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Best Sellers']")
    private WebElement BestSellersButton;

    @FindBy(xpath = "//ul[@id='blockbestsellers']//a//img[@title='Printed Chiffon Dress']")
    private WebElement selectPrintedChiffonDress;

    @FindBy(className = "icon-plus")
    private WebElement clickToaddQuantitiy;

    @FindBy(id = "group_1")
    private WebElement selectSize;

    @FindBy(name = "Green")
    private WebElement dressColor;

    @FindBy(name = "Submit")
    private WebElement clickAddToCart;

    @FindBy(linkText = "Proceed to checkout")
    private WebElement clickToProceedToCheckout;

    @FindBy(xpath="//*[contains(text(),'Summary')]")
    private WebElement txtSummary;

    @FindBy(className ="bankwire" )
    private WebElement clickPayByBankWire;

    @FindBy(className ="page-subheading" )
    private WebElement txtBankWirePayment;

    @FindBy(xpath ="//span[text()='I confirm my order']")
    private  WebElement buttonConfirmMyOrder;

    @FindBy(className = "page-heading")
    private  WebElement txtOrderConfirmation;

    @FindBy(className = "fancybox-iframe")  //this is iframe
    private WebElement my_frame;

    public void BestSellersTab() {
        BestSellersButton.click();
    }

    public String hoverOnDress() {
        HoverOnElement(selectPrintedChiffonDress);



        return selectPrintedChiffonDress.getAttribute("title");
    }

    public void scrollToProduct() {
        scrollIntoView(selectPrintedChiffonDress);
    }

    public void addProduct() {
        moveTo(selectPrintedChiffonDress);

    }

    public void addQuantity()  {
        //  small window is in frame so use frame with index(index start from 0,it has four frames so (0-3)
   /*     try {
            iframe(0); //0 or 3 index
            clickToaddQuantitiy.click();

        } catch (Exception e) {
            iframe(3);
            clickToaddQuantitiy.click();

        }
            */
   try {
       //clickToaddQuantitiy.click();
       Thread.sleep(3000);
       iframe(my_frame); //check xptah for iframe Webelement above
       clickToaddQuantitiy.click();
       // moveTo(clickToaddQuantitiy);
   }
   catch (Exception e) {

   }
    }

    public String setSelectSizeOfDress() {
        String s = selectDropdown(selectSize, "M");
        return s;
    }

    public void chooseDressColor() {
        //select or deselect color
        boolean isColor; // true or false value

        isColor = dressColor.isSelected();
        /*  System.out.println(isColor);    <---Yellow and Green both are false selected */
        //if color is not selected,select it using click button
        if (isColor == false) {
            dressColor.click();
        }

    }

    public void addToCartButton() {
        clickAddToCart.click();
    }

    public void ProceedToChekout() throws Throwable {
        try {
            Thread.sleep(5000);
            scrollIntoView(clickToProceedToCheckout);
            clickToProceedToCheckout.click();
        }
        catch (Exception e) {

        }
    }

    public String Summary() {
        try {

            Thread.sleep(10000);
             //txtSummary.getText();
        } catch (Exception e) {
        }
        return txtSummary.getText();
    }

    public void bankWire(){
        clickPayByBankWire.click();
}
    public String bankWirePayment(){
        return txtBankWirePayment.getText();
    }

    public void iConfirmMyOrder(){
        buttonConfirmMyOrder.click();
    }

    public  String orderConfirmation(){

        return txtOrderConfirmation.getText();
    }
}