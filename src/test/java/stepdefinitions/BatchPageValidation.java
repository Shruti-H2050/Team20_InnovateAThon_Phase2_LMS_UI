package stepdefinitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BatchPageValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;
public class BatchPageValidation {
	public Hooks hooks;
    public static WebDriver driver;
    public BatchPageValidationPages batchPageValidationPages;
    public TestBase testBase;
    public TestContextSetup testContextSetup;     
public BatchPageValidation(TestContextSetup testContextSetup) 
{
    this.testContextSetup = testContextSetup;
   	this.batchPageValidationPages = new BatchPageValidationPages(driver);
   	this.batchPageValidationPages = testContextSetup.pageObjectManager.batchpageval();
}
@Given("Admin is on dashboard page after Login.")
public void admin_is_on_dashboard_page_after_login()
{
	 System.out.println("Admin should land on dashboard page after Login.");
}
@When("Admin clicks {string} from navigation bar.")
public void admin_clicks_from_navigation_bar(String string) 
{
	batchPageValidationPages.admin_clicks_batchbutton(string);
}
@Then("Admin should see the {string} in the URL.")
public void admin_should_see_the_in_the_url(String string) 
{
	batchPageValidationPages.admin_url(string);
}
@Then("Admin should see the {string} in the header.")
public void admin_should_see_the_in_the_header(String string) 
{
	batchPageValidationPages.admin_header(string);
}
@Then("Admin should see the pagination controls under the data table.")
public void admin_should_see_the_pagination_controls_under_the_data_table() 
{
	batchPageValidationPages.admin_pagination_controls();
}
@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete.")
public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() 
{
	batchPageValidationPages.header_fields();
}
@Then("Admin should be able to see the {string} icon button that is disabled.")
public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) 
{
	batchPageValidationPages.deleteicon_disabled(string);
}
@Then("Each row in the data table should have a checkbox.")
public void each_row_in_the_data_table_should_have_a_checkbox() 
{
	batchPageValidationPages.checkboxes_diplayed();
}
@When("Admin clicks on {string} from navigation bar.")
public void admin_clicks_on_from_navigation_bar(String string) 
{
	batchPageValidationPages.admin_clicks_batchbutton(string);
}
@Then("Each row in data table should have a edit icon that is enabled.")
public void each_row_in_data_table_should_have_a_edit_icon_that_is_enabled() 
{
	batchPageValidationPages.edit_icon_enabled();
}
@Then("Admin should be able to see the {string} button is enabled.")
public void admin_should_be_able_to_see_the_button_is_enabled(String string) 
{
	batchPageValidationPages.anewbatchbtn(string);
}
@Then("Admin should be able to see the {string} box is enabled.")
public void admin_should_be_able_to_see_the_box_is_enabled(String string) 
{
	batchPageValidationPages.search_box_enabled(string);
}
@Then("Each row in the data table should have a delete icon that is enabled.")
public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled()
{
	batchPageValidationPages.delete_icon_enabled();
}
@When("Admin clicks {string} button..")
public void admin_clicks_button(String string) throws InterruptedException 
{
	batchPageValidationPages.admin_clicks_button(string);
}
@Then("A new pop up with Batch details appears..")
public void a_new_pop_up_with_batch_details_appears() 
{
	batchPageValidationPages.pop_up_appears();
}
}

