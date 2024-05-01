package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;



public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public HomeTestBase homeTestBase;
	//public GenericUtils genricUtils;
	
	public TestContextSetup() throws IOException {
		homeTestBase = new HomeTestBase();
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	//	genricUtils = new GenericUtils(testBase.WebDriverManager());
}
}