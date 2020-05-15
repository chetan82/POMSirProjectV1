package automationpractice.page_object;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
 //  String url = "http://automationpractice.com/index.php";

    public static Logger logger;
    public static Properties configPro;


    public void maxBrowser() {
    driver.manage().window().maximize();
    }

   public void applyImpwait(){
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   }

   public void handleCookies(){
    driver.manage().deleteAllCookies();
   }

    public  void moveTo(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);", element);

    }
      public void HoverOnElement(WebElement element){
          Actions act = new Actions(driver);
          act.moveToElement(element).perform();
      }

      public boolean iframe(WebElement index){
          driver.switchTo().frame(index);
        return true;
      }

      public String selectDropdown(WebElement element,String sizeText){
          Select size= new Select(element);
          size.selectByVisibleText(sizeText);
        //  size.getFirstSelectedOption();
          String s=size.getFirstSelectedOption().getText();
          return s;
      }


        public void closeBrowser() {
    driver.quit();

    }
}
