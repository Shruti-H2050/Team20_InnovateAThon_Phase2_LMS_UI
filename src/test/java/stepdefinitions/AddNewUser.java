package stepdefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewBatchPages;
import pageObjects.AddNewUserPages;
import utilities.TestBase;
import utilities.TestContextSetup;
public class AddNewUser {
	
	public Hooks hooks;
	public static WebDriver driver;
    public TestBase testBase;
    public TestContextSetup testContextSetup;
    public AddNewBatchPages addNewBatchPages;
    public AddNewUserPages addnewuserPages;
    
    public AddNewUser(TestContextSetup testContextSetup) 
    {
    this.testContextSetup = testContextSetup;
   	this.addnewuserPages = new AddNewUserPages(driver);
   	this.addnewuserPages = testContextSetup.pageObjectManager.addnewuser();
    }	
   @Then("Clicks {string} button on the navigation bar")
   public void clicks_button_on_the_navigation_bar(String string) throws InterruptedException 
    {
	     addnewuserPages.clicks_userbutton(string);
    }
	@Given("Admin is on Manage User Page")
	public void admin_is_on_manage_user_page()
	{
		   System.out.println("Admin lands on Manage User Page");
	}
	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) 
	{
		   addnewuserPages.admin_clicks_button(string);
	}

	@Then("Admin should see pop up open for user details with FirstName,Middle name, Last Name, Location, phone, email, linkedin url,User Role, Role status, visa status,Undergraduate, postgraduate,timezone ,user comments and user fields along with Cancel , Submit andclose buttons")
	public void admin_should_see_pop_up_open_for_user_details_with_first_name_middle_name_last_name_location_phone_email_linkedin_url_user_role_role_status_visa_status_undergraduate_postgraduate_timezone_user_comments_and_user_fields_along_with_cancel_submit_andclose_buttons() 
	{
		   addnewuserPages.pop_up_with_fields();
	}

	@Then("Admin should see text boxes for the fields First Name, Middlename, Last Name, Location, phone, email, linkedin url, Undergraduate,postgraduate,time zone ,user comments")
	public void admin_should_see_text_boxes_for_the_fields_first_name_middlename_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_user_comments() 
	{
		  addnewuserPages.pop_up_text_boxes();
	}
	
	@Then("Admin should see drop downs for the fields User Role, Rolestatus, visa status on user details pop up")
	public void admin_should_see_drop_downs_for_the_fields_user_role_rolestatus_visa_status_on_user_details_pop_up() 
	{
		  addnewuserPages.drop_downs_pop_up();
	}
	@Given("Admin is on User details pop up")
	public void admin_is_on_user_details_pop_up() 
	{
		 addnewuserPages.admin_on_user_details_pop_up();
	}

	@When("Admin enters mandatory fields in the form and clicks on submit button")
	public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_submit_button() throws InterruptedException 
	{
		 addnewuserPages.admin_mandatory_fields_submit_button();
	}

	@Then("Admin gets message User added Successfully")
	public void admin_gets_message_user_added_successfully() 
	{
		addnewuserPages.success_message();
	}

	@When("Admin skips to add value in mandatory field")
	public void admin_skips_to_add_value_in_mandatory_field() throws InterruptedException 
	{
		addnewuserPages.admin_skips_mandatory_field();
	}

	@Then("Admin should see error message below the test field and the field will be highlighed in red color")
	public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color()
	{
		addnewuserPages.error_message_highlighed();
	}

	@When("Admin enters invalid data in all of the  fields in the form and clicks on submit button")
	public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_submit_button() 
	{
		addnewuserPages.invalid_data_all_fields();
	}

	@Then("Admin gets error message and user is not created")
	public void admin_gets_error_message_and_user_is_not_created()
	{
		addnewuserPages.error_message_user_not_created();
	}

	@When("Admin clicks on submit button without entering data")
	public void admin_clicks_on_submit_button_without_entering_data() throws InterruptedException 
	{
		addnewuserPages.submit_button_without_data();
	}

	@Then("user wont be created and Admin gets error message")
	public void user_wont_be_created_and_admin_gets_error_message()
	{
		AddNewUserPages.error_message_highlighed() ;
		addnewuserPages.error_message1();
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on User Details form")
	public void admin_clicks_cancel_close_x_icon_on_user_details_form()
	{
		addnewuserPages.close_button();	
	}

	@Then("User Details popup window should be closed without saving")
	public void user_details_popup_window_should_be_closed_without_saving() {

		addnewuserPages.user_details_popup_closed();
	}

	@When("Admin clicks Cancel button")
	public void admin_clicks_cancel_button() {

		addnewuserPages.admin_clicks_cancel_button(); 
	}

	@Then("Admin can see the User details popup disappears without adding any user")
	public void admin_can_see_the_user_details_popup_disappears_without_adding_any_user() {
		addnewuserPages.popup_disappears_not_adding_user(); 
	
	}

	@When("Fill in all the fields with valid values and click submit")
	public void fill_in_all_the_fields_with_valid_values_and_click_submit() throws InterruptedException {

		addnewuserPages.valid_values_submit();
	}

	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() {

		addnewuserPages.the_newly_added_user_page() ;
	}
}

