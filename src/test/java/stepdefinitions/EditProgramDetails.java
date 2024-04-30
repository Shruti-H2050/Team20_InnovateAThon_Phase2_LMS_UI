package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewProgramPages;
import pageObjects.EditProgramDetailsPages;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class EditProgramDetails {

		public static WebDriver driver;
	    public TestBase testBase;
	    TestContextSetup testContextSetup;
	    LoginPages loginPage;
	    EditProgramDetailsPages editProgramDetails;
	    AddNewProgramPages addNewProgram;
	    
	    public EditProgramDetails(TestContextSetup testContextSetup) {
	    	this.testContextSetup = testContextSetup;
	    	this.testBase=testContextSetup.testBase;
	    	this.editProgramDetails = new EditProgramDetailsPages(driver);
	    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
	    	this.editProgramDetails = testContextSetup.pageObjectManager.editProgramDetails();
	    	this.addNewProgram = testContextSetup.pageObjectManager.addNewProgram();
	    	
	    }
	    
	    @When("Admin clicks <Edit> button on the data table for any row")
	    public void admin_clicks_edit_button_on_the_data_table_for_any_row() {
	    	editProgramDetails.checkPgmEditButton();
	    }

	    @Then("Admin should see a popup open for Program details to edit")
	    public void admin_should_see_a_popup_open_for_program_details_to_edit() {
	    	editProgramDetails.checkEditPopUp();
	    }

	    @Given("Admin is on Program Details Popup window to Edit")
	    public void admin_is_on_program_details_popup_window_to_edit() {
	    	editProgramDetails.checkPgmEditButton();
	    	editProgramDetails.checkEditPopUp();
	    	editProgramDetails.checkEditPopUpDisplayed();
	    }

	    @When("Admin edits the Name column and clicks save button")
	    public void admin_edits_the_name_column_and_clicks_save_button() {
	    	editProgramDetails.editPgmName();
	    	editProgramDetails.clickSave();
	    	//editProgramDetails.editPgmName2();
	    }
	    @When("Admin clears and edits the Name column and clicks save button")
	    public void admin_clears_and_edits_the_name_column_and_clicks_save_button() {
	    	editProgramDetails.editPgmName2();
	    	editProgramDetails.clickSave();
	    }

	    @Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	    public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
	       Assert.assertTrue(editProgramDetails.pgmUpdatedMsg());
	    }

	    @When("Admin edits the Description column and clicks save button")
	    public void admin_edits_the_description_column_and_clicks_save_button() {
	    	editProgramDetails.editPgmDesc();;
	    	editProgramDetails.clickSave();
	    }

	    @Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	    public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
	    	 Assert.assertTrue(editProgramDetails.pgmUpdatedMsg());
	    }

	    @When("Admin changes the Status and clicks save button")
	    public void admin_changes_the_status_and_clicks_save_button() {
	    	editProgramDetails.radioBtnCheck();
	    	editProgramDetails.clickSave();
	    }

	    @Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	    public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
	    	 Assert.assertTrue(editProgramDetails.pgmUpdatedMsg());
	    }

	    @When("Admin clicks <Cancel>button on edit popup")
	    public void admin_clicks_cancel_button_on_edit_popup() {
	    	addNewProgram.checkCancelBtn();
	    }

	    @Then("Admin can see the Program details popup disappears and can see nothing changed for particular program")
	    public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
	    	Assert.assertTrue(addNewProgram.pgmDetailsPopUpDisappers());
	    }

	    @When("Admin clicks <Save>button on edit popup")
	    public void admin_clicks_save_button_on_edit_popup() {
	    	addNewProgram.clickSaveBtnn();
	    }

	    @Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	    public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
	    	Assert.assertTrue(editProgramDetails.successfulMsg()); 
	   	 	Assert.assertTrue(addNewProgram.search());
	    }



	    
}
