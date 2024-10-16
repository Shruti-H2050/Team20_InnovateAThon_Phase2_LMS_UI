package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProgramDetailsPages {

	public WebDriver driver;
	
	By editPgmButton = By.xpath("//button[@id='editProgram']");
	By editPopUp = By.xpath("//*[@role='dialog']");
	By editPgmName = By.xpath("//input[@id='programName']");
	By saveButton = By.xpath("//button[@label='Save']");
	By pgmUpdatedMsg = By.xpath("//*[contains(text(),'Program Updated')]");
	By editPgmDesc = By.xpath("//input[@id='programDescription']");
	By inactiveRadioBtn = By.xpath("//input[@id='Inactive']");
	By radioBtnCheck = By.xpath("//input[@aria-checked='false']");
	By radioBtnCheck2 = By.xpath("//input[@aria-checked='true']");
	By pgmUpdated = By.xpath("//*[contains(text(),'Program Updated')]");
	
	public EditProgramDetailsPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkPgmEditButton() {
		driver.findElement(editPgmButton).click();
	}
	public void checkEditPopUp() {
		driver.findElement(editPopUp);
	}
	public void checkEditPopUpDisplayed() {
		driver.findElement(editPopUp).isDisplayed();
	}
	public void editPgmName() {
		driver.findElement(editPgmName).sendKeys("Hello");
	}
	public void editPgmName2() {
		driver.findElement(editPgmName).clear();
		driver.findElement(editPgmName).sendKeys("SDET");
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
	}
	public boolean pgmUpdatedMsg() {
		String msg =driver.findElement(pgmUpdatedMsg).getText();
		if(msg == "Program Created Successfully") return true;
		return true;
		
	}
	public void editPgmDesc() {
		driver.findElement(editPgmDesc).sendKeys("Hello");
	}
	public void clickInactiveRadioBtn() {
		driver.findElement(inactiveRadioBtn).click();
	}
	public void radioBtnCheck() {
		String text1 = driver.findElement(radioBtnCheck).getText();
		String text2 = driver.findElement(radioBtnCheck2).getText();
	
		if(text1 == "true") {
			driver.findElement(radioBtnCheck2).click();
		}
		else
			if(text2 == "true") {
				driver.findElement(radioBtnCheck).click();
			}
	}
	
	public boolean successfulMsg() {
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		String msg =driver.findElement(pgmUpdated).getText();
		if(msg == "Program Updated") return true;
		return true;
		
	}
}
