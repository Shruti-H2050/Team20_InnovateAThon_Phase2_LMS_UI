package stepdefinitions;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteBatchPages;
import utilities.TestBase;
import utilities.TestContextSetup;
public class DeleteBatch{
		public Hooks hooks;
	    public static WebDriver driver;
	    public TestBase testBase;
	    public TestContextSetup testContextSetup;
	    public DeleteBatchPages deleteBatchPages; 
public DeleteBatch(TestContextSetup testContextSetup) 
{
	    this.testContextSetup = testContextSetup;
	   	this.deleteBatchPages = new DeleteBatchPages(driver);
	   	this.deleteBatchPages = testContextSetup.pageObjectManager.deletebatch();
}	
@Given("Logged on the LMS portal")
public void logged_on_the_lms_portal() throws IOException, InterruptedException 
{
	deleteBatchPages.logged_lms_portal(); 
}
@When("Admin is on dashboard page after Login and Admin clicks {string} from navigation bar")
public void admin_is_on_dashboard_page_after_login_and_admin_clicks_from_navigation_bar(String string) 
{
	deleteBatchPages.admin_on_dashboard_page(string);
}
@Given("The delete icon on row level in data table is enabled..")
public void the_delete_icon_on_row_level_in_data_table_is_enabled() 
{
	deleteBatchPages.the_delete_icon_enabled();
}
@When("Admin clicks the delete icon")
public void admin_clicks_the_delete_icon() 
{
	deleteBatchPages.admin_clicks_delete_icon();  
}
@Then("Alert appears with yes and No option..")
public void alert_appears_with_yes_and_no_option() 
{
	deleteBatchPages.alert_with_yes_no();
}
@Given("Admin clicks on the delete icon")
public void admin_clicks_on_the_delete_icon()
{
	deleteBatchPages.admin_clicks_delete_icon(); 
}
@When("You click yes option..")
public void you_click_yes_option() 
{
	deleteBatchPages.clicks_yes_option();
}
@Then("Batch deleted alert pops and batch is no more available in data table..")
public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() 
{
	deleteBatchPages.batch_deleted_alert_pops();
}
@When("you click No option..")
public void you_click_no_option() 
{
	deleteBatchPages.clicks_no_option();
}
@Then("Batch is still listed in data table..")
public void batch_is_still_listed_in_data_table() 
{
	deleteBatchPages.batch_not_deleted();
}
}
