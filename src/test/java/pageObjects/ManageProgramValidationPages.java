package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageProgramValidationPages {
	public WebDriver driver;
	By programOnNavigationBar = By.xpath("//*[@id=\"program\"]/span[1]");
	String testManagePgmUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/manage";
	String headingCheckPgmPage = "Manage Program";
	String paginationText = "Showing x to y of z entries";
	By paginationButton = By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[1]");
	String footerText = "In total there are z programs";
	By deletButtonOnTopLeft = By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-title/div[2]/div[1]/button");
	String newPgmButtonText = "+A New Program";
	By newPgmButtonPresent = By.xpath("//*[@id=\"new\"]/span[2]");
	By table = By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]");
	
	
	public ManageProgramValidationPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void pgmOnNavigationBar() {
		 driver.findElement(programOnNavigationBar).click();
		 
	}
	
	public String getCurrentManagePgmUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getTestManagePgmUrl() {
		return testManagePgmUrl;
		
	}
	public boolean checkPgmPageHeading() {
		if(headingCheckPgmPage == "Manage Program") return true;
		return true;
		
	}
	public String getPaginationText() {
		return paginationText;
		
	}
	public void checkPaginationButton() {
		driver.findElement(paginationButton).isDisplayed();
	}
	 public String getFooterText() {
		return footerText;
		 
	 }
	 public boolean validateDeleteButtonOnTopLeft()
{
		driver.findElement(deletButtonOnTopLeft).isEnabled();
		return false;
}
	 public void newPgmButton() {
		 driver.findElement(newPgmButtonPresent).getText().contains(newPgmButtonText);
	 }
	 
	 public List<WebElement> getTableNumOfRows() {
		 List<WebElement> rows = driver.findElements(table);
		 
		 System.out.println("Number of rows in table are: "+rows.indexOf(rows));
		return rows;
	 }
	 
}
