package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationValidationPages {

public WebDriver driver;
By batchButton = By.xpath("//button[@id='batch']");
String batchPageUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/batch";
By userButton = By.xpath("//button[@id='user']"); 
String userPageUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
By logout = By.xpath("//button[@id='logout']");
String loginUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/login";
	
	public NavigationValidationPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBatchButton() {
		driver.findElement(batchButton).click();
	}
	
	public void navigateToBatchPage() {
		driver.navigate().to(batchPageUrl);
	}
	
	public void clickUserButton() {
		driver.findElement(userButton).click();
	}
	public void navigateToUserPage() {
		driver.navigate().to(userPageUrl);
	}
	
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	public void navigateToLoginPage() {
		driver.navigate().to(loginUrl);
	}
}
