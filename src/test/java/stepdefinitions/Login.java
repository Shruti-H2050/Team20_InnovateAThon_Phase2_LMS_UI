package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPages;
import utilities.TestBase;
import utilities.TestContextSetup;

public class Login {
    private Hooks hooks;
    public static WebDriver driver;
    private LoginPages loginPage;
    public TestBase testBase;
    TestContextSetup testContextSetup;

    
   /* public Login(Hooks hooks,TestBase testBase) {
        this.hooks = hooks;
        this.driver = hooks.getDriver();
        this.loginPage = new LoginPages(driver);
        this.testBase = testBase;

    }*/
    
    public Login(TestContextSetup testContextSetup) {
    	this.testContextSetup = testContextSetup;
    	this.loginPage = new LoginPages(driver);
    	this.loginPage=testContextSetup.pageObjectManager.getlogin();
    	this.testBase=testContextSetup.testBase;
    }

    @Given("Admin is in Home Page")
    public void admin_is_in_home_page() throws IOException {
    	testContextSetup.testBase.WebDriverManager();
    	
    	// String url = testBase.getUrl();
         //driver.get(url);
    }

    @When("Admin enter valid credentials username and password and clicks login button")
    public void admin_enter_valid_credentials_username_and_password_and_clicks_login_button() {
        //loginPage.logindetails(testContextSetup.testBase.getUsername(), testContextSetup.testBase.getPassword());
    	 String username = testBase.getUsername();
         String password = testBase.getPassword();
         loginPage.logindetails(username, password);
         loginPage.clickloginButton();
    }

    @Then("Admin should land on dashboard page")
    public void admin_should_land_on_dashboard_page() {
       System.out.println("+++++Admin should land on dashboard page");
    }
}