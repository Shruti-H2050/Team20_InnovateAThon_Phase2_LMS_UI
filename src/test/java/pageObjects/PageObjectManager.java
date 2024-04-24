package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public AddNewProgramPages addNewProgramPages;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public AddNewProgramPages createNewPgm() {
		addNewProgramPages = new AddNewProgramPages(driver);
		
		return addNewProgramPages;
}
}