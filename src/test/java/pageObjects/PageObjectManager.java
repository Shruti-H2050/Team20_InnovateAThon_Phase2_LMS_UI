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
	public AddNewBatchPages createNewBatch;
	public AddNewUserPages addnewuser;

        public SortingValidationPages sortingValidation;
        public PaginationPages pagination;
        public NavigationValidationPages navigationValidation
        public AddNewProgramDetailsPages addNewProgramDetails;
        public DeleteProgramPages deleteProgram;
        public MultipleDeleteProgramPages multipleDeleteProgram;
        public EditProgramDetailsPages editProgramDetails;

	// public AddNewProgramDetailsPages addNewProgramDetails;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePagePages gethomepage() {
		m_homepage = new HomePagePages(driver);
		return m_homepage;

	}

	public DashboardPages getdashboard() {
		m_dashboard = new DashboardPages(driver);
		return m_dashboard;

	}

	public AddNewProgramPages createNewPgm() {
		addNewProgramPages = new AddNewProgramPages(driver);

		return addNewProgramPages;
	}

	public AddNewBatchPages createNewBatch() {
		createNewBatch = new AddNewBatchPages(driver);

		return createNewBatch;
	}

	public AddNewUserPages addnewuser() {
		addnewuser = new AddNewUserPages(driver);

		return addnewuser;
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
		assignStudentPage = new AssignStudentPages(driver);
		return assignStudentPage;
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
