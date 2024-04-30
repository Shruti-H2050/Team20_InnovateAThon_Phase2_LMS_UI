package pageObjects;

import org.openqa.selenium.WebDriver;

import utilities.TestContextSetup;

public class PageObjectManager {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public HomePagePages m_homepage;
	public DashboardPages m_dashboard;

	public AddNewProgramPages addNewProgramPages;
	public ManageProgramValidationPages manageProgram;
	public AddNewProgramPages addNewProgram;
	public BatchPageValidationPages batchPageValidationPages;
	public EditBatchPages editBatchPages;
	public DeleteBatchPages deleteBatchPages;
	public DeleteMultipleBatchesPages deleteMultipleBatchesPages;
	public AssignStudentPages assignStudentPage;
	//public AddNewProgramDetailsPages addNewProgramDetails;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
   public HomePagePages gethomepage() {
	   m_homepage=new HomePagePages(driver);
		return m_homepage;
		
   }
   
   public DashboardPages getdashboard() {
	   m_dashboard=new DashboardPages(driver);
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
	public BatchPageValidationPages batchpageval() {
		batchPageValidationPages = new BatchPageValidationPages(driver);
		return batchPageValidationPages;		
}
	
	public AddNewProgramPages addNewProgram() {
		 addNewProgram = new AddNewProgramPages(driver);
		 return addNewProgram;
	}
	public EditBatchPages editbatchpage() {
		editBatchPages = new EditBatchPages(driver);
		return editBatchPages;		
}
	public DeleteBatchPages deletebatch() {
		deleteBatchPages = new DeleteBatchPages(driver);
		return deleteBatchPages;		
}
	public DeleteMultipleBatchesPages deletemultiplebatches() {
		deleteMultipleBatchesPages = new DeleteMultipleBatchesPages(driver);
		return deleteMultipleBatchesPages;		
}
	
	public AssignStudentPages assignStudentPage() {
		deleteMultipleBatchesPages = new DeleteMultipleBatchesPages(driver);
		return assignStudentPage;		
}
	
	
	
	
	

}