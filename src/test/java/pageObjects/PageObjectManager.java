package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public AddNewProgramPages addNewProgramPages;
	public HomePagePages  homePage;
	public ManageProgramValidationPages manageProgram;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public HomePagePages getlogin() {
		homePage=new HomePagePages(driver);
		return homePage;
		
	}
	
	public AddNewProgramPages createNewPgm() {
		addNewProgramPages = new AddNewProgramPages(driver);
		
		return addNewProgramPages;
}
	public ManageProgramValidationPages manageProgram() {
		manageProgram = new ManageProgramValidationPages(driver);
		return manageProgram;
		
	}
}