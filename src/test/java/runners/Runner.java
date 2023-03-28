package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "unit:target/xml-report/cucumber.xml"
        },

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@so"

)


public class Runner {

}