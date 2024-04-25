package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public AddNewProgramPages addNewProgramPages;
	public LoginPages loginPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPages getlogin() {
		loginPage=new LoginPages(driver);
		return loginPage;
		
	}
	public AddNewProgramPages createNewPgm() {
		addNewProgramPages = new AddNewProgramPages(driver);
		
		return addNewProgramPages;
}
}