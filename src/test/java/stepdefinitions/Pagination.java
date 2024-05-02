package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagePages;
import pageObjects.LoginPages;
import pageObjects.PaginationPages;
import pageObjects.SortingValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class Pagination {

	private TestContextSetup m_testContextSetup;
	private final WebDriver m_driver;
	private final TestBase testbase;
	private String url;
	HomePagePages m_homepage;
   PaginationPages pagination;
   
   
   public Pagination(TestContextSetup testContextSetup) {
	   m_testContextSetup = testContextSetup;
	   m_driver = testContextSetup.driver;
   	this.testbase=testContextSetup.testBase;
   	pagination = testContextSetup.pageObjectManager.pagination();
   }
   
   @Given("Admin is on Manage Program Page after logged in")
   public void admin_is_on_manage_program_page_after_logged_in() {
       
   }

   @When("Admin clicks Next page link on the program table")
   public void admin_clicks_next_page_link_on_the_program_table() {
       
   }

   @Then("Admin should see the Pagination has {string} active link")
   public void admin_should_see_the_pagination_has_active_link(String string) {
       
   }

   @When("Admin clicks Last page link")
   public void admin_clicks_last_page_link() {
       
   }

   @Then("Admin should see the last page record on the table with Next page link are disabled")
   public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
       
   }

   @Given("Admin is on last page of Program table")
   public void admin_is_on_last_page_of_program_table() {
       
   }

   @When("Admin clicks First page link")
   public void admin_clicks_first_page_link() {
       
   }

   @Then("Admin should see the previous page record on the table with pagination has previous page link")
   public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
       
   }

   @Given("Admin is on Previous Program page")
   public void admin_is_on_previous_program_page() {
       
   }

   @When("Admin clicks Start page link")
   public void admin_clicks_start_page_link() {
       
   }

   @Then("Admin should see the very first page record on the table with Previous page link are disabled")
   public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
       
   }



}
