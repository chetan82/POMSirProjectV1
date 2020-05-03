package automationpractice;


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
        features = ".",
        tags="@checkout"
)

     //   glue = {"automationpractice/step_defination"}


public class RunCuckesTest {
}
