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
	public EditProgramDetailsPages editProgramDetails;
	public DeleteProgramPages deleteProgram;
	public MultipleDeleteProgramPages multipleDeleteProgram;
	public SortingValidationPages sortingValidation;
	public PaginationPages pagination;
	public NavigationValidationPages navigationValidation;
	public DeleteUserPages deleteUser;
	public DeleteMultipleUserPages deleteMultipleUser;
	/*
	 * public UserPageValidationPages userPageValidation;
	 * 
	 * public UserPageValidationPages userPageValidation() { userPageValidation =
	 * new UserPageValidationPages(driver); return userPageValidation; }
	 */

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPages getlogin() {
		loginPage=new LoginPages(driver);
		return loginPage;
		
	}
	public AddNewProgramPages createNewPgm() {
		addNewProgramPages = new AddNewProgramPages(driver);
		return addNewProgramPages;
}
	
	public ManageProgramValidationPages manageProgram() {
		manageProgram = new ManageProgramValidationPages(driver);
		return manageProgram;
		
	}
	
	public AddNewProgramPages addNewProgram() {
		 addNewProgram = new AddNewProgramPages(driver);
		 return addNewProgram;
	}
	
	public AddNewProgramDetailsPages addNewProgramDetails() {
		addNewProgramDetails = new AddNewProgramDetailsPages(driver);
		return addNewProgramDetails;
	}
	public EditProgramDetailsPages editProgramDetails() {
		editProgramDetails = new EditProgramDetailsPages(driver);
		return editProgramDetails;
	}
	public DeleteProgramPages deleteProgram() {
		deleteProgram = new DeleteProgramPages(driver);
		return deleteProgram;
	}
	public MultipleDeleteProgramPages multipleDeleteProgram() {
		 multipleDeleteProgram = new MultipleDeleteProgramPages(driver);
		 return multipleDeleteProgram;
	}
	
	public SortingValidationPages sortingValidation() {
		sortingValidation = new SortingValidationPages(driver);
		return sortingValidation;
	}
	public PaginationPages pagination() {
		pagination = new PaginationPages(driver);
		return pagination;
	}
	public NavigationValidationPages navigationValidation() {
		navigationValidation = new NavigationValidationPages(driver);
		return navigationValidation;
	}


public DeleteUserPages deleteUser() {
	 deleteUser = new DeleteUserPages(driver);
	 
	 return deleteUser;
}

public DeleteMultipleUserPages DeleteMultipleUser() {
	deleteMultipleUser = new DeleteMultipleUserPages(driver);
	 
	 return deleteMultipleUser;

}
}