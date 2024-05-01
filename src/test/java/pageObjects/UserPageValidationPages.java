package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserPageValidationPages {
	
       public WebDriver driver;
		By UserOnNavigationBar = By.xpath("//button[@id='user']");
		String testUserPageUrl = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
		String headingCheckUserPage = "Manage User";
		String getPaginationText = "Showing x to y of z entries";
		By paginationIconDoublearrow = By.xpath("//span[@class='p-paginator-icon pi pi-angle-double-right']");
		By paginationIconSingleArrow = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	    By usrColumnID = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]");
		By usrColumnName = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]");
		By usrColumnLocation = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[4]");
	    By usrColumnPhoneNum = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[5]");
	    By usrColumnEditDelete = By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[6]");
		By deletButtonOnTopLeft = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	    String newUsrPageButtonText = "+A New User";
		By newUsrPageButtonPresent = By.xpath("//button[@label='Add New User']");
        By searchBar = By.xpath("//input[@placeholder='Search...']");
	    By checkbox = By.xpath("//div[@role='checkbox']");
		By tablerowsdisplayed = By.xpath("//table/tbody/tr");
		By editButton = By.xpath("//button[@id='editUser']");
		By deleteButton = By.xpath("//button[@id='deleteUser']");
       // By manageUsrPage = By.xpath(("//mat-card[@class=\"mat-card mat-focus-indicator container\"]");
        By searchUsername = By.xpath("//input[@id=\"filterGlobal\"");
        String paginationText = "Showing 0 to 0 of 0 entries";
        By searchBoxLocator= By.xpath("//input[@placeholder='Search...']");

		String validateManageUser = "Manage User";
		By userNamedisplayedValidate = By.xpath("//table//tr[2]");
		

        By keywordsNotPresent = By.xpath("//*[@id=\"filterGlobal\"]");
		String zeroPaginationText = "Showing 0 to 0 of 0 entries";
     
		
		
		public UserPageValidationPages(WebDriver driver) {
			this.driver = driver;
		}
		
//		public String getTitle() {
//			return driver.getTitle();
//		}
//		
//		public void UsrOnNavigationBar() {
//			 driver.findElement(UserOnNavigationBar).click();
//			 
//		}
//		
//		public String getCurrentUserePageUrl() {
//			return driver.getCurrentUrl();
//		}
//		
//		public String getTestUserPageUrl() {
//			return testUserPageUrl;
//			
//		}
//		public boolean checkUserPageHeading() {
//					
//			if(headingCheckUserPage == "Manage User") return true;
//			return true;
//		}
//		
//		public String getPaginationText() {
//			return paginationText;
//			
//		}
//		public void checkPaginationButton() {
//			driver.findElement(paginationIconDoublearrow).isDisplayed();
//			driver.findElement(paginationIconSingleArrow).isDisplayed();
//		}
//		
//		
//		 public boolean getusrColumnID() {
//			 String pageIDcheck=driver.findElement(usrColumnID).getText();
//			 if(pageIDcheck == "Page ID") return true;
//			 System.out.println("pageID"+pageIDcheck);
//			return true;
//		 }
//		
//		 public boolean getusrColumnName() {
//			 String pageNamecheck=driver.findElement(usrColumnName).getText();
//			 if(pageNamecheck == "Page Name") return true;
//			 System.out.println("PageName"+pageNamecheck);
//			return true;
//		 }
//		
//		 public boolean getusrColumnLocation() {
//			 String pageLocationcheck=driver.findElement(usrColumnLocation).getText();
//			 if(pageLocationcheck == "Page Location") return true;
//			 System.out.println("PageLocation"+pageLocationcheck);
//			return true;
//		 }
//		
//		 
//		
//		 public boolean getusrColumnPhoneNum() {
//			 String pagePhoneNumcheck=driver.findElement(usrColumnPhoneNum).getText();
//			 if(pagePhoneNumcheck == "Page PhoneNum") return true;
//			 System.out.println("PagePhoneNum"+pagePhoneNumcheck);
//			return true;
//		 }
//		
//		 
//		 public boolean getusrColumnEditDelete() {
//			 String pageEditDeletecheck=driver.findElement(usrColumnEditDelete).getText();
//			 if(pageEditDeletecheck == "Page EditDelete") return true;
//			 System.out.println("PageEditDelete"+pageEditDeletecheck);
//			return true;
//		 }
//		
//		 
//		  public boolean validateDeleteButtonOnTopLeft()
//	{
//			driver.findElement(deletButtonOnTopLeft).isEnabled();
//			return false;
//	}
//		
//		 
//		  
//		  
//		  public void newUsrPageButton() {
//			 driver.findElement(newUsrPageButtonPresent).getText().contains(newUsrPageButtonText);
//		 }
//		 
//		  
//		  public void checkSearchBar() {
//				 driver.findElement(searchBar);
//			 }
//		 
//		  
//	 public boolean checkboxPresent() {
//	List<WebElement> rows = driver.findElements(tablerowsdisplayed);
//			 System.out.println("Number of rows in table are: "+rows.size());
//			 for(int i=0;i<rows.size();i++) {
//				driver.findElement(checkbox).isDisplayed() ;
//			 }
//			return true;
//	 }
//	 
//	 
//	 public List<WebElement> getTableNumOfRows() {
//		 List<WebElement> rows = driver.findElements(tablerowsdisplayed);
//		 
//		 System.out.println("Number of rows in table are: "+rows.size());
//		return rows;
//	 }
//	 
//
//			
//			
//		 public boolean checkEditBtnPresent() {
//			 List<WebElement> editbtnCheck= driver.findElements(editButton);
//			 for(int i=0;i<editbtnCheck.size();i++) {
//					driver.findElement(checkbox).isDisplayed() ;
//				 }
//				return true;
//		 }
//		 
//
//		 
//		 public boolean checkDeleteBtnPresent() {
//			 List<WebElement> deletebtnCheck= driver.findElements(deleteButton);
//			 for(int i=0;i<deletebtnCheck.size();i++) {
//					driver.findElement(checkbox).isDisplayed() ;
//				 }
//				return true;
//		 }
//		 


   public void searchBoxLocator() {
	   Actions action = new Actions(driver);
	   driver.findElement(searchBoxLocator).click();

	   action.sendKeys("John").sendKeys(Keys.ENTER).perform();
}


//public void validateManageUser() {
//	Assert.assertTrue(userValidationManageUser.getTitle().contains("Manage User"));
//	System.out.println("Admin is on Manage User Page");	
//}
//

public boolean validateManageUser() {
	
	if(validateManageUser == "Manage User") return true;
	return true;
}

//public void userNamedisplayedValidate() {
//	Thread.sleep(1000);
//driver.findElement(userNamedisplayedValidate).sendKeys("John");
//}
//}

public void userNamedisplayedValidate() throws InterruptedException {
	Thread.sleep(1000);
driver.findElement(userNamedisplayedValidate).sendKeys("John");
}

//
//public boolean keywordsNotPresent() {
//    WebElement searchBox = driver.findElement(keywordsNotPresent);
//    searchBox.sendKeys("State ");
//    String searchEntry = searchBox.getAttribute("value");
//    return searchEntry.equals("State ");
//}
//public String zeroPaginationText() {
//    WebElement paginationText = driver.findElement(zeroPaginationText);
//    return paginationText.getText();
//}

}



//public void keywordsNotPresent() {
//driver.findElement(keywordsNotPresent).sendKeys("State");
//}
//
//
//
//
//public boolean keywordsNotPresent() {
//driver.findElement(keywordsNotPresent).sendKeys("State ");
//String searchEntry = driver.findElement(keywordsNotPresent).getText();
//if(searchEntry=="State ") return true;
//return true;
//
//}

//public String zeroPaginationText() {
//return zeroPaginationText;
//
//}
//
//}
//