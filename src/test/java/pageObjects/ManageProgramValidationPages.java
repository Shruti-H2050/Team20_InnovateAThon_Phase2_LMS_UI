package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageProgramValidationPages {
	public WebDriver driver;
	By programOnNavigationBar = By.xpath("//button[@id='program']");
	String testManagePgmUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/";
	String headingCheckPgmPage = "Manage Program";
	String paginationText = "Showing x to y of z entries";
	By paginationIconDoublearrow = By.xpath("//span[@class='p-paginator-icon pi pi-angle-double-left']");
	By paginationIconSingleArrow = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	String footerText = "In total there are z programs";
	By deletButtonOnTopLeft = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	String newPgmButtonText = "+A New Program";
	By newPgmButtonPresent = By.xpath("//button[@label='A New Program']");
	By tablerowsdisplayed = By.xpath("//table/tbody/tr");
	By pgmNameColumnHeader = By.xpath("//table//th[2]");
	By pgmDescColumnnHeader = By.xpath("//table//th[3]");
	By pgmStatusColumnHeader = By.xpath("//table//th[4]");
	By pgmEditDeleteColumnHeader = By.xpath("//table//th[5]");
	By checkbox = By.xpath("//div[@role='checkbox']");
	By editButton = By.xpath("//button[@id='editProgram']");
	By deleteButton = By.xpath("//button[@id='deleteProgram']");
	By searchBar = By.xpath("//input[@placeholder='Search...']");
	By pgmNameSortIcon = By.xpath("//p-sorticon[@field='programName']");
	By pgmDescSortIcon = By.xpath("//p-sorticon[@field='description']");
	By pgmStatusSortIcon = By.xpath("//p-sorticon[@field='status']");
	
	
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
		driver.findElement(paginationIconDoublearrow).isDisplayed();
		driver.findElement(paginationIconSingleArrow).isDisplayed();
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
		 List<WebElement> rows = driver.findElements(tablerowsdisplayed);
		 
		 System.out.println("Number of rows in table are: "+rows.size());
		return rows;
	 }
	 
	 public boolean getpgmNameColumnHeader() {
		 String pgmNamecheck=driver.findElement(pgmNameColumnHeader).getText();
		 if(pgmNamecheck == "Program Name") return true;
		 System.out.println("PgmName"+pgmNamecheck);
		return true;
	 }
	 
	 public boolean getpgmDescColumnnHeader() {
		 String pgmDesccheck = driver.findElement(pgmDescColumnnHeader).getText();
		 if(pgmDesccheck == "Program Description") return true;
		 System.out.println("PgmDesc"+pgmDesccheck);
			return true;
		 
	 }
	 
	 public boolean getpgmStatusColumnHeader() {
		 String pgmDesccheck = driver.findElement(pgmStatusColumnHeader).getText();
		 if(pgmDesccheck == "Program Status") return true;
		 System.out.println("PgmStatus"+pgmDesccheck);
			return true;
	 }
	 public boolean getpgmEditDeleteColumnHeader() {
		 String pgmEditDelete = driver.findElement(pgmEditDeleteColumnHeader).getText();
		 if(pgmEditDelete == "Edit/Delete") return true;
		 return true;
	 }
	 
	 public boolean checkboxPresent() {
List<WebElement> rows = driver.findElements(tablerowsdisplayed);
		 System.out.println("Number of rows in table are: "+rows.size());
		 for(int i=0;i<rows.size();i++) {
			driver.findElement(checkbox).isDisplayed() ;
		 }
		return true;
	 }
	 public boolean checkEditBtnPresent() {
		 List<WebElement> editbtnCheck= driver.findElements(editButton);
		 for(int i=0;i<editbtnCheck.size();i++) {
				driver.findElement(checkbox).isDisplayed() ;
			 }
			return true;
	 }
	 public boolean checkDeleteBtnPresent() {
		 List<WebElement> deletebtnCheck= driver.findElements(deleteButton);
		 for(int i=0;i<deletebtnCheck.size();i++) {
				driver.findElement(checkbox).isDisplayed() ;
			 }
			return true;
	 }
	 public void checkSearchBar() {
		 driver.findElement(searchBar);
	 }
	 public void checkPgmNameSortIcon() {
		 driver.findElement(pgmNameSortIcon);
	 }
	 public void checkPgmDescSortIson() {
		 driver.findElement(pgmDescSortIcon);
	 }
	 public void checkPgmStatusSortIcon() {
		 driver.findElement(pgmStatusSortIcon);
	 }
}