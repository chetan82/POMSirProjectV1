import automationpractice.page_object.BasePage;
import automationpractice.utils.BrowserFactory;
import cucumber.api.Scenario;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks extends BasePage {

    Scenario scenario;
    @cucumber.api.java.Before
    public void setUp(Scenario scenario) throws IOException {
        /*****logger****/
        logger=Logger.getLogger("setUp"); //Added logger
       PropertyConfigurator.configure("log4j.properties");//Added logger

        /********Reading Properties******/
        configPro=new Properties();
        FileInputStream configPropfile= new FileInputStream("config.properties");
        configPro.load(configPropfile);

        BrowserFactory.startBrowser();
        maxBrowser();

        this.scenario = scenario;
        System.out.println("Executing scenario " + scenario.getName());


    }
    @cucumber.api.java.After
    public void cleanUp() {

        scenario.write("finished scenario");
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");


        }
      driver.quit();

      //  driver.close();
    }
}