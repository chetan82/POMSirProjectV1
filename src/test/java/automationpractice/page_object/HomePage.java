package automationpractice.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomePage extends BasePage {

// public DriverHelper homePage= new DriverHelper();
    public  HomePage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath ="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a" )
    private List<WebElement> menuBarButtons;

    @FindBy(xpath="//i[@class='icon-home']")
    private WebElement clickReturntoHome;

    @FindBy(xpath ="//ul[@class='htmlcontent-home clearfix row']//li" )
     private List<WebElement> clickhomePageimageLinks;

    @FindBy(xpath = "//li[@class='active']//ancestor::ul//li")
     private List<WebElement>clickHomepageTabs;

    @FindBy(xpath ="//a[@title='Blouse']" )
    private WebElement forAssert;


    public String getPageTitle() {
        return driver.getTitle();

    }

    public List<String> menuBar() {
        List<String> value = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait time of 20 seconds

        for (int i = 0; i < menuBarButtons.size(); i++) {
           // objLink = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a"));
           WebElement element = wait.until(ExpectedConditions.visibilityOf(menuBarButtons.get(i)));
            String actual = element.getText();
            element.click();
            value.add(actual);
            }
        return value;
        }

     public void returnToHomepage(){
        clickReturntoHome.click();

     }

     public List<String>homePageImageLinks(){

          List<String> value = new ArrayList<>();
          WebDriverWait wait = new WebDriverWait(driver, 20); //Wait time of 20 seconds
         for (int i = 0; i < clickhomePageimageLinks.size(); i++) {
             WebElement element = wait.until(ExpectedConditions.visibilityOf(clickhomePageimageLinks.get(i)));
             //scrolling method
             scrollIntoView(element);
             //Hover & Clicking method
             moveTo(element);
             driver.navigate().back();
             }
          return  value;
     }

     public List<String> homePageTabs(){
         List<String> value = new ArrayList<>();

         WebDriverWait wait = new WebDriverWait(driver, 20); //Wait time of 20 seconds
         for (int i = 0; i < clickHomepageTabs.size(); i++) {
             WebElement element = wait.until(ExpectedConditions.visibilityOf(clickHomepageTabs.get(i)));
             //scrolling method
             scrollIntoView(element);
             //Hover & Clicking method
             moveTo(element);
             //@title=getting txt frm attribute to assert
             WebElement ele=forAssert;
             //can't assert webelement so convert in string
             String expected=ele.getAttribute("title");
             //Add all items into the list array(Value)
             value.add(expected);


         }
        return value;

     }



}



