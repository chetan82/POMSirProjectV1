package automationpractice.utils;

import automationpractice.driver.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory extends DriverHelper {

    public static void startBrowser() {

        if (AutomationConstants.BROWSER_NAME.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", AutomationConstants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();

        } else if ((AutomationConstants.BROWSER_NAME.equalsIgnoreCase("Firefox"))) {
            System.setProperty("webdriver.gecko.driver", AutomationConstants.GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
        } else if (AutomationConstants.BROWSER_NAME.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", AutomationConstants.IE_DRIVER_PATH);
            driver = new InternetExplorerDriver();
        }
       driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
    }

    public static void stopBrower(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public  static WebDriver getDriver(){
        if(driver==null ){
        BrowserFactory.startBrowser();
        }
          return driver;
    }


}
