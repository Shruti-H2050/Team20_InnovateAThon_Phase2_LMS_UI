package cucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/HomePageVerification.feature", // Path to your feature files
    glue = "stepdefinitions", // Package where step definitions are located
    tags = "@validcredentials", // Tags to filter scenarios
    plugin = { 
        "html:target/cucumber-reports/html", // Generate HTML report
        "json:target/cucumber-reports/json/report.json", // Generate JSON report
        "rerun:target/failed_scenarios.txt"}) // Rerun failed scenarios

public class TestRunner {
}
