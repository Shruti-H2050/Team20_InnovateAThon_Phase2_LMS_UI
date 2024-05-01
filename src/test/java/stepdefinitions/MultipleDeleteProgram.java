package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DeleteProgramPages;
import pageObjects.LoginPages;
import pageObjects.MultipleDeleteProgramPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class MultipleDeleteProgram {

	public static WebDriver driver;
    public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    MultipleDeleteProgramPages multipleDeleteProgram;
	
   public MultipleDeleteProgram(TestContextSetup testContextSetup) {
	   this.testContextSetup = testContextSetup;
   	this.testBase=testContextSetup.testBase;
   	this.multipleDeleteProgram = new MultipleDeleteProgramPages(driver);
   	this.loginPage=testContextSetup.pageObjectManager.getlogin();
   	this.multipleDeleteProgram = testContextSetup.pageObjectManager.multipleDeleteProgram();
	   
   }
	
	@Given("Admin is in Manage Program page")
	public void admin_is_in_manage_program_page() {
		multipleDeleteProgram.onManagePgmPage();
	}

	@When("Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
		multipleDeleteProgram.clickCheckbox();
	}

	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
		multipleDeleteProgram.deleteBtnEnabled();
	}
	
	//**********Multiple Delete Feature1 Step Definition starts here******
	@When("Admin clicks delete button under header after selecting the check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
		multipleDeleteProgram.clickCheckboxInTableBody();
		//multipleDeleteProgram.clickDeleteBtn();
	}

	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
		
	}

	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
	   
	}




}
