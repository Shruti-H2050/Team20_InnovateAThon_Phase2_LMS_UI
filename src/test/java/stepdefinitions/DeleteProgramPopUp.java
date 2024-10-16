package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteProgramPages;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class DeleteProgramPopUp {

	public static WebDriver driver;
    public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    DeleteProgramPages deleteProgram;
	
    public DeleteProgramPopUp(TestContextSetup testContextSetup) {
    	this.testContextSetup = testContextSetup;
    	this.testBase=testContextSetup.testBase;
    	this.deleteProgram = new DeleteProgramPages(driver);
    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
    	this.deleteProgram = testContextSetup.pageObjectManager.deleteProgram();
    }
	
	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
		deleteProgram.clickDeleteBtn();
		deleteProgram.deleteAlertPopUpCheck();
	}

	@When("Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
		deleteProgram.clickDeleteAlertPopUpYes();
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
		Assert.assertTrue(deleteProgram.pgmDeleted());
	}

	@When("Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
		deleteProgram.clickdeleteAlertPopUpNo();
	}

	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
		deleteProgram.popUpIsNotDisplayed();
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert")
	public void admin_clicks_cancel_close_x_icon_on_deletion_alert() {
		deleteProgram.clickDeletePopUpCloseIcon();
	}

	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
		deleteProgram.popUpIsNotDisplayed();
		deleteProgram.search();
	}



}
