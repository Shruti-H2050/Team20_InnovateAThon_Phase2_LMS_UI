package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
glue="stepdefinitions",
monochrome=true,
tags="@addPgmDetailsTag8",
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
