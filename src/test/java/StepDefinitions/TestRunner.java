package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"}
        ,plugin = {"pretty"}
)
public class TestRunner {
}

//"html:target/HTMLReports/index.html"
//        json:target/JSONReports/hi.json","junit:target/JunitReports/reports.xml"