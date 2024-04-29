package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features/HomePageVerification.feature", "src/test/resources/features/DashBoard.feature","src/test/resources/features/Program/ManageProgramValidation.feature",},
    glue = "stepdefinitions",  
    plugin = { 
        "html:target/cucumber-reports/html", 
        "json:target/cucumber-reports/json/report.json", 
        "rerun:target/failed_scenarios.txt"},
    monochrome = true // Added monochrome option
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
