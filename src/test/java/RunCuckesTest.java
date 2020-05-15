import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /*plugin = {"html:reports/cucumber-html-report",
                "json:reports/cucumber.json",
                "pretty"},
        tags = {"@run"},
        features = {"src/test/resources"},glue = {"automationpractice/step_defination"}*/
        features = "src/test/java/feature",
        tags="@valid",
       // dryRun=false,  /*true will show scenario steps with method */
       // monochrome = true, //remove unnecessary character from console window
        plugin = {"pretty","html:test-output"}

)

     //   glue = {"automationpractice/step_defination"}


public class RunCuckesTest {

}
