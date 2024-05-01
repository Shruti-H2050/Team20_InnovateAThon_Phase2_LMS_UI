package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUserPages {
	public WebDriver driver;
    By userbutton = By.xpath("//*[@id = 'user']");  
	By manageuserpage = By.xpath("//*[contains(text(),'Manage User')]");
	By deleteBtnInDataTable = By.xpath("//*[@icon='pi pi-trash']");
	By checkBox = By.xpath("//*[@role='checkbox']");
	By checkBoxInTableBody = By.xpath("//tbody//div[2]");
	
	By checkpopup = By.xpath("//*[@class='ng-trigger ng-trigger-animation ng-tns-c133-9 p-dialog p-confirm-dialog p-component ng-star-inserted]'");
	By checkonyes = By.xpath("//*[contains(text(),'Yes')]");
	By checkonno = By.xpath("//*[contains(text(),'No')]");
	
	By checkonclose = By.xpath("//*(class='pi pi-times ng-tns-c133-9')");
	
	By checkontext = By.xpath("//*[contains(text(),'Succesful User Deleted')]");
	public DeleteUserPages(WebDriver driver) {
		this.driver = driver;
	}
	public void clickdeleteuserbutton(){ 
		driver.findElement(userbutton).click();
		
	}
	public void onManageuserPage() {
		driver.findElement(manageuserpage).isDisplayed();
	}
	
	public void deleteBtnEnabled() {
		driver.findElement(deleteBtnInDataTable).isEnabled();
	}
	public void clickCheckbox() {
		driver.findElement(checkBox).click();
	}
	public void clickDeleteBtn() {
		driver.findElement(deleteBtnInDataTable).click();
	}
	public void clickCheckboxInTableBody() {
		driver.findElement(checkBoxInTableBody).click();
		
	}
	
	public void clickonpopup() {
		driver.findElement(checkpopup).click();
	}
	public void clickonyes() {
		driver.findElement(checkonyes).click();
	
	}
	
	public void clickonno() {
		driver.findElement(checkonno).click();
	
	}
	public void getsuccesstext() {
		driver.findElement(checkontext).isDisplayed();
	}
	
	public void clickonclose() {
		driver.findElement(checkonclose).click();
	
	}
	

}

