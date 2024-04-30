package stepdefinitions;

import java.io.IOException;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPages;
import pageObjects.HomePagePages;
import utilities.TestBase;
import utilities.TestContextSetup;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Dashboard {
	private DashboardPages m_dashboardpage;
	private HomePagePages m_homepage;
	private final TestBase testbase;
	private final WebDriver driver;

	private String url;

	public Dashboard(TestContextSetup testContextSetup) throws IOException {
		this.driver = testContextSetup.driver;
		m_homepage = testContextSetup.pageObjectManager.gethomepage();

		m_dashboardpage = testContextSetup.pageObjectManager.getdashboard();
		testbase = testContextSetup.testBase;
	}

	@When("Admin enters valid credentials and clicks login button")
	public void admin_enters_valid_credentials_and_clicks_login_button() {
		url = testbase.getUrl();

		String username = testbase.getUsername();
		String password = testbase.getPassword();
		m_homepage.setLoginDetails(username, password);

		m_homepage.clickloginButton();
	}

	@Then("Admin should see {string} as header")
	public void admin_should_see_as_header(String expectedHeaderText) {
		String actualHeaderText = m_dashboardpage.headerverification();
		Assert.assertEquals("Header text does not match the expected text", expectedHeaderText, actualHeaderText);
		System.out.println("Header text matches: " + expectedHeaderText);
	}

	@Then("Maximum navigation time in milliseconds defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer seconds) {
		Duration timeout = Duration.ofSeconds(seconds);
		driver.manage().timeouts().pageLoadTimeout(timeout);
		Duration maxNavigationTime = Duration.ofSeconds(30);
		Assert.assertEquals("Maximum navigation time is not set correctly", timeout, maxNavigationTime);
	}

	@Then("Admin should see {string} as title")
	public void admin_should_see_as_title(String title) {
		String pageTitle = m_dashboardpage.getTitle();

		Assert.assertEquals("Page title is not displayed correctly", title, pageTitle);

	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		Point titleLocation = m_dashboardpage.getTitleLocation();
		Assert.assertTrue("LMS title is not positioned correctly",
				titleLocation.getX() < 100 && titleLocation.getY() < 100);

	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		String navigationText = m_dashboardpage.navigationbarspelltest();
		String expectedText = "LMS - Learning Management System | Program | Batch | User | Logout";
		navigationText = navigationText.replace("\n", " | ");
		Assert.assertEquals("Navigation bar text does not match expected spelling", expectedText, navigationText);

	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		String titleText = m_dashboardpage.Titlespelltest();
		Assert.assertEquals("LMS title has incorrect spelling or space", "LMS - Learning Management System", titleText);
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		Point navigationBarLocation = m_dashboardpage.getNavigationbarLocation();

		int minX = 500;
		int maxY = 100;
		Assert.assertTrue("Navigation bar text is not positioned correctly",
				navigationBarLocation.getX() > minX && navigationBarLocation.getY() < maxY);
	}

	@Then("Admin should see {string} in the 1st place")
	public void admin_should_see_in_the_1st_place(String expectedItem) {
		String navigationItem = m_dashboardpage.getFirstNavigationBarItemsLocation();
		Assert.assertNotNull("Navigation bar item is null", navigationItem);
		Assert.assertEquals("First navigation bar item is not as expected", expectedItem, navigationItem);
	}

	@Then("Admin should see {string} in the 2nd place")
	public void admin_should_see_in_the_2nd_place(String expectedItem) {
		String navigationItemsbatch = m_dashboardpage.getSecondNavigationBarItemsLocation();
		Assert.assertNotNull("Navigation bar item is null", navigationItemsbatch);
		Assert.assertEquals("First navigation bar item is not as expected", expectedItem, navigationItemsbatch);
	}

	@Then("Admin should see {string} in the 3rd place")
	public void admin_should_see_in_the_3rd_place(String expectedItem) {
		String navigationItemsuser = m_dashboardpage.getthirdNavigationBarItemsLocation();
		Assert.assertNotNull("Navigation bar item is null", navigationItemsuser);
		Assert.assertEquals("First navigation bar item is not as expected", expectedItem, navigationItemsuser);
	}

	@Then("Admin should see {string} in the 4th place")
	public void admin_should_see_in_the_4th_place(String expectedItem) {
		String navigationItemsuser = m_dashboardpage.getfourthNavigationBarItemsLocation();
		Assert.assertNotNull("Navigation bar item is null", navigationItemsuser);
		Assert.assertEquals("First navigation bar item is not as expected", expectedItem, navigationItemsuser);
	}

}
