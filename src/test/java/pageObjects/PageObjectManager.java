package pageObjects;

import org.openqa.selenium.WebDriver;

import utilities.TestContextSetup;

public class PageObjectManager {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public LoginPages loginPage;
	public HomePagePages m_homepage;
	public DashboardPages m_dashboard;
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
	
	public HomePagePages gethomepage() {
		   m_homepage=new HomePagePages(driver);
			return m_homepage;
			
	   }
	   
		
		  public DashboardPages getdashboard() { 
			  m_dashboard=new
		  DashboardPages(driver); 
			  return m_dashboard;
		  
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
}