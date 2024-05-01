package pageObjects;

import org.openqa.selenium.WebDriver;

import utilities.TestContextSetup;

public class PageObjectManager {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public LoginPages loginPage;
	public AddNewProgramPages addNewProgramPages;
	public ManageProgramValidationPages manageProgram;
	public AddNewProgramPages addNewProgram;
	public AddNewProgramDetailsPages addNewProgramDetails;
//	public AddNewUserPages addNewUserPages;
	public UserPageValidationPages userPages;


	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPages getlogin() {
		loginPage=new LoginPages(driver);
		return loginPage;
		
}
//	
//	public AddNewUserPages createNewPages() {
//		addNewUserPages = new AddNewUserPages(driver);
//		return addNewUserPages;
//	}
//	
	public UserPageValidationPages userPages() {
		userPages = new UserPageValidationPages(driver);
		return userPages;
	}
	
	


	


	
}
//	public AddNewProgramPages createNewPgm() {
//		addNewProgramPages = new AddNewProgramPages(driver);
//		
//		return addNewProgramPages;
//}
//	
//	public ManageProgramValidationPages manageProgram() {
//		manageProgram = new ManageProgramValidationPages(driver);
//		return manageProgram;
//		
//	}
//	
//	public AddNewProgramPages addNewProgram() {
//		 addNewProgram = new AddNewProgramPages(driver);
//		 return addNewProgram;
//	}
//	
//	public AddNewProgramDetailsPages addNewProgramDetails() {
//		addNewProgramDetails = new AddNewProgramDetailsPages(driver);
//		return addNewProgramDetails;
//	}
//}