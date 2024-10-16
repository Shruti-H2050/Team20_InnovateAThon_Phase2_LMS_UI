package pageObjects;

import java.util.stream.Collectors;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SortingValidationPages {

	public WebDriver driver;
	By managePgm = By.xpath("//*[contains(text(),'Manage Program')]");
	By pgmNameSortIcon = By.xpath("//p-sorticon[@field = 'programName']");
	By dataFromPgmNameColumn = By.xpath("//tr//td[2]");
	public java.util.List<String>  originalList;
	public java.util.List<String> sortedList;
	public java.util.List<WebElement> pgmNamesList;
	
	public SortingValidationPages (WebDriver driver) {
		this.driver = driver;
	}
	public void managePgmPage() {
		driver.findElement(managePgm).isDisplayed();
	}
	
	public void clickPgmNameSortIcon() {
		driver.findElement(pgmNameSortIcon).click();
	}
	
	public void sortedAscendingOrder() {
		
		//capture all webelements to list
		 pgmNamesList = driver.findElements(dataFromPgmNameColumn);
		
		//capture text of all webelements
		  originalList = pgmNamesList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on original list
		   originalList.stream().sorted().collect(Collectors.toList());
		
		   
		//System.out.println(originalList);
		//System.out.println(sortedList);
		
		//compare orginal list with sorted list
		//Assert.assertEquals(originalList, sortedList);
		
	}
	public void afterSortValue() {
		String afterSortingValue =driver.findElement(dataFromPgmNameColumn).getText();
		System.out.println(afterSortingValue);
	}
}
