package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewProgramPages {
	
	public WebDriver driver;
	
	By managePgmTitle = By.xpath("//*[contains(text(),'Manage Program')]");
	
	
	
	public AddNewProgramPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getManagePgmDashboard() {
		return driver.findElement(managePgmTitle);
	}

}
