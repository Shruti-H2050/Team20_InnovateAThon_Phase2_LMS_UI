package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPages;
import pageObjects.ManageProgramValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class ManageProgramValidation {
	
	 public static WebDriver driver;
	    
	    private TestBase testBase;
	    TestContextSetup testContextSetup;
	    ManageProgramValidationPages manageProgram;
	    
	    public ManageProgramValidation(TestContextSetup testContextSetup) {
	    	this.testContextSetup = testContextSetup;
	    	this.manageProgram = new ManageProgramValidationPages(driver);
	    	this.manageProgram = testContextSetup.pageObjectManager.manageProgram();
	    }

	@Given("Admin is on dashboard after login")
	public void admin_is_on_dashboard_after_login() {
		Assert.assertTrue(manageProgram.getTitle().contains("LMS"));
		System.out.println("On the manage pgm dashboard");		
		//Assert.assertTrue(landingPage.getTitle().contains("GreenKart"));
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		manageProgram.pgmOnNavigationBar();
		System.out.println("clicks pgm on nav bar");	
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) throws IOException {
		//This assert must actually fail, this is bug as manage pgm url doesnt have manage program as endpoint in url
		 System.out.println(manageProgram.getCurrentManagePgmUrl());
		 System.out.println(manageProgram.getTestManagePgmUrl());
	    Assert.assertEquals(manageProgram.getCurrentManagePgmUrl(),manageProgram.getTestManagePgmUrl());
	   
	}

	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String string) {
		 System.out.println(manageProgram.checkPgmPageHeading());
	    Assert.assertTrue(manageProgram.checkPgmPageHeading());
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) {
		manageProgram.getPaginationText();
		manageProgram.checkPaginationButton();
	}

	@Then("Admin should see the footer as {string}.")
	public void admin_should_see_the_footer_as(String string) {
		manageProgram.getFooterText();
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		Assert.assertFalse(manageProgram.validateDeleteButtonOnTopLeft());
		//Assert.assertTrue(manageProgram.validateDeleteButtonOnTopLeft());
	}

	@Then("Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String string) {
		manageProgram.newPgmButton();
	}

	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	    manageProgram.getTableNumOfRows();
	}

	@Then("Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
	    
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	    
	}

	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
	    
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    
	}

	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
	    
	}



}
