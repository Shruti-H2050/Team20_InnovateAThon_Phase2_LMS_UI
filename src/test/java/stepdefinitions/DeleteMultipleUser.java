package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPages;
import pageObjects.DeleteMultipleUserPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class DeleteMultipleUser {

	public static WebDriver driver;
    public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    DeleteMultipleUserPages DeleteMultipleUser;
	public String suctext;
    public DeleteMultipleUser(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
   	this.testBase=testContextSetup.testBase;
   	this.DeleteMultipleUser = new DeleteMultipleUserPages(driver);
   	this.loginPage=testContextSetup.pageObjectManager.getlogin();
   	this.DeleteMultipleUser = testContextSetup.pageObjectManager.DeleteMultipleUser();
	   
   }

@Given("Admin is in Manage User pages")
public void admin_is_in_manage_user_pages() {
    // Write code here that turns the phrase above into concrete actions
	DeleteMultipleUser.onManageUserPage();
	
	
}
@When("When Admin clicks any checkbox in the data tables")
public void Admin_clicks_any_checkbox_in_the_data_tables() {
	DeleteMultipleUser.clickCheckbox();
}
@Then("Admin should see common delete option enabled under header Manage Users")
public void admin_should_see_common_delete_option_enabled_under_header_manage_users() {
    // Write code here that turns the phrase above into concrete actions
    
     DeleteMultipleUser.deleteBtnEnabled();

}

@Given(": Admin is on Confirm Deletion alerts")
public void admin_is_on_confirm_deletion_alerts() {
    // Write code here that turns the phrase above into concrete actions
   driver.switchTo().alert();
   
}

@When("Admin clicks <Yes> button on the alerts")
public void admin_clicks_Yes_button_on_the_alerts() {
    // Write code here that turns the phrase above into concrete actions
	
	;
	DeleteMultipleUser.clickonpopup();
	driver.switchTo().alert().accept();
	DeleteMultipleUser.clickonyes();
	
	
}

@Then("Admin should land on Manage User page and can see the selected user is deleted from the data tables")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_user_is_deleted_from_the_data_tables() {
    // Write code here that turns the phrase above into concrete actions
     DeleteMultipleUser.getsuccesstext();
     
}

@When("Admin clicks <No> button on the alerts")
public void admin_clicks_no_button_on_the_alerts() {
    // Write code here that turns the phrase above into concrete actions
	DeleteMultipleUser.clickCheckbox();
	DeleteMultipleUser.clickonpopup();
	driver.switchTo().alert().accept();
	DeleteMultipleUser.clickonno();

}

@Then("Admin should land on Manage User page and can see the selected user is not deleted from the data tables")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_user_is_not_deleted_from_the_data_tables() {
    // Write code here that turns the phrase above into concrete actions
    
}
}


