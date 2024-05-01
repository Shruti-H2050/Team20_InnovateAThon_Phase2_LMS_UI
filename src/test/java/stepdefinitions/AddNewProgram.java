package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewProgramPages;
import pageObjects.HomePagePages;
//import pageObjects.LoginPages;
import pageObjects.ManageProgramValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class AddNewProgram {
	
	HomePagePages m_homepage;
	AddNewProgramPages addNewProgram;
	ManageProgramValidationPages manageProgram;
	private TestContextSetup m_testContextSetup;
	private final WebDriver m_driver;
	private final TestBase testbase;
	private String url;

	public AddNewProgram(TestContextSetup testContextSetup) throws IOException {
		m_testContextSetup = testContextSetup;

		m_driver = testContextSetup.driver;
		this.testbase = testContextSetup.testBase;

		m_homepage = testContextSetup.pageObjectManager.gethomepage();
		// this.testContextSetup = testContextSetup;
		addNewProgram = testContextSetup.pageObjectManager.addNewProgram();
		manageProgram = testContextSetup.pageObjectManager.manageProgram();
	}

	@Given("Admin is on dashboard page after Login and clicks Program on the navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_clicks_program_on_the_navigation_bar() throws IOException {
		// testContextSetup.testBase.WebDriverManager();
		url = testbase.getUrl();

		String username = testbase.getUsername();
		String password = testbase.getPassword();
		m_homepage.setLoginDetails(username, password);
		m_homepage.clickloginButton();

		// m_homepage.logindetails(username, password);
		// m_homepage.clickloginButton();
		addNewProgram.pgmOnNavigationBar();
		// loginPage.logindetails(testBase.getUsername(), testBase.getPassword());
		// loginPage.clickloginButton();
	}

	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() {
		Assert.assertTrue(addNewProgram.getTitle().contains("LMS"));

	}

	@When("Admin clicks <A New Program>button")
	public void admin_clicks_a_new_program_button() {
		addNewProgram.clickNewPgmButton();
	}

	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
		Assert.assertTrue(addNewProgram.pgmDetailsPopUp());
	}

	@Then("Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
		Assert.assertTrue(addNewProgram.checkPopUpFieldTexTBox());
	}

	@Then("Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() {
		Assert.assertTrue(addNewProgram.radioBtnCheck());
	}
}