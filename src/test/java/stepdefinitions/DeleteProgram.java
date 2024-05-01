package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteProgramPages;
import pageObjects.EditProgramDetailsPages;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class DeleteProgram {

	public static WebDriver driver;
    public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    DeleteProgramPages deleteProgram;
	
	
	public DeleteProgram(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
    	this.testBase=testContextSetup.testBase;
    	this.deleteProgram = new DeleteProgramPages(driver);
    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
    	this.deleteProgram = testContextSetup.pageObjectManager.deleteProgram();
		
	}
	
	
	@When("Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
		deleteProgram.clickDeleteBtn();
	    
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
		deleteProgram.deleteAlertPopUpCheck();
		deleteProgram.deleteAlertPopUpValidate();
	    
	}

	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
		deleteProgram.deleteMsgCheck();
	}
}
