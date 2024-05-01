package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignStudentPages;
import pageObjects.HomePagePages;
import pageObjects.ManageProgramValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class AssignStudentone {

	private AssignStudentPages m_assignStudentPage;
	private HomePagePages m_homepage;
	private final TestBase testbase;
	private final WebDriver m_driver;
	private TestContextSetup m_testContextSetup;

	private String url;

	public AssignStudentone(TestContextSetup testContextSetup) throws IOException {
		m_testContextSetup = testContextSetup;

		m_driver = testContextSetup.driver;
		this.testbase = testContextSetup.testBase;

		m_homepage = testContextSetup.pageObjectManager.gethomepage();

		m_assignStudentPage = testContextSetup.pageObjectManager.assignStudentPage();
	}

	@Given("Admin is on Manage User after clicking User on the navigation bar")
	public void admin_is_on_manage_user_after_clicking_user_on_the_navigation_bar() {
		url = testbase.getUrl();

		String username = testbase.getUsername();
		String password = testbase.getPassword();
		m_homepage.setLoginDetails(username, password);

		m_homepage.clickloginButton();
		m_assignStudentPage.UserOnNavigationBar();
	}

	@Given("Admin is in the manage user page")
	public void admin_is_in_the_manage_user_page() {

	}

	@When("Admin clicks the {string} button")
	public void admin_clicks_the_button(String string) {
		m_assignStudentPage.ClickAssignstudent();
	}

	@Then("Admin should see a popup open for assign student details with an empty form")
	public void admin_should_see_a_popup_open_for_assign_student_details_with_an_empty_form() {
	    assertTrue("Assign student popup is not displayed", m_assignStudentPage.isAssignStudentPopupDisplayed());


	}

	@Then("the popup should include Save and Cancel buttons")
	public void the_popup_should_include_save_and_cancel_buttons() {
		 Assert.assertTrue(m_assignStudentPage.isSaveButtonDisplayed());
	        Assert.assertTrue(m_assignStudentPage.isCancelButtonDisplayed());
	}

	@Then("there should be a close \\(X) icon on the top right corner of the window")
	public void there_should_be_a_close_x_icon_on_the_top_right_corner_of_the_window() {
        Assert.assertTrue(m_assignStudentPage.isCloseIconDisplayed());

	}

	@Then("Admin should see User Role as R03")
	public void admin_should_see_user_role_as_r03() {
        Assert.assertEquals("R03", m_assignStudentPage.getUserRole());

	}

	@Then("other fields such as Student Email id, Program Name, Batch Name, and Status with respective input boxes")
	public void other_fields_such_as_student_email_id_program_name_batch_name_and_status_with_respective_input_boxes() {
		Duration timeout = Duration.ofSeconds(10); // Adjust timeout as needed

	    // Create WebDriverWait object using Duration
	    WebDriverWait wait = new WebDriverWait(m_driver, timeout);
	    AssignStudentPages assignStudentPage = new AssignStudentPages(m_driver);

	    WebElement studentEmailIdInput = wait.until(ExpectedConditions.visibilityOfElementLocated(assignStudentPage.getStudentEmailId()));
	    Assert.assertTrue("Student Email Id input box is not displayed", studentEmailIdInput.isDisplayed());

	    WebElement programNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(assignStudentPage.getProgramName()));
	    Assert.assertTrue("Program Name input box is not displayed", programNameInput.isDisplayed());

	    WebElement batchNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(assignStudentPage.getBatchName()));
	    Assert.assertTrue("Batch Name input box is not displayed", batchNameInput.isDisplayed());

	 
		  
	}

	@Then("Admin should see drop down boxes with valid data for Student Email id, Program Name, and Batch Name")
	public void admin_should_see_drop_down_boxes_with_valid_data_for_student_email_id_program_name_and_batch_name() {
		 Assert.assertTrue("Student Email Id dropdown is not displayed", m_assignStudentPage.isStudentEmailIdDropdownDisplayed());
		    Assert.assertTrue("Program Name dropdown is not displayed", m_assignStudentPage.isProgramNameDropdownDisplayed());
		    Assert.assertTrue("Batch Name dropdown is not displayed", m_assignStudentPage.isBatchNameDropdownDisplayed());

	}

	@Then("Admin should see two radio buttons for Status")
	public void admin_should_see_two_radio_buttons_for_status() {
		if (m_assignStudentPage.isStatusRadioButtonsDisplayed()) {
            System.out.println("Both active and inactive status radio buttons are displayed.");
        } else {
            System.out.println("Both active and inactive status radio buttons are not displayed.");
        }

	}
	
	
	@Given("Admin is in Assign Student details pop up page")
	public void admin_is_in_assign_student_details_pop_up_page() {
		m_assignStudentPage.ClickAssignstudent();
		  m_assignStudentPage.isAssignStudentPopupDisplayed();

		  
	}

	@When("Admin clicks {string} button with entering any data")
	public void admin_clicks_button_with_entering_any_data(String buttonName) {
		if (buttonName.equals("Save")) {
	      m_assignStudentPage.ClickSavebutton();
	   } else {
	   }
	
	}

	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
        Assert.assertTrue("Error message alert is not displayed", m_assignStudentPage.isErrorAlertEmailidDisplayed());

	}

	@When("Admin clicks {string} button without entering Student Email id")
	public void admin_clicks_button_without_entering_student_email_id(String buttonName) {
	      m_assignStudentPage.ClickSavebutton();

	   

	}

	@Then("Admin gets a Error message alert as {string}")
	public void admin_gets_a_error_message_alert_as(String errorMessage) {
		//Assert.assertTrue(m_assignStudentPage.isErrorAlertEmailidDisplayed());
       // Assert.assertEquals(errorMessage, m_assignStudentPage.getErrorMessageText());
	//	Assert.assertEquals("User Email Id is required.", m_assignStudentPage.getErrorMessageText());

	   
	}

	@When("Admin clicks {string} button without selecting program")
	public void admin_clicks_button_without_selecting_program(String string) {
	   // Assert.assertTrue(m_assignStudentPage.isErrorMessageAlertProgramNameDisplayed());

	}

	@When("Admin clicks {string} button without selecting batch")
	public void admin_clicks_button_without_selecting_batch(String string) {
	    //Assert.assertTrue(m_assignStudentPage.isErrorMessageAlertBatchNameDisplayed());

	}

	@When("Admin clicks {string} button without giving status")
	public void admin_clicks_button_without_giving_status(String string) {
		 m_assignStudentPage.ClickSavebutton();
	    //Assert.assertTrue(m_assignStudentPage.isErrorMessageAlertBatchNameDisplayed());

	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Assign Student form")
	public void admin_clicks_cancel_close_x_icon_on_assign_student_form() {
		//m_assignStudentPage.ClickCancel();

	}

	@Then("Assign Student popup window should be closed without saving")
	public void assign_student_popup_window_should_be_closed_without_saving() {
       // Assert.assertFalse(m_assignStudentPage.isAssignStudentPopupDisplayed());

		///WebDriver driver = testContextSetup.driver;
	  //  Assert.assertTrue(m_assignStudentPage.isAssignStudentPopupClosed(driver, m_assignStudentPage.getPopupWindowLocator()));
	}
	

	@When("Enter all the required fields with valid values and click Save button")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets a message {string} alert")
	public void admin_gets_a_message_alert(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks <Cancel> button")
	public void admin_clicks_cancel_button() {
	  //  m_assignStudentPage.ClickCancel();

	}

	@Then("Admin can see the Assign Student popup disappears without assigning")
	public void admin_can_see_the_assign_student_popup_disappears_without_assigning() {
		// WebDriver driver = m_testContextSetup.driver;
		 //   By popupwindowlocator = m_assignStudentPage.getPopupWindowLocator();
		  //  Assert.assertTrue(m_assignStudentPage.isAssignStudentPopupClosed(driver, popupwindowlocator));

	}
	
	
	
	
	
	
	
	
	

}
