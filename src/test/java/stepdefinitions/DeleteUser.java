package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteUserPages;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;




public class DeleteUser{
	
	public static WebDriver driver;
    public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    DeleteUserPages DeleteUserPages;
	
   public DeleteUser(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
   	this.testBase=testContextSetup.testBase;
   	this.DeleteUserPages = new DeleteUserPages(driver);
   	this.loginPage=testContextSetup.pageObjectManager.getlogin();
   	
	   
   }


@Given("Admin is on Manage user page")
public void admin_is_on_manage_user_page() {
    // Write code here that turns the phrase above into concrete actions
	
	
	DeleteUserPages.clickdeleteuserbutton();
	DeleteUserPages.onManageuserPage();
	 	 
	
}

@When("Admin clicks the delete icon")
public void admin_clicks_the_delete_icon() {
    // Write code here that turns the phrase above into concrete actions
	DeleteUserPages.deleteBtnEnabled();
	DeleteUserPages.clickCheckbox();
	DeleteUserPages.clickDeleteBtn();
}

@Then("Admin should see an alert pop-up with heading")
public void admin_should_see_an_alert_pop_up_with_heading() {
    // Write code here that turns the phrase above into concrete actions
    DeleteUserPages.clickonpopup();
}

@When("Admin clicks yes option")
public void admin_clicks_yes_option() {
    // Write code here that turns the phrase above into concrete actions
  DeleteUserPages.clickonyes();
}

@Then("Admin gets a message {string} alert and do not see that user in the data table")
public void admin_gets_a_message_alert_and_do_not_see_that_user_in_the_data_table(String string) {
    // Write code here that turns the phrase above into concrete actions
    DeleteUserPages.getsuccesstext();
}

@When("Admin clicks No option")
public void admin_clicks_no_option() {
    // Write code here that turns the phrase above into concrete actions
	DeleteUserPages.clickonno();
}

@When("Admin clicks on close button")
public void admin_clicks_on_close_button() {
    // Write code here that turns the phrase above into concrete actions
    
	DeleteUserPages.clickonclose();
}


}