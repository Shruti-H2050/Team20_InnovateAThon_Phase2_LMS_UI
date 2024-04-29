package pageObjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePages {
	private WebDriver driver;

	private By usernameField = By.xpath("//input[@id='username']");

	private By passwordField = By.xpath("//input[@id='password']");
	// passwordField.sendKeys(password);
	private By loginButton = By.xpath("//span[@class='mat-button-wrapper' and text()='Login']");
	public By lMSlogoimage = By.xpath("//img[contains(@src, 'LMS-logo.jpg')]");
	public By signcontent = By.xpath("//p[contains(text(),'Please login to LMS application')]");
	public By usertextfield = By.xpath("//input[@id='username']");
	public By passwordtextfield = By.xpath("//input[@id='password']");
	public By Manageprogheader = By.xpath("//div[contains(@class, 'box') and contains(text(), 'Manage Program')]");
	By lmsheader = By.xpath("//div[@class='image-container']");
	private By asteriskElementuser = By.xpath(
			"//span[@class='mat-placeholder-required mat-form-field-required-marker ng-tns-c78-0 ng-star-inserted']");
	private By asteriskElementpwd = By.xpath(
			"//span[@class='mat-placeholder-required mat-form-field-required-marker ng-tns-c78-1 ng-star-inserted']");
	By loginalign = By.xpath("//mat-card[@class='mat-card mat-focus-indicator']");

	public HomePagePages(WebDriver driver) {
		this.driver = driver;
	}

	public void setLoginDetails(String username, String password) {
		WebElement usernameElement = driver.findElement(usernameField);

		usernameElement.sendKeys(username);
		System.out.println("+++++Username" + username);

		WebElement passwordElement = driver.findElement(passwordField);
		passwordElement.sendKeys(password);
		System.out.println("+++++Password: " + password);
	}

	public void clickloginButton() {
		 try {
		        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        //WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		        WebElement login = driver.findElement(loginButton);
		        System.out.println("Clicking on the login element in the main page");
		        login.click();
			    //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		        //loginButtonElement.click();
		        System.out.println("++++++++Clicked on login button");
		    } catch (Exception e) {
		        System.err.println("Failed to click login button: " + e.getMessage());
		        e.printStackTrace();
		    }
	}
	// Inside the HomePagePages class
	public boolean isDashboardPageDisplayed() {
	    
	    return driver.findElement(Manageprogheader).isDisplayed();
	}


	public int verifyuRL(String url) {
		int responseCode = -1;
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

	public boolean isLMSHeaderDisplayed() {
		WebElement element = driver.findElement(lmsheader);
		return element.isDisplayed();
	}

	public String getLMSHeaderText() {
		WebElement element = driver.findElement(lmsheader);
		return element.getText();
	}


	public String user_text_color() {
		WebElement usernameElement = driver.findElement(usernameField);
		String colorValue = usernameElement.getCssValue("color");
		return colorValue;
	}

	public Point getLocation() {
		WebElement button = driver.findElement(loginButton);
		Point buttonLocation = button.getLocation();
		System.out.println("Button Location: X = " + buttonLocation.getX() + ", Y = " + buttonLocation.getY());
		return buttonLocation;
	}

	public boolean isErrorMessageDisplayed(List<String> expectedErrorMessages) {
		for (String expectedErrorMessage : expectedErrorMessages) {
			By errorMessageLocator = By.xpath("//mat-error[contains(text(), '" + expectedErrorMessage + "')]");
			if (driver.findElements(errorMessageLocator).size() > 0) {
				return true;
			}
		}
		return false;
	}

}
