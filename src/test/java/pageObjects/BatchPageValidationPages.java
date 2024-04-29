package pageObjects;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.IOException;
public class BatchPageValidationPages
{
public static WebDriver driver;
By batchbtn = By.xpath("//button[2]/span[@class='mat-button-wrapper']");
static By username1 = By.xpath("//input[@id='username']");
static By password1 = By.xpath("//input[@id='password']");
static By loginButton1 = By.xpath("//button[@id='login']");
By manageheader = By.xpath("/html/body/app-root/app-batch/div/mat-card/mat-card-title/div[1][contains(text(),' Manage Batch')]");
By paginationctrl = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
By deleteicon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']"); 
By addbtn = By.xpath("//button[@label='A New Batch']"); 
By searchbox = By.xpath("//input[@id='filterGlobal']"); 
By dialog = By.xpath("//div[@role='dialog']"); 

public BatchPageValidationPages(WebDriver driver) 
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
	public void admin_clicks_batchbutton(String string) 
	{
		String actual=driver.findElement(batchbtn).getText();
		String expected=string;
		Assert.assertEquals(actual,expected);
		System.out.println("Batch Button is displayed,enabled and interactable");
		driver.findElement(batchbtn).click();
	}
	public void admin_url(String string) 
	{
		String url= driver.getCurrentUrl();
		String[] results = url.split(".com");
		String[] results1 = results[1].split("/");
		String actual = results1[1];	
		String expected = string;
		Assert.assertEquals(actual,expected);
		System.out.println(string+" is seen in the URL");	
	}
	public void admin_pagination_controls() 
	{
		WebElement pagcntrl = driver.findElement(paginationctrl);
		Assert.assertTrue(pagcntrl.isDisplayed());
		System.out.println("Paginationcontrol is seen below the datatable")	;	
	}
	public void admin_header(String string) 
	{
		String actual=driver.findElement(manageheader).getText();
		String expected=string;
		Assert.assertEquals(actual,expected);
		System.out.println(string+" is seen in the header");
	}
	public void header_fields() 
	{
		List<WebElement> fields = driver.findElements(By.xpath("//table//th"));
		for (WebElement field:fields)
		{
			Assert.assertTrue(field.isDisplayed(),"corresponding header is not displayed");
			System.out.println(field.getText()+" is seen as a header in Batch Page");
		}
	}
	public void deleteicon_disabled(String string) 
	{
		 WebElement Deleteicon = driver.findElement(deleteicon);
	     if(Deleteicon.isEnabled())
	     {
	     System.out.println(string+" icon is seen in the header and is enabled");
	     }
	     else 
	     {
	     System.out.println(string+" icon is seen in the header and is disabled");
	     }
	}
	public void checkboxes_diplayed() 
	{
		//List<WebElement> elements = driver.findElements(By.xpath("//table//td[1]//div[@class='p-checkbox-box p-component']"));
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//table//tr//td[1]"));
		for (WebElement checkbox:checkboxes)
		{
			Assert.assertTrue(checkbox.isEnabled(),"checkbox is not displayed for each row in the datatable");
	    }
		System.out.println("Checkboxes are displayed for each row in the datatable");
	}
	public void anewbatchbtn(String string) 
	{
		WebElement Addbttn  = driver.findElement(addbtn);
	    Assert.assertTrue(Addbttn.isDisplayed());
	    Assert.assertTrue(Addbttn.isEnabled());
	    System.out.println(string+" is seen and enabled in Batch Page");
	}
	public void edit_icon_enabled() 
	{
		List<WebElement> editbuttons = driver.findElements(By.xpath("//table//td[7]//span[@class='p-button-icon pi pi-pencil']"));
		
		//List<WebElement> elements = driver.findElements(By.xpath("//table//tr//td[7]"));
        for (WebElement editbutton:editbuttons)
		{
				Assert.assertTrue(editbutton.isEnabled(),"edit icon is not enabled");
	    }
        System.out.println("Edit icons are displayed for each row in the datatable");
	}
	public void search_box_enabled(String string) 
	{
		WebElement Searchbox  = driver.findElement(searchbox);
	    Assert.assertTrue(Searchbox.isDisplayed());
	    System.out.println(string+" is seen in Batch Page");
	}
	public void delete_icon_enabled()
	{
		List<WebElement> deletebuttons = driver.findElements(By.xpath("//table//td[7]//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']"));
		
		//List<WebElement> elements = driver.findElements(By.xpath("//table//tr//td[7]"));
		for (WebElement deletebutton:deletebuttons)
		{
			Assert.assertTrue(deletebutton.isEnabled(),"delete icon is not enabled");
		}
		System.out.println("Delete icons are displayed for each row in the datatable");
	}
	public void admin_clicks_button(String string) throws InterruptedException 
	{
		WebElement Addbttn = driver.findElement(addbtn);
		String actual = string;
		String expected = Addbttn.getText(); 
		Assert.assertEquals(actual,expected);
		System.out.println(string+" is clickable in Batch Page");
		Addbttn.click();
	}
	public void pop_up_appears() 
	{
		WebElement Dialog = driver.findElement(dialog);
		Assert.assertTrue(Dialog.isDisplayed());
		System.out.println("The popup is seen in Batch Page");
	}
}
