package stepdefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPages;
import utilities.TestBase;

public class Login {
    private Hooks hooks;
    private WebDriver driver;
    private LoginPages loginPage;
    private TestBase testBase;

    
    public Login(Hooks hooks,TestBase testBase) {
        this.hooks = hooks;
        this.driver = hooks.getDriver();
        this.loginPage = new LoginPages(driver);
        this.testBase = testBase;

    }

    @Given("Admin is in Home Page")
    public void admin_is_in_home_page() {
    	 String url = testBase.getUrl();
         driver.get(url);
    }

    @When("Admin enter valid credentials username as {string} and password {string} and clicks login button")
    public void admin_enter_valid_credentials_username_as_and_password_and_clicks_login_button(String username, String password) {
        loginPage.logindetails(username, password);
        loginPage.clickloginButton();
    }

    @Then("Admin should land on dashboard page")
    public void admin_should_land_on_dashboard_page() {
       System.out.println("+++++Admin should land on dashboard page");
    }
}
