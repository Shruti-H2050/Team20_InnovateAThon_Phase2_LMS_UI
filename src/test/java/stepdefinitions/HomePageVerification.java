package stepdefinitions;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.HomePagePages;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TestBase;

public class HomePageVerification extends TestBase   {
    private Hooks hooks;
    private WebDriver driver;
    private HomePagePages homepage;
    private String invalidUrl;
    private String url;
    
    public HomePageVerification(Hooks hooks1) {
        hooks = hooks1;
        driver = hooks.getDriver();
        homepage = new HomePagePages(driver);
        

    }

	@Given("Admin is in Home Page")
    public void admin_is_in_home_page() throws IOException {
		   driver =	WebDriverManager();
		    url=getUrl();
    	
    }


@When("Admin enter valid credentials username and password and clicks login button")
public void admin_enter_valid_credentials_username_and_password_and_clicks_login_button() {

	  String username = getUsername();
      String password = getPassword();
      homepage.logindetails(username, password);
     

      homepage.clickloginButton();
    }

    @Then("Admin should land on dashboard page")
    public void admin_should_land_on_dashboard_page() {
       System.out.println("+++++Admin should land on dashboard page");
    }
    @Given("Admin launch the browser")
    public void admin_launch_the_browser() throws IOException {
    	   driver =	WebDriverManager();
    	
    }

    @When("Admin gives the correct LMS portal URL")
    public void admin_gives_the_correct_lms_portal_url() {
        
    }

    @Then("Admin should land on the home page")
    public void admin_should_land_on_the_home_page() {
       
    	Assert.assertTrue("Profile icon is not displayed on the home page", driver.findElement(homepage.lMSlogoimage).isDisplayed());

    }
    @When("Admin gives the invalid LMS portal URL")
    public void admin_gives_the_invalid_lms_portal_url() {
    	 invalidUrl = "//lms-frontend-api-hackathon-apr-326235f3973d.com";
    	
     
    }

    @Then("Admin should recieve {int} page not found error")
    public void admin_should_recieve_page_not_found_error(Integer int1) {
    	homepage.verifyuRL(invalidUrl);
    }

@Then("HTTP response >= {int}. Then the link is broken")
public void http_response_then_the_link_is_broken(Integer expectedResponseCode) {
	   int actualResponseCode = homepage.verifyuRL(url);
	    Assert.assertTrue("HTTP response code is not >= " + expectedResponseCode, actualResponseCode >= expectedResponseCode || actualResponseCode == -1);
}
@Then("Admin should see correct spellings in all fields")
public void admin_should_see_correct_spellings_in_all_fields() {
	 String expectedUsername = "sdetorganizers@gmail.com";
	    String expectedPassword = "UIHackathon@02";
	    String actualUsername = getUsername().trim();
	    String actualPassword = getPassword().trim();

	    Assert.assertEquals("Incorrect username", expectedUsername, actualUsername);
	    Assert.assertEquals("Incorrect password", expectedPassword, actualPassword);
	}
    
@Then("Admin should see logo on the left  side")
public void admin_should_see_logo_on_the_left_side() {
	Assert.assertTrue("Logo is not displayed on the left side", driver.findElement(homepage.lMSlogoimage).isDisplayed());

}
@Then("Admin should see {string}")
public void admin_should_see(String expectedText) {
	      
    Assert.assertTrue("Expected text not found: " + expectedText, driver.findElement(homepage.signcontent).isDisplayed());
	
}
@Then("Admin should see two text field")
public void admin_should_see_two_text_field() {
	Assert.assertTrue("First text field is not displayed", driver.findElement(homepage.usertextfield).isDisplayed());
    Assert.assertTrue("Second text field is not displayed", driver.findElement(homepage.passwordtextfield).isDisplayed());
   
}

@Then("Admin should {string} in the first text field")
public void admin_should_in_the_first_text_field(String text) {
    boolean isFirstTextFieldContainsText = homepage.isFirstTextFieldContains(text);

}
@Then("Admin should see * symbol next to user text")
public void admin_should_see_symbol_next_to_user_text() {
    Assert.assertTrue("Asterisk symbol is not displayed next to the user text field", homepage.isAsteriskuserDisplayed());

}

@Then("Admin should {string} in the second text field")
public void admin_should_in_the_second_text_field(String text) {
    boolean isFirstTextFieldContainsText = homepage.isSecondTextFieldContains(text);

}

@Then("Admin should see * symbol next to password text")
public void admin_should_see_symbol_next_to_password_text() {
    Assert.assertTrue("Asterisk symbol is not displayed next to the user text field", homepage.isAsteriskpwdDisplayed());

}

}







