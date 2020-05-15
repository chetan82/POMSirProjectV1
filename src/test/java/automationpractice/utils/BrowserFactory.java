package automationpractice.utils;

import automationpractice.page_object.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class BrowserFactory extends BasePage {

    public static void startBrowser() {
       logger.info("**********Launching Browser************");
        String BROWSER = configPro.getProperty("BROWSER_NAME");

        if (BROWSER.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.silentOutput", "true");//this property is wont show messge in console "[SEVERE]: Timed out receiving message from renderer: 0.100"
            System.setProperty("webdriver.chrome.driver", configPro.getProperty("CHROME_DRIVER_PATH"));
            driver = new ChromeDriver();

        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", configPro.getProperty("GECKO_DRIVER_PATH"));
            driver = new FirefoxDriver();
        } else if (BROWSER.equalsIgnoreCase("IE_DRIVER_PATH")) {
            System.setProperty("webdriver.ie.driver", configPro.getProperty("IE_DRIVER_PATH"));
            driver = new InternetExplorerDriver();
        }

        logger.info("**********Opening URL************");
        String baseURL = configPro.getProperty("baseURL");
        driver.get(baseURL);
        driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
    }

    public static void stopBrower() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            BrowserFactory.startBrowser();
        }
        return driver;
    }


}
