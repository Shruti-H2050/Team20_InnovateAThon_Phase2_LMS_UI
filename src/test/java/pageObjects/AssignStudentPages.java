package pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class AssignStudentPages {
	
	
	private WebDriver driver;

	private By UserOnNavigationBar = By.xpath("//button[@id='user']");
	private By Assignstudentbutton = By.xpath("//span[@class='p-button-label' and contains(text(),'Assign Student')]");
	private By Assignstudentpopupheder = By.xpath("//span[@class='p-dialog-title ng-tns-c132-8 ng-star-inserted' and text()='Assign Student']");
	private By Assignstudentpopup = By.xpath("//div[contains(@class, 'ng-trigger-animation') and contains(@class, 'p-dialog')]");

	private By savebutton = By.xpath("//button[@label='Save' and @icon='pi pi-check']");
	private By Cancelbutton = By.xpath("//span[@class='p-button-label' and text()='Cancel']");
	private By Closeicon = By.xpath("//button[@type='button' and @tabindex='-1' and @pripple and contains(@class, 'p-dialog-header-close')]");
	private By RoeId = By.xpath("//input[@id='roleId']");
	private By StudentEmailId = By.xpath("//span[contains(@class, 'p-dropdown-label') and contains(text(), 'Select Email ID')]");
	private By StudentProgramName = By.xpath("//input[@id='programName']");
	private By StudentBatchmName = By.xpath("//input[@id='batchName']");
	private By status = By.xpath("//label[@for='online']");
	private By Emaildropdown = By.xpath("//span[contains(@class, 'p-dropdown-trigger-icon') and contains(@class, 'pi-chevron-down')]");
	private By Activestatus = By.xpath("//div[@class='p-hidden-accessible']/input[@type='radio' and @id='Active' and @name='userStatus' and @value='Active' and @aria-checked='false']");
	private By Inactive = By.xpath("//div[@class='p-hidden-accessible']/input[@type='radio' and @id='Inactive' and @name='userStatus' and @value='Inactive' and @aria-checked='false']");
	private By errorMessageAlert = By.xpath("//div[@class='ng-star-inserted' and contains(text(), 'User Email Id is required.')]");
	private By errorMessageAlertProgramName = By.xpath("//div[@class='ng-star-inserted' and contains(text(), 'Program Name is required.')]");
	private By errorMessageAlertBatchName = By.xpath("//div[@class='ng-star-inserted' and contains(text(), 'Batch Name is required.')]");
	private By popupwindowlocator = By.xpath("//div[@role='dialog' and contains(@class, 'p-dialog') and contains(@class, 'ng-star-inserted')]");
	private By errorMessageAlertEmailid = By.xpath("//div[contains(@class, 'ng-star-inserted') and contains(text(), 'User Email Id is required.')]");

	/*private By passwordField = By.xpath("//input[@id='password']");
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
	By loginalign = By.xpath("//mat-card[@class='mat-card mat-focus-indicator']");*/

	public AssignStudentPages(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	

	public void UserOnNavigationBar() {
		 driver.findElement(UserOnNavigationBar).click();
		 
	}
	
	public void ClickAssignstudent() {
		 driver.findElement(Assignstudentbutton).click();
		 
	}
	
	public void ClickCancel() {
		 driver.findElement(Cancelbutton).click();
		 
	}
	
	public void ClickSavebutton() {
		 driver.findElement(savebutton).click();
		 
	}
	public String getErrorMessageText() {
		try {
	        WebElement errorMessageElement = driver.findElement(errorMessageAlertEmailid);
	        return errorMessageElement.getText();
	    } catch (NoSuchElementException e) {
	        return null; 
	    }
    }
	public boolean isAssignStudentPopupDisplayed() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
	        WebElement assignStudentPopupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Assignstudentpopup));
	        return assignStudentPopupElement.isDisplayed();
	    } catch (NoSuchElementException | TimeoutException e) {
	        return false;
	    }
	}
	public boolean isSaveButtonDisplayed() {
	    try {
	    
	        return driver.findElement(savebutton).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; 
	    }
	}
	public boolean isCancelButtonDisplayed() {
	    try {
	    
	        return driver.findElement(Cancelbutton).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; 
	    }
	}
	public boolean isCloseIconDisplayed() {
	    try {
	    
	        return driver.findElement(Closeicon).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; 
	    }
	}
	
	public String getUserRole() {
	    try {
	        WebElement userRoleInput = driver.findElement(RoeId);
	        return userRoleInput.getAttribute("value");
	    } catch (NoSuchElementException e) {
	        return null; // Or throw an exception if appropriate
	    }
	}

	public boolean isStudentEmailIdInputDisplayed() {
	    try {
	        return driver.findElement(StudentEmailId).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isProgramNameInputDisplayed() {
	    try {
	        return driver.findElement(StudentProgramName).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isBatchNameInputDisplayed() {
	    try {
	        return driver.findElement(StudentBatchmName).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isStatusInputDisplayed() {
	    try {
	    
	        return driver.findElement(status).isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; 
	    }
	
	}
		
		
	public boolean isStudentEmailIdDropdownDisplayed() {
		 try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement emailDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(Emaildropdown));
		        return emailDropdown.isDisplayed();
		    } catch (NoSuchElementException | TimeoutException e) {
		        return false;
		    }
	}

	public boolean isProgramNameDropdownDisplayed() {
	    try {
	        WebElement programDropdown = driver.findElement(StudentProgramName);
	        return programDropdown.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isBatchNameDropdownDisplayed() {
	    try {
	        WebElement batchDropdown = driver.findElement(StudentBatchmName);
	        return batchDropdown.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	public boolean isErrorAlertEmailidDisplayed() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
	        WebElement errorMessageAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageAlertEmailid));
	        return errorMessageAlert.isDisplayed();
	    } catch (NoSuchElementException | TimeoutException e) {
	        return false;
	    }
	}

	public boolean isStatusRadioButtonsDisplayed() {
	    boolean isActiveDisplayed = false;
	    boolean isInactiveDisplayed = false;

	    try {
	        isActiveDisplayed = driver.findElement(Activestatus).isDisplayed();
	    } catch (NoSuchElementException e) {
	        isActiveDisplayed = false; 
	    }
	    
	    try {
	        isInactiveDisplayed = driver.findElement(Inactive).isDisplayed();
	    } catch (NoSuchElementException e) {
	        isInactiveDisplayed = false; 
	    }

	    return isActiveDisplayed && isInactiveDisplayed;
	}
	
	
	public boolean isErrorMessageAlertDisplayed() {
	    try {
	        return driver.findElement(errorMessageAlert).isDisplayed();
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isErrorMessageAlertEmailIdeDisplayed() {
	    try {
	        return driver.findElement(errorMessageAlertProgramName).isDisplayed();
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	
	public boolean isErrorMessageAlertProgramNameDisplayed() {
	    try {
	        return driver.findElement(errorMessageAlertProgramName).isDisplayed();
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isErrorMessageAlertBatchNameDisplayed() {
	    try {
	        return driver.findElement(errorMessageAlertBatchName).isDisplayed();
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isAssignStudentPopupClosed(WebDriver driver, By popupwindowlocator) {
	    try {
	        return !driver.findElement(popupwindowlocator).isDisplayed();
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return true;
	    }
	}

	public By getPopupWindowLocator() {
	    return popupwindowlocator;
	}
	public By getStudentEmailId() {
	    return StudentEmailId;
	}
	public By getProgramName() {
	    return StudentProgramName;
	}
	public By getBatchName() {
	    return StudentBatchmName;
	}

}
