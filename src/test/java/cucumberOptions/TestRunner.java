package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {  "src/test/resources/features/HomePageVerification.feature",
            "src/test/resources/features/DashBoard.feature",
            "src/test/resources/features/Program/ManageProgramValidation.feature",
            "src/test/resources/features/Program/AddNewProgram.feature",
            "src/test/resources/features/EditProgramDetails.feature",
            "src/test/resources/features/DeleteProgram.feature",
            "src/test/resources/features/Batch/BatchPageValidation.feature",
            "src/test/resources/features/Batch/DeleteMultipleBatches.feature"
        },
    glue = "stepdefinitions",  
    plugin = { 
        "html:target/cucumber-reports/html", 
        "json:target/cucumber-reports/json/report.json", 
        "rerun:target/failed_scenarios.txt"},
    monochrome = true // Added monochrome option
)
public class TestRunner extends AbstractTestNGCucumberTests {
}