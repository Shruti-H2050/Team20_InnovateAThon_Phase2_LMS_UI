package stepdefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewBatchPages;
import pageObjects.AddNewUserPages;
import pageObjects.EditBatchPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class EditBatch {
	public Hooks hooks;
	public static WebDriver driver;
    public TestBase testBase;
    public TestContextSetup testContextSetup;
    public AddNewBatchPages addNewBatchPages;
    public AddNewUserPages addnewuserPages;
    public EditBatchPages editBatchPages;
    public EditBatch(TestContextSetup testContextSetup) 
    {
    this.testContextSetup = testContextSetup;
   	this.editBatchPages = new EditBatchPages(driver);
   	this.editBatchPages = testContextSetup.pageObjectManager.editbatchpage();
    }	
	
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() 
	{
		editBatchPages.the_edit_icon_enabled();
		editBatchPages.edit_icon_at_first_row();
	}
	@When("Admin clicks the edit icon at row level")
	public void admin_clicks_the_edit_icon_at_row_level() 
	{
		editBatchPages.admin_clicks_the_edit_icon();
	}
	@Then("A new pop up with Batch details will appears")
    public void a_new_pop_up_with_batch_details_will_appears() 
	{
		editBatchPages.pop_up_appears();
    }
	@Given("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() 
	{
		editBatchPages.admin_clicks_the_edit_icon();
	}
	@When("Update the fields with valid values and click save")
	public void update_the_fields_with_valid_values_and_click_save() throws InterruptedException 
	{
		editBatchPages.update_fields_with_valid_values_and_click_save();
	}  
	@Then("The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table() throws InterruptedException 
	{
		editBatchPages.the_updated_batch_on_the_data_table();
	}
	@When("Update the fields with invalid values and click save")
	public void update_the_fields_with_invalid_values_and_click_save() throws InterruptedException 
	{
		editBatchPages.update_the_fields_with_invalid_values_and_click_save();
	}
	@Then("Error message should appear.")
    public void error_message_should_appear() 
    {
		editBatchPages.error_message_should_appear();
    }
	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() throws InterruptedException
	{
		editBatchPages.erase_data_from_mandatory_field();
	}  
	@When("Erase data from description field")
	public void erase_data_from_description_field() throws InterruptedException 
	{
		editBatchPages.erase_data_from_mandatory_field();
	}
	@Then("See Error message appears if the description is mandatory.")
	public void see_error_message_appears_if_the_description_is_mandatory()
	{
		editBatchPages.error_message_should_appear();
	}
}
