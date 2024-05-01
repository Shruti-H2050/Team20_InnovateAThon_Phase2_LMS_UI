package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewProgramDetailsPages;
import pageObjects.AddNewProgramPages;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class AddNewProgramDetails {
	
	public static WebDriver driver;
	public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    AddNewProgramPages addNewProgram;
    AddNewProgramDetailsPages addNewProgramDetails;
    
    public AddNewProgramDetails(TestContextSetup testContextSetup) {
    	this.testContextSetup = testContextSetup;
    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
    	this.testBase=testContextSetup.testBase;
    	this.addNewProgramDetails = new AddNewProgramDetailsPages(driver);
    	this.addNewProgramDetails = testContextSetup.pageObjectManager.addNewProgramDetails();
    	this.addNewProgram = testContextSetup.pageObjectManager.addNewProgram();
    }

	@Given("Admin is on Manage Program Page after clicks Program on the navigation bar")
	public void admin_is_on_manage_program_page_after_clicks_program_on_the_navigation_bar() {
		String username = testBase.getUsername();
        String password = testBase.getPassword();
        loginPage.logindetails(username, password);
        loginPage.clickloginButton();
        addNewProgram.pgmOnNavigationBar();
        Assert.assertTrue(addNewProgram.getTitle().contains("LMS"));
        System.out.println("On Manage pgm page");
	}

	@Given("Admin is on {string} Popup window")
	public void admin_is_on_popup_window(String string) {
		addNewProgram.clickNewPgmButton();
		addNewProgram.pgmDetailsPopUp();
	}

	@When("Admin clicks <Save>button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() {
		addNewProgram.clickSaveBtnn();
	}

	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
		addNewProgram.geterrorMsgAlert();
	}

	@When("Admin enters only<Program Name> in text box and clicks Save button")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button() {
		addNewProgram.enterPgmName();
		addNewProgram.clickSaveBtnn();
	}

	@Then("Admin gets a message alert {string}")
	public void admin_gets_a_message_alert(String string) {
		addNewProgram.pgmDescRequiredErrMsg();
		addNewProgram.pgmStatusRequiredErrMsg();
	}

	@When("Admin enters only<Program description> in text box and clicks Save button")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button() {
		addNewProgram.enterPgmDesc();
		addNewProgram.clickSaveBtnn();
	}
	
	@Then("Admin gets a alert message {string}")
	public void admin_gets_a_alert_message(String string) {
		addNewProgram.pgmNameRequiredErrMsg();
		addNewProgram.pgmStatusRequiredErrMsg();
	}

	@When("Admin selects only Status and clicks Save button")
	public void admin_selects_only_status_and_clicks_save_button() {
		addNewProgram.selectStatusRadioBtn();
		addNewProgram.clickSaveBtnn();
	}
	
	@Then("Admin gets a message alert with {string}")
	public void admin_gets_a_message_alert_with(String string) {
		addNewProgram.pgmNameRequiredErrMsg();
		addNewProgram.pgmDescRequiredErrMsg();
	}

	
	@When("Admin enters only numbers or special char in name and desc column")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column() {
	   addNewProgram.specialCharacterCheckPgmNameDesc();
	   
	}

	@Then("Admin gets a Detailed Error message alert")
	public void admin_gets_a_detailed_error_message_alert() {
		addNewProgram.pgmNameDetailedErrorMsg();
		addNewProgram.pgmDescDetailedErrorMsg();
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Program Details form")
	public void admin_clicks_cancel_close_x_icon_on_program_details_form() {
		addNewProgram.closePgmPopUp();
	}

	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
	   addNewProgram.popIsClosed();
	}

	@When("Enter all the required fields with valid values and click Save button")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() throws InterruptedException {
		addNewProgram.addPgmSuccessful();
		addNewProgram.selectStatusRadioBtn();
		addNewProgram.clickSaveBtnn();
		//Thread.sleep(2000);
	}

	@Then("Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String string) {
	 Assert.assertTrue(addNewProgram.successfulMsg()); 
	 Assert.assertTrue(addNewProgram.search());
	}

	@When("Admin clicks <Cancel>button")
	public void admin_clicks_cancel_button() {
		addNewProgram.checkCancelBtn();
	}

	@Then("Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
		Assert.assertTrue(addNewProgram.pgmDetailsPopUpDisappers());
	}



}
