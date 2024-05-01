package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewProgramDetailsPages;
import pageObjects.LoginPages;
import pageObjects.SortingValidationPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class SortingValidation {

	public static WebDriver driver;
	public TestBase testBase;
    TestContextSetup testContextSetup;
    LoginPages loginPage;
    SortingValidationPages sortingValidation;
    
    public SortingValidation(TestContextSetup testContextSetup) {
    	this.testContextSetup = testContextSetup;
    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
    	this.testBase=testContextSetup.testBase;
    	this.sortingValidation = new SortingValidationPages(driver);
    	this.sortingValidation = testContextSetup.pageObjectManager.sortingValidation();
    }
	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		sortingValidation.managePgmPage();
	}

	@When("Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
		sortingValidation.clickPgmNameSortIcon();
		sortingValidation.sortedAscendingOrder();
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
		//System.out.println(sortingValidation.originalList);
		//System.out.println(sortingValidation.sortedList);
		//sortingValidation.sortedAscendingOrder();
		//sortingValidation.sortedList;
		Assert.assertEquals(sortingValidation.originalList, sortingValidation.sortedList);
	//	Assert.assertTrue(sortingValidation.originalList.equals(sortingValidation.sortedList));
	}

	@Given("The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
	   
	}

	@Then("The data get sorted on the table based on the program name column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {
	   
	}

	@When("Admin clicks the sort icon of program Desc column")
	public void admin_clicks_the_sort_icon_of_program_desc_column() {
	   
	}

	@Then("The data get sorted on the table based on the program description column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
	   
	}

	@Given("The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
	   
	}

	@Then("The data get sorted on the table based on the program description column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
	   
	}

	@When("Admin clicks the sort icon of program Status column")
	public void admin_clicks_the_sort_icon_of_program_status_column() {
	   
	}

	@Then("The data get sorted on the table based on the program status column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {
	   
	}

	@Given("The data is in the ascending order on the table based on Program Status column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
	   
	}

	@Then("The data get sorted on the table based on the program status column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
	   
	}



}
