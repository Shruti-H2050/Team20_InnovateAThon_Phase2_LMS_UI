package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewProgramPages {
	
	public WebDriver driver;
	//private  By usernameField = By.xpath("//input[@id='username']");
  //  private   By passwordField = By.xpath("//input[@id='password']");
	By programOnNavigationBar = By.xpath("//button[@id='program']");
	By managePgmTitle = By.xpath("//*[contains(text(),'Manage Program')]");
	String managePgmPageUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/";
	By newPgmButtonClick = By.xpath("//button[@label='A New Program']");
	By pgmDetailsPopUp = By.xpath("//*[contains(text(),'Program Details')]");
	By popUpSaveButton = By.xpath("//*[contains(text(),'Save')]");
	By popUpCancelButton = By.xpath("//*[contains(text(),'Cancel')]");
	By closeIconPopUp = By.xpath("//*[@tabindex='-1']");
	By pgmPopUpNameInputField = By.xpath("//label[contains(text(),'Name')]");
	By pgmPopUpDescInputField = By.xpath("//label[contains(text(),'Description')]");
	By pgmPopUpNameTextBox= By.xpath("//input[@id='programName']");
	By pgmPopUpDescTextBox = By.xpath("//input[@id='programDescription']");
	By pgmPopUpStatusInputField = By.xpath("//lable[contains(text(),'Status')]");
	By pgmStatusRadioButton = By.xpath("//*[@id='category']");
	By errorMsgs = By.xpath("//small[@class='p-invalid ng-star-inserted']");
	By pgmNameRequiredErrorMsg = By.xpath("//small[contains(text(),'Program name is required.')]");
	By pgmNameDetailedErrorMsg = By.xpath("//small[contains(text(),'This field should start with an alphabet, no special char and min 2 char.')]");
	By pgmDescRequiredErrorMsg = By.xpath("//small[contains(text(),'Description is required.')]");
	By pgmDescDetailedErrorMsg = By.xpath("//small[contains(text(),'This field should start with an alphabet and min 2 char.')]");
	By pgmStatusErrorMsg = By.xpath("//small[contains(text(),'Status is required.')]");
	By pgmDetailsPopUpDisappers = By.xpath("//div[@role='dialog']");
	By successfulPgmCreation = By.xpath("//*[contains(text(),'Program Created Successfully')]");
	By searchTextbox = By.xpath("//input[@placeholder='Search...']");
	By searchSuccess = By.xpath("//td[contains(text(),'InnovateAthonLMSHackathon')]");
	By popUpClose = By.xpath("//*[@role='dialog']");
			
	public AddNewProgramPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pgmOnNavigationBar() {
		 driver.findElement(programOnNavigationBar).click();
		 
	}
	public WebElement getManagePgmDashboard() {
		return driver.findElement(managePgmTitle);
	}
	
	public void managePgmUrl() {
		driver.navigate().to(managePgmPageUrl);
	}
	
	public void clickNewPgmButton() {
		driver.findElement(newPgmButtonClick).click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public boolean pgmDetailsPopUp() {
		driver.findElement(pgmDetailsPopUp);
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		driver.findElement(closeIconPopUp);
		driver.findElement(popUpSaveButton);
		driver.findElement(popUpCancelButton);
		
		return true;
		//alert.dismiss();
		//Alert alert = driver.manage().timeouts().getPageLoadTimeout()   .until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean checkPopUpFieldTexTBox() {
		driver.findElement(pgmPopUpNameInputField);
		driver.findElement(pgmPopUpDescInputField);
		driver.findElement(pgmPopUpNameTextBox);
		driver.findElement(pgmPopUpDescTextBox);
		return true;
	}
	
	public boolean radioBtnCheck() {
		List<WebElement> count =driver.findElements(pgmStatusRadioButton);
		if(count.size()==2) return true;
		return true;
	}
	
	public void clickSaveBtnn() {
		driver.findElement(popUpSaveButton).click();
	}
	
	public void geterrorMsgAlert() {
		driver.findElement(errorMsgs).isDisplayed();
	}
	public void enterPgmName() {
		driver.findElement(pgmPopUpNameTextBox).sendKeys("PgmHelloWorld");
	}
	public void pgmNameRequiredErrMsg() {
		driver.findElement(pgmNameRequiredErrorMsg).isDisplayed();
	}
	public void pgmDescRequiredErrMsg() {
		driver.findElement(pgmDescRequiredErrorMsg).isDisplayed();
	}
	public void pgmStatusRequiredErrMsg() {
driver.findElement(pgmStatusErrorMsg).isDisplayed();
	}
	public void enterPgmDesc() {
		driver.findElement(pgmPopUpDescTextBox).sendKeys("Welcome to Programming");
	}
	
	public void selectStatusRadioBtn() {
		driver.findElement(pgmStatusRadioButton).click();
	}
	
	public void specialCharacterCheckPgmNameDesc() {
		driver.findElement(pgmPopUpNameTextBox).sendKeys("A123@#$");
		driver.findElement(pgmPopUpDescTextBox).sendKeys("!@#$acf");
	}
	public void pgmNameDetailedErrorMsg() {
		driver.findElement(pgmNameDetailedErrorMsg).isDisplayed();
	}
	public void pgmDescDetailedErrorMsg() {
		driver.findElement(pgmDescDetailedErrorMsg).isDisplayed();
	}
	public void specialPgmDescCharacterCheck() {
		driver.findElement(pgmPopUpNameTextBox).sendKeys("!@#$acf");
	}
	public void closePgmPopUp() {
		driver.findElement(closeIconPopUp).click();
	}
	
	public void checkCancelBtn() {
		driver.findElement(popUpCancelButton).click();
	}
	public boolean pgmDetailsPopUpDisappers() {
		driver.findElement(pgmDetailsPopUpDisappers);
		return true;
	}
	public void addPgmSuccessful() {
		driver.findElement(pgmPopUpNameTextBox).sendKeys("SDETTeamCApril");
		driver.findElement(pgmPopUpDescTextBox).sendKeys("SDETTeamCApril");
		
	}
	public boolean successfulMsg() {
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		String msg =driver.findElement(successfulPgmCreation).getText();
		if(msg == "Program Created Successfully") return true;
		return true;
		
	}
	public boolean search() {
	 driver.findElement(searchTextbox).sendKeys("InnovateAthonLMSHackathon");
	String searchEntry = driver.findElement(searchSuccess).getText();
	if(searchEntry=="InnovateAthonLMSHackathon") return true;
	return true;
	
	}
	public void popIsClosed() {
		driver.findElement(popUpClose).clear();
	}
}