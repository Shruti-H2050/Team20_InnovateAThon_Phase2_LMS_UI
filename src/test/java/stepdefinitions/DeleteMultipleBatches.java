package stepdefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteMultipleBatchesPages;
import utilities.TestBase;
import utilities.TestContextSetup;
public class DeleteMultipleBatches {
	public Hooks hooks;
	public DeleteMultipleBatchesPages deleteMultipleBatchesPages;
    public static WebDriver driver;
    public TestBase testBase;
    public TestContextSetup testContextSetup;     
    public DeleteMultipleBatches(TestContextSetup testContextSetup) 
    {
    this.testContextSetup = testContextSetup;
   	this.deleteMultipleBatchesPages = new DeleteMultipleBatchesPages(driver);
   	this.deleteMultipleBatchesPages = testContextSetup.pageObjectManager.deletemultiplebatches();
    }	
	
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() 
	{
		deleteMultipleBatchesPages.checkboxes_are_not_selected();
	}
	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) 
	{
		deleteMultipleBatchesPages.the_delete_icon_disabled(string);
	}
	@Given("One of the checkbox or row is selected")
	public void one_of_the_checkbox_or_row_is_selected() throws InterruptedException 
	{
		deleteMultipleBatchesPages.one_checkbox_selected();
	}
	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) 
	{
		deleteMultipleBatchesPages.click_delete_icon(string);
	}
	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() 
	{
		deleteMultipleBatchesPages.the_respective_data_is_deleted();
	}
	@Given("Two or more checkboxes or row are selected")
	public void two_or_more_checkboxes_or_row_are_selected() 
	{
		deleteMultipleBatchesPages.more_checkboxes_selected();
	}
	@Then("The respective rows in the data table are deleted")
	public void the_respective_rows_in_the_data_table_are_deleted() throws InterruptedException
	{
		deleteMultipleBatchesPages.the_respective_rows_deleted();
	}
}
