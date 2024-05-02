package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={
							//"src/test/resources/features"
							//"src/test/resources/features/HomePageVerification.feature",
						//	"src/test/resources/features/DashBoard.feature",
							"src/test/resources/features/ManageProgramValidation.feature",
							"src/test/resources/features/AddNewProgram.feature",
							"src/test/resources/features/AddNewProgramDetails.feature",
							"src/test/resources/features/EditProgramDetails.feature",
							"src/test/resources/features/EditProgramDetailsPopUp.feature",
							"src/test/resources/features/DeleteProgram.feature",
							"src/test/resources/features/DeleteProgramPopUp.feature",
							"src/test/resources/features/MultipleDeleteProgram.feature",
							"src/test/resources/features/NavigationValidation.feature",
							"src/test/resources/features/Pagination.feature",
							"src/test/resources/features/SortingValidation.feature"
		
							
							},
glue="stepdefinitions",
monochrome=true,
//tags="@validcredentials",
plugin= {"html:target/cucumber.html",
		"json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})  //captures failed secnarios in a txt file


public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=false)
	
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}


