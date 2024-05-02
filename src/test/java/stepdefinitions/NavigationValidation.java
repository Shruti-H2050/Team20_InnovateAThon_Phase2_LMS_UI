package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagePages;
import pageObjects.LoginPages;
import pageObjects.NavigationValidationPages;
import pageObjects.SortingValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class NavigationValidation {

	private TestContextSetup m_testContextSetup;
	private final WebDriver m_driver;
	private final TestBase testbase;
	private String url;
	HomePagePages m_homepage;
    NavigationValidationPages navigationValidation;
    
   public NavigationValidation( TestContextSetup testContextSetup) {
	   m_testContextSetup = testContextSetup;
	   m_driver = testContextSetup.driver;
   	this.testbase=testContextSetup.testBase;
   	navigationValidation = testContextSetup.pageObjectManager.navigationValidation();
   }
   
   @When("Admin clicks on Batch link on Manage Program page")
   public void admin_clicks_on_batch_link_on_manage_program_page() {
	   navigationValidation.clickBatchButton();
   }

   @Then("Admin is re-directed to Batch page")
   public void admin_is_re_directed_to_batch_page() {
	   navigationValidation.navigateToBatchPage();
   }

   @When("Admin clicks on User link on Manage Program page")
   public void admin_clicks_on_user_link_on_manage_program_page() {
	   navigationValidation.clickUserButton();
   }

   @Then("Admin is re-directed to User page")
   public void admin_is_re_directed_to_user_page() {
	   navigationValidation.navigateToUserPage();
   }

   @When("Admin clicks on Logout link on Manage Program page")
   public void admin_clicks_on_logout_link_on_manage_program_page() {
	   navigationValidation.clickLogout();
   }

   @Then("Admin is re-directed to Login page")
   public void admin_is_re_directed_to_login_page() {
	   navigationValidation.navigateToLoginPage();
   }



}
