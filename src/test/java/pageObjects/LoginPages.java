package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPages {
    private WebDriver driver;

    public LoginPages(WebDriver driver)  {
        this.driver = driver;
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
