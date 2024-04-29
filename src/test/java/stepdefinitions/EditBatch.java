package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditBatch {
	@Given("Logged into the LMS portal.")
	public void logged_into_the_lms_portal() {
	    
	}
	@When("Admin is on dashboard page after Login and admin clicks on {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_on_from_navigation_bar(String string) {
	   
	}
	@Then("Admin clicks {string} button now")
	public void admin_clicks_button_now(String string) {
	
	}
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {

	}
	@Then("A new pop up with Batch details will appears")
    public void a_new_pop_up_with_batch_details_will_appears() {
   
    }

	@Given("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	 
	}
	@When("Update the fields with valid values and click save")
	public void update_the_fields_with_valid_values_and_click_save() {
	 
	}
	 
    @Then("Error message should appear.")
    public void error_message_should_appear() {
   
    }

	@Then("The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table() {
	  
	}

	@When("Update the fields with invalid values and click save")
	public void update_the_fields_with_invalid_values_and_click_save() {
	  
	}
	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() {
	   
	}
   
}
