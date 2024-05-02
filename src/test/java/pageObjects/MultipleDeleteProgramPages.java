package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleDeleteProgramPages {
	public WebDriver driver;

	By managePgmPage = By.xpath("//*[contains(text(),'Manage Program')]");
	By deleteBtnInDataTable = By.xpath("//*[@icon='pi pi-trash']");
	By checkBox = By.xpath("//*[@role='checkbox']");
	By checkBoxInTableBody = By.xpath("//tbody//div[2]");
	
	public MultipleDeleteProgramPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void onManagePgmPage() {
		driver.findElement(managePgmPage).isDisplayed();
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
}
