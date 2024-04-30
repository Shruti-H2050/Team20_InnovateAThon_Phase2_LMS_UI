package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import pageObjects.HomePagePages;

//import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TestBase;
import utilities.TestContextSetup;

public class HomePageVerification {
	private final HomePagePages m_homepage;
	private final TestBase testbase;
	private final WebDriver driver;
	private String url;
	private String invalidUrl;

	public HomePageVerification(TestContextSetup testContextSetup) throws IOException {
		this.driver = testContextSetup.driver;
		m_homepage = testContextSetup.pageObjectManager.gethomepage();
		testbase = testContextSetup.testBase;
	}

	@Given("Admin is in Home Page")
	public void admin_is_in_home_page() throws IOException {
		url = testbase.getUrl();
	}

	@When("Admin enter valid credentials username and password and clicks login button")
	public void admin_enter_valid_credentials_username_and_password_and_clicks_login_button() {

		String username = testbase.getUsername();
		String password = testbase.getPassword();
		m_homepage.setLoginDetails(username, password);

		m_homepage.clickloginButton();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		Assert.assertTrue("Dashboard page is not displayed", m_homepage.isDashboardPageDisplayed());

	}

	@Given("Admin launch the browser")
	public void admin_launch_the_browser() throws IOException {

	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {

	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {

		Assert.assertTrue("Profile icon is not displayed on the home page",
				driver.findElement(m_homepage.lMSlogoimage).isDisplayed());

	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
		invalidUrl = "//lms-frontend-api-hackathon-apr-326235f3973d.com";

	}

	@Then("Admin should recieve {int} page not found error")
	public void admin_should_recieve_page_not_found_error(Integer int1) {
		m_homepage.verifyuRL(invalidUrl);
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer expectedResponseCode) {
		int actualResponseCode = m_homepage.verifyuRL(url);
		Assert.assertTrue("HTTP response code is not >= " + expectedResponseCode,
				actualResponseCode >= expectedResponseCode || actualResponseCode == -1);
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		String expectedUsername = "sdetorganizers@gmail.com";
		String expectedPassword = "UIHackathon@02";
		String actualUsername = testbase.getUsername().trim();
		String actualPassword = testbase.getPassword().trim();

		Assert.assertEquals("Incorrect username", expectedUsername, actualUsername);
		Assert.assertEquals("Incorrect password", expectedPassword, actualPassword);
	}

	@Then("Admin should see logo on the left  side")
	public void admin_should_see_logo_on_the_left_side() {
		Assert.assertTrue("Logo is not displayed on the left side",
				driver.findElement(m_homepage.lMSlogoimage).isDisplayed());

	}

	@Then("Admin should see {string}")
	public void admin_should_see(String expectedText) {

		Assert.assertTrue("Expected text not found: " + expectedText,
				driver.findElement(m_homepage.signcontent).isDisplayed());

	}

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
		Assert.assertTrue("First text field is not displayed",
				driver.findElement(m_homepage.usertextfield).isDisplayed());
		Assert.assertTrue("Second text field is not displayed",
				driver.findElement(m_homepage.passwordtextfield).isDisplayed());

	}

	@Then("Admin should {string} in the first text field")
	public void admin_should_in_the_first_text_field(String text) {
		boolean isFirstTextFieldContainsText = m_homepage.isFirstTextFieldContains(text);
	}

	@Then("Admin should see * symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text() {
		Assert.assertTrue("Asterisk symbol is not displayed next to the user text field",
				m_homepage.isAsteriskuserDisplayed());

	}

	@Then("Admin should {string} in the second text field")
	public void admin_should_in_the_second_text_field(String text) {
		boolean isFirstTextFieldContainsText = m_homepage.isSecondTextFieldContains(text);
	}

	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
		Assert.assertTrue("Asterisk symbol is not displayed next to the user text field",
				m_homepage.isAsteriskpwdDisplayed());

	}

	@Then("Admin should see  LMS - Learning Management System")
	public void admin_should_see_lms_learning_management_system() {
		assertTrue(m_homepage.isLMSHeaderDisplayed());

	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
		Point buttonLocation = m_homepage.getLocation();
		int windowCenterX = driver.manage().window().getSize().getWidth() / 2;
		int windowCenterY = driver.manage().window().getSize().getHeight() / 2;

		int buttonX = buttonLocation.getX();
		int buttonY = buttonLocation.getY();

		int tolerance = 150;
		boolean isCentered = Math.abs(buttonX - windowCenterX) <= tolerance
				&& Math.abs(buttonY - windowCenterY) <= tolerance;

		Assert.assertTrue("Login button is not at the center of the page", isCentered);
	}

	@Given("Admin is on the Login Page")
	public void admin_is_on_the_login_page() throws IOException {
		testbase.WebDriverManager();
		url = testbase.getUrl();
	}

	@When("Admin enters invalid credentials with username {string} and password {string} and clicks the login button")
	public void admin_enters_invalid_credentials_with_username_and_password_and_clicks_the_login_button(
			String enterd_username, String enterd_password) {
		m_homepage.setLoginDetails(enterd_username, enterd_password);

	}

	@Then("an error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String expectedErrorMessage) {
		m_homepage.clickloginButton();
		List<String> expectedErrorMessages = Arrays.asList(expectedErrorMessage.split(";"));
		assertTrue(m_homepage.isErrorMessageDisplayed(expectedErrorMessages),
				"Error message not displayed as expected");

	}

	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
		String usercolor = m_homepage.user_text_color();
		System.out.println("+++UserColour" + usercolor);
		Assert.assertTrue(usercolor.contains("rgba(0, 0, 0, 0.87)"));

	}
}
