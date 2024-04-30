package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProgramPages {

	public WebDriver driver;
	
	By deleteButton = By.xpath("//button[@id='deleteProgram']");
	By deleteAlertPopUpCheck = By.xpath("//*[@class='ng-trigger ng-trigger-animation ng-tns-c133-4 p-dialog p-confirm-dialog p-component ng-star-inserted']");
	By deleteAlertPopUpHeadingCheck = By.xpath("//*[contains(text(),'Confirm')]");
	By deleteAlertPopUpYes = By.xpath("//*[contains(text(),'Yes')]");
	By deleteAlertPopUpNo = By.xpath("//*[contains(text(),'No')]");
	By deleteMsgCheck = By.xpath("//*[contains(text(),'Are you sure you want to delete')]");
	By pgmDeletedMsg = By.xpath("//*[contains(text(),'Program Deleted')]");
	By deletePopUpCloseIcon = By.xpath("//*[@class='p-dialog-header-icons ng-tns-c133-4']");
	By searchTextbox = By.xpath("//input[@placeholder='Search...']");
	By searchSuccess = By.xpath("//td[contains(text(),'First33')]");
	By clcikNoOnDeletePopUP = By.xpath("//p-confirmdialog/div");
	By onManagePgmPage = By.xpath("//p-dialog[@header='Program Details']");
	
	public DeleteProgramPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickDeleteBtn() {
		driver.findElement(deleteButton).click();;
	}
	
	public void deleteAlertPopUpCheck() {
		driver.findElement(deleteAlertPopUpCheck).isDisplayed();
	}
	
	public void deleteAlertPopUpValidate() {
		driver.findElement(deleteAlertPopUpHeadingCheck).isDisplayed();
		driver.findElement(deleteAlertPopUpYes).isDisplayed();
		driver.findElement(deleteAlertPopUpNo).isDisplayed();
		
	}
	
	public void deleteMsgCheck() {
		driver.findElement(deleteMsgCheck).isDisplayed();
	}
	
	public void clickDeleteAlertPopUpYes() {
		driver.findElement(deleteAlertPopUpYes).click();
	}
	
	public void clickdeleteAlertPopUpNo() {
		driver.findElement(deleteAlertPopUpNo).click();
	}
	public boolean pgmDeleted() {
		
			//Alert alert = driver.switchTo().alert();
			//String text = alert.getText();
			String msg =driver.findElement(pgmDeletedMsg).getText();
			if(msg == "Program Deleted") return true;
			return true;
			
		}
	
	public void popUpIsNotDisplayed() {
		 driver.findElement(onManagePgmPage).isDisplayed();
	}
	public void clickDeletePopUpCloseIcon() {
		driver.findElement(deletePopUpCloseIcon).click();
	}
	
	public boolean search() {
		 driver.findElement(searchTextbox).sendKeys("First33");
		String searchEntry = driver.findElement(searchSuccess).getText();
		if(searchEntry=="First33") return true;
		return true;
		
		}
	}
	

