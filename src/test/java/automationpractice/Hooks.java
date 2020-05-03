package automationpractice;

import automationpractice.driver.DriverHelper;
import automationpractice.utils.BrowserFactory;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends DriverHelper {
    Scenario scenario;

    @cucumber.api.java.Before
    public void setUp(Scenario scenario) {
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
        driver.close();
        driver.quit();
    }
}