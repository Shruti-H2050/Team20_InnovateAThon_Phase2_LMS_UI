package pageObjects;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DeleteMultipleBatchesPages 
{
	public WebDriver driver;
	By firstrow = By.xpath("//table//tr[1]");
	By deleteicon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']"); 
	By batchbtn = By.xpath("//button[2]/span[@class='mat-button-wrapper']");
	static By username1 = By.xpath("//input[@id='username']");
	static By password1 = By.xpath("//input[@id='password']");
	//By checkboxhdr = By.xpath("//table//th[1]");
	By checkboxlist=By.xpath("//table//tr//td[1]");
	By checkbox = By.xpath("//table//tr[1]//td[1]");
	By deletebtn = By.xpath("//table//tr[1]//td[7]//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
	static By loginButton1 = By.xpath("//button[@id='login']");
	By yesbutton = By.xpath("//button[@class='ng-tns-c133-7 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']");
	By successmsg = By.xpath("//div[@class='p-toast-message-content ng-tns-c90-8']");
	By successmsg1 = By.xpath("//div[@role='alert']");
	By alertmsg = By.xpath("//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-7 p-dialog p-confirm-dialog p-component ng-star-inserted']");
	static String success;

	public DeleteMultipleBatchesPages(WebDriver driver) 
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
		System.out.println("Batch Button is selected");
	}
	public void checkboxes_are_not_selected() 
	{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//table//tr//td[1]"));
		for (WebElement checkbox:checkboxes)
		{ Assert.assertFalse(checkbox.isSelected()); }
		 System.out.println("checkboxes are not selected");
	}
	public void the_delete_icon_disabled(String string) 
	{
	     if(driver.findElement(deleteicon).isEnabled())
	     {System.out.println("delete icon under "+string+" is enabled");}
	     else 
	     {System.out.println("delete icon under "+string+" is diaabled");}
	}
	public void one_checkbox_selected() throws InterruptedException 
	{
		driver.findElement(checkbox).click();
		System.out.println("First checkbox is selected");	
	}
	public void click_delete_icon(String string) 
	{
		driver.findElement(deleteicon).click();
		System.out.println("When user clicks on delete icon");
	}
	public void the_respective_data_is_deleted() 
	{
		driver.findElement(alertmsg);
		driver.findElement(yesbutton).click();
		driver.findElement(successmsg).isDisplayed();
		success = driver.findElement(successmsg).getText();
		System.out.println(success);
		System.out.println("Row belongs to that selected checkbox gets deleted");
	}
	public void more_checkboxes_selected() 
	{
		//driver.findElement(checkboxhdr).click();//selects all the checkboxes in corresponding datatable in the first page			
        List<WebElement> checkboxes = driver.findElements(checkboxlist);	
		for (WebElement checkbox:checkboxes)
		{
			Assert.assertTrue(checkbox.isEnabled(),"delete icons are not enabled");
			checkbox.click();
		}		
		System.out.println("First five checkboxes are selected in first page");		
	}
	public void the_respective_rows_deleted() throws InterruptedException 
	{
		driver.findElement(yesbutton).click();
		Thread.sleep(1000);
//		WebElement activeElement =driver.switchTo().activeElement();
//		String message = activeElement.getAttribute("validationMessage");		
		if(driver.findElement(successmsg1).isDisplayed()) 
			success = driver.findElement(successmsg1).getText();
			System.out.println(success);	
		System.out.println("Rows belongs to that selected checkboxes gets deleted");
	}
}
