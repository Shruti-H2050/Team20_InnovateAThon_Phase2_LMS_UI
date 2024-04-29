package pageObjects;
import org.openqa.selenium.WebDriver;
public class PageObjectManager {
	public WebDriver driver;
	public AddNewProgramPages addNewProgramPages;
	public AddNewBatchPages addNewBatchPages;
	public BatchPageValidationPages batchPageValidationPages;
	public EditBatchPages editBatchPages;
	public DeleteBatchPages deleteBatchPages;
	public DeleteMultipleBatchesPages deleteMultipleBatchesPages;
	public PageObjectManager(WebDriver driver)
{
		this.driver = driver;
}
	public BatchPageValidationPages batchpageval() {
		batchPageValidationPages = new BatchPageValidationPages(driver);
		return batchPageValidationPages;		
}
	public AddNewBatchPages createNewBatch() {
		addNewBatchPages = new AddNewBatchPages(driver);
		return addNewBatchPages;		
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
}