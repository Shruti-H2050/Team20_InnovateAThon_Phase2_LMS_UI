package stepdefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPages;

public class Login {
    private Hooks hooks;
    private WebDriver driver;
    private LoginPages loginPage;
    
    public Login(Hooks hooks) {
        this.hooks = hooks;
        this.driver = hooks.getDriver();
        this.loginPage = new LoginPages(driver);
    }

    @Given("Admin is in Home Page")
    public void admin_is_in_home_page() {
        driver.get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/");
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
