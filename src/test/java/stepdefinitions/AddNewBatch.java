package stepdefinitions;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewBatchPages;
import utilities.TestBase;
import utilities.TestContextSetup;
public class AddNewBatch {
    public static WebDriver driver;
    public TestBase testBase;
    public TestContextSetup testContextSetup;
    public AddNewBatchPages addNewBatchPages;
    public AddNewBatch(TestContextSetup testContextSetup) 
    {
    this.testContextSetup = testContextSetup;
   	this.addNewBatchPages = new AddNewBatchPages(driver);
   	this.addNewBatchPages = testContextSetup.pageObjectManager.createNewBatch();
    }	
    @When("Admin clicks {string} button.")
    public void admin_clicks_button(String string) 
    {
    	addNewBatchPages.admin_clicks_button(string);
    }
	@Given("A new pop up with Batch details appears.")
	public void a_new_pop_up_with_batch_details_appears()
	{
		System.out.println("A popup is displayed with required fields for Batch creation");
	}
	@Then("The pop up should include the fields Name,Number of classes and Description as text box,Program Name as drop down Status as radio button Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() 
	{
		addNewBatchPages.the_pop_up_with_fields();
	}
	@Given("Reads data from excel by using {string} and {int} to fill all fields with positive data")
	public void reads_data_from_excel_by_using_and_to_fill_all_fields_with_positive_data(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException 
	{
		addNewBatchPages.readDataFromSheet(sheetName,rowNumber);
	}
	@When("Clicks save button")
	public void clicks_save_button() throws InterruptedException
	{
		addNewBatchPages.clicks_save();
	}
	@Then("The success message pop up should be displayed")
	public void the_success_message_pop_up_should_be_displayed() 
	{
		addNewBatchPages.success_message_pop_up();
	}
	@When("clicks Cancel button")
	public void clicks_cancel_button() throws InterruptedException 
	{
		addNewBatchPages.clicks_cancel();
	}
	@Then("The batch shouldnot be added and shouldnot be displayed with success message")
	public void the_batch_shouldnot_be_added_and_shouldnot_be_displayed_with_success_message() throws InterruptedException 
	{
		addNewBatchPages.the_batch_not_added();
	}
	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() throws InterruptedException 
	{
		addNewBatchPages.added_batch_in_data_table();
	}
	@Given("Reads data from excel by using {string} and {int} to fill fields with negative data")
	public void reads_data_from_excel_by_using_and_to_fill_fields_with_negative_data(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException 
	{
		addNewBatchPages.readDataFromSheet(sheetName,rowNumber);
	}
	@Given("Reads data from excel by using {string} and {int} to check missing values in mandatory fields")
	public void reads_data_from_excel_by_using_and_to_check_missing_values_in_mandatory_fields(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException 
	{
		addNewBatchPages.readDataFromSheet(sheetName,rowNumber);
	}
	@Then("Error message should appear")
	public void error_message_should_appear() 
	{
		addNewBatchPages.error_message();
	}
	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() throws InterruptedException
	{
		addNewBatchPages.error_message1();
	}
}
