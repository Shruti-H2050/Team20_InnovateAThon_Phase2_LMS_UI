package pageObjects;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePages {
    private WebDriver driver;

    private  By usernameField = By.xpath("//input[@id='username']");

    private   By passwordField = By.xpath("//input[@id='password']");
    //passwordField.sendKeys(password);
    private By loginButton = By.xpath("//button[@id='login']");
    public By lMSlogoimage = By.xpath("//img[contains(@src, 'LMS-logo.jpg')]");
    public By signcontent = By.xpath("//p[contains(text(),'Please login to LMS application')]");
    public By usertextfield = By.xpath("//input[@id='username']");
    public By passwordtextfield = By.xpath("//input[@id='password']");

    private By asteriskElementuser = By.xpath("//span[@class='mat-placeholder-required mat-form-field-required-marker ng-tns-c78-0 ng-star-inserted']");
    private By asteriskElementpwd = By.xpath("//span[@class='mat-placeholder-required mat-form-field-required-marker ng-tns-c78-1 ng-star-inserted']");


    public HomePagePages(WebDriver driver)  {
        this.driver = driver;
       
    }

    public void logindetails(String username, String password) {
        //WebElement usernameField = driver.findElement(By.xpath(USERNAME_FIELD_XPATH));
        WebElement usernameElement  = driver.findElement(usernameField);

        usernameElement .sendKeys(username);
        System.out.println("+++++Username"+username);

        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
        System.out.println("+++++Password: " + password);
    }

    public void clickloginButton() {
    	 driver.findElement(loginButton).click();
    
    }
    public int  verifyuRL(String url) {
        int responseCode=-1; // Default value if unable to get response code

        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(2000); 
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
        return responseCode;

    }
   
    public boolean isFirstTextFieldContains(String text) {
        WebElement textField = driver.findElement(usernameField);
        String fieldValue = textField.getAttribute("value");
        return fieldValue.equals(text);
    }
    public boolean isAsteriskuserDisplayed() {
        return driver.findElement(asteriskElementuser).isDisplayed();
    }
    public boolean isSecondTextFieldContains(String text) {
        WebElement textField = driver.findElement(passwordtextfield);
        String fieldValue = textField.getAttribute("value");
        return fieldValue.equals(text);
    }
    public boolean isAsteriskpwdDisplayed() {
        return driver.findElement(asteriskElementpwd).isDisplayed();
    }
}
