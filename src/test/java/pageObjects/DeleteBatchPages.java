package pageObjects;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class DeleteBatchPages
{
public WebDriver driver;
static String success;
By batchname = By.xpath("//tbody/tr[1]//td[2]");
By batchbtn = By.xpath("//button[2]/span[@class='mat-button-wrapper']");
static By username1 = By.xpath("//input[@id='username']");
static By password1 = By.xpath("//input[@id='password']");
static By loginButton1 = By.xpath("//button[@id='login']");
By beforetotal = By.xpath("//div[contains(text(),'In total there are 23 programs.')]");
By aftertotal = By.xpath("//div[contains(text(),'In total there are 23 programs.')]");
By successmsg = By.xpath("//div[@class='p-toast-message-content ng-tns-c90-8']");
By checkbox = By.xpath("//table//tr[1]//td[1]");
By deletebtn = By.xpath("//table//tr[1]//td[7]//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
By firstrow = By.xpath("//table//tr[1]");
By nobutton = By.xpath("//button[@class='ng-tns-c133-7 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']");
By yesbutton = By.xpath("//button[@class='ng-tns-c133-7 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']");
By alertmsg = By.xpath("//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-7 p-dialog p-confirm-dialog p-component ng-star-inserted']");
public DeleteBatchPages(WebDriver driver) 
{
    this.driver = driver;
}
public void logged_lms_portal() throws IOException 
{ 
	FileInputStream fis = new FileInputStream("C:\\Users\\siva1\\git\\Team20_InnovateAThon_Phase2_LMS_UI\\src\\test\\resources\\global.properties");
	Properties prop = new Properties();
	prop.load(fis);
    WebElement usernameField = driver.findElement(username1);
    usernameField.sendKeys(prop.getProperty("Username"));
    WebElement passwordField = driver.findElement(password1);
    passwordField.sendKeys(prop.getProperty("Password"));
    WebElement loginButton = driver.findElement(loginButton1);
    loginButton.click();
}
public void admin_on_dashboard_page(String string) 
{
	System.out.println("Admin should land on dashboard page after Login.");
	String actual=driver.findElement(batchbtn).getText();
	String expected=string;
	Assert.assertEquals(actual,expected);
	System.out.println("Batch Button is displayed,enabled and interactable");
	driver.findElement(batchbtn).click();
}
public void the_delete_icon_enabled() 
{
	System.out.println(driver.findElement(deletebtn).isEnabled());	
}
public void alert_with_yes_no() 
{
	driver.findElement(deletebtn).click();
	String message=driver.findElement(alertmsg).getText();
	if(driver.findElement(alertmsg).isDisplayed()) {
	//System.out.println("Popup is displayed with "+message);
	String yesbtn=driver.findElement(yesbutton).getText();
	String nobtn=driver.findElement(nobutton).getText();
	if(driver.findElement(yesbutton).isDisplayed() && driver.findElement(nobutton).isDisplayed())
	System.out.println("Alert is displayed with "+yesbtn+" and " +nobtn+" buttons");	
	
	}
}
public void clicks_yes_option() 
{
	if(driver.findElement(firstrow).isDisplayed())	
	{	
		String batch =driver.findElement(batchname).getText();
		driver.findElement(checkbox).click();	
		driver.findElement(deletebtn).click();
		driver.findElement(alertmsg);
		driver.findElement(yesbutton).click();
		driver.findElement(successmsg).isDisplayed();
		success = driver.findElement(successmsg).getText();
		System.out.println(success);
		
		List<WebElement> lists = driver.findElements(By.xpath("//table//tr//td[2]"));
		for (WebElement list:lists)
		{
			String batch_list = driver.findElement(By.xpath("//table//tr//td[2]")).getText();	
			Assert.assertNotEquals(batch,batch_list);
		}
		System.out.println("Batch is deleted");
}
}
public void clicks_no_option() 
{
	if(driver.findElement(firstrow).isDisplayed())	
	{	
		String batch =driver.findElement(batchname).getText();
		driver.findElement(checkbox).click();	
		driver.findElement(deletebtn).click();
		driver.findElement(alertmsg);
		driver.findElement(nobutton).click();
				
		List<WebElement> lists = driver.findElements(By.xpath("//table//tr//td[2]"));
		for (WebElement list:lists)
		{
			String batch_list = driver.findElement(By.xpath("//table//tr//td[2]")).getText();	
			Assert.assertEquals(batch,batch_list);
			break;
		}
		System.out.println("Batch is not deleted since no is selected");
}
}
public void admin_clicks_delete_icon() 
{
	System.out.println(" Admin clicks on the delete icon");	
}
public void batch_deleted_alert_pops() 
{
	if(driver.findElement(successmsg).isDisplayed())
	{
	System.out.println("First Batch from datatable is deleted and that corresponding batch is no more available");	
	}
}
public void batch_not_deleted() 
{
	System.out.println("No batch is deleted");	
}
}

