package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.TestBase;
import utilities.TestContextSetup;

public class LoginPages {
    private WebDriver driver;
    TestBase testbase;
    TestContextSetup testContextSetup;

    public LoginPages(WebDriver driver)  {
        this.driver = driver;
      // this.testContextSetup=testContextSetup;
     //   this.testbase=new TestBase();
    }

    public void logindetails(String username, String password) {
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys(password);
    }
    
    public void clickloginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
        loginButton.click();
    }
}
