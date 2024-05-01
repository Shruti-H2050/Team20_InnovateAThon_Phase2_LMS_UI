package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewProgramPages;
import pageObjects.LoginPages;
import pageObjects.ManageProgramValidationPages;
import pageObjects.UserPageValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class UserPageValidation {
	
	public WebDriver driver;
	
	
	public TestBase testBase;
    TestContextSetup testContextSetup;
    UserPageValidationPages userPages;
	

	    
	    public UserPageValidation(TestContextSetup testContextSetup) {
	    	this.testContextSetup = testContextSetup;
	    	this.userPages = new UserPageValidationPages(driver);
	    	this.userPages = testContextSetup.pageObjectManager.userPages();
	    	this.testBase=testBase; 
	    }

//	@Given("Admin is on dashboard page after Login")
//	public void admin_is_on_dashboard_page_after_login() {
//		Assert.assertTrue(userPages.getTitle().contains("LMS"));
//		System.out.println("On the user page dashboard");	
//	}
//	
//
//   @When("Admin clicks {string} from navigation bar")
//	public void admin_clicks_from_navigation_bar(String string) {
//		userPages.UsrOnNavigationBar();
//		System.out.println("clicks user on nav bar");
//	}
//
//	@Then("Admin should see the {string} in the URL")
//	public void admin_should_see_the_in_the_url(String string) {
//		
//		 System.out.println(userPages.getCurrentUserePageUrl());
//		 System.out.println(userPages.getTestUserPageUrl());
//	    Assert.assertEquals(userPages.getCurrentUserePageUrl(),userPages.getTestUserPageUrl());
//	   
//	}
//	@Then("Admin should see a heading with text {string} on the page")
//	public void admin_should_see_a_heading_with_text_on_the_page(String string) {
//		 System.out.println(userPages.checkUserPageHeading());
//		    Assert.assertTrue(userPages.checkUserPageHeading());
//		}
//		
//		
//		@Then("{string}{string}\" along with Pagination icon below the table.")
//	public void along_with_pagination_icon_below_the_table(String string, String string2) {
//		userPages.getPaginationText();
//		userPages.checkPaginationButton();
//	}
//
//	@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete")
//	public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete() {
//	    Assert.assertTrue(userPages.getusrColumnID());
//	    Assert.assertTrue(userPages.getusrColumnName());
//	    Assert.assertTrue(userPages.getusrColumnLocation());
//	    Assert.assertTrue(userPages.getusrColumnPhoneNum());
//	    Assert.assertTrue(userPages.getusrColumnEditDelete());
//	}
//    
//	@Then("Admin should see a Delete button on the top left hand side as Disabled")
//	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
//	    Assert.assertFalse(userPages.validateDeleteButtonOnTopLeft());
//
//	}
//
//	@Then("Admin should be able to see the {string} button above the data table")
//	public void admin_should_be_able_to_see_the_button_above_the_data_table(String string) {
//		userPages.newUsrPageButton();
//	}
//
//	
//	
//	
//	@Then("Admin should be able to see the search text box above the data table")
//	public void admin_should_be_able_to_see_the_search_text_box_above_the_data_table() {
//		userPages.checkSearchBar();
//	}
//
//		
//	@Then("Admin should see two records displayed on the data table")
//	public void admin_should_see_two_records_displayed_on_the_data_table() {
//		userPages.getTableNumOfRows();
//	}
//
//	@Then("Each row in the data table should have a checkbox")
//	public void each_row_in_the_data_table_should_have_a_checkbox() {
//		Assert.assertTrue(userPages.checkboxPresent());
//
//	}
//
//
//
//	@Then("Each row in the data table should have a edit icon that is enabled")
//	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
//		Assert.assertTrue(userPages.checkEditBtnPresent());
//	}
//
//
//
//   @Then("Each row in the data table should have a delete icon that is enabled")
//	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
//		Assert.assertTrue(userPages.checkDeleteBtnPresent());
	

	


    @Given("Admin is on Manage User Page")
   public void admin_is_on_manage_user_page() {
    	userPages.validateManageUser();
}
   
    @When("Admin enters user name into search box.")
    public void admin_enters_user_name_into_search_box() throws InterruptedException {
		userPages.searchBoxLocator();

    }

    
	@Then("Admin should see user displayed with the entered name")
	public void admin_should_see_user_displayed_with_the_entered_name() throws InterruptedException {
		userPages.userNamedisplayedValidate();

}
}
//
//
//  @When("Admin enters the keywords not present in the data table on the Search box")
//  public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() {
//	  userPages.keywordsNotPresent();
// }
//
//  @Then("Admin should see zero entries on the data table")
//  public void admin_should_see_zero_entries_on_the_data_table() {
//	  userPages.zeroPaginationText();
//	   
//  }
//}




