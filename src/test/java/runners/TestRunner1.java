package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
        "json:target/json-reports/cucumber1.json",
        "unit:target/xml-report/cucumber1.xml"
        },

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@so"

)


public class TestRunner1 {

}