package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class EditBatchPages 
{	
public WebDriver driver;
By dialog = By.xpath("//div[@role='dialog']"); 
By editbtn = By.xpath("//table//tr[1]//td[7]//button[@class='p-button-rounded p-button-success p-button p-component p-button-icon-only']");
By batch = By.xpath("//input[@id='batchDescription']"); 
By noofclasses = By.xpath("//input[@id='batchNoOfClasses']");
By OptionA =By.xpath("//div//div[4]//div[2]//p-radiobutton//div[@class='p-radiobutton-box']");
By OptionB =By.xpath("//div//div[4]//div[3]//p-radiobutton//div[@class='p-radiobutton-box']");
By searchbox=By.xpath("//input [@placeholder='Search...']");
By savebtn=By.xpath("//button[@label='Save']");
public EditBatchPages (WebDriver driver)
{
	this.driver = driver;
}
public void the_edit_icon_enabled() 
{
	List<WebElement> editbuttons = driver.findElements(By.xpath("//table//td[7]//span[@class='p-button-icon pi pi-pencil']"));
	//List<WebElement> elements = driver.findElements(By.xpath("//table//tr//td[7]"));
    for (WebElement editbutton:editbuttons)
	{
	  Assert.assertTrue(editbutton.isEnabled(),"edit icon is not enabled");
    }
    System.out.println("Edit icons are displayed for each row in the datatable");
 }
public void edit_icon_at_first_row() 
{
	System.out.println(driver.findElement(editbtn).isEnabled());
}
public void pop_up_appears() 
{
	WebElement Dialog = driver.findElement(dialog);
	Assert.assertTrue(Dialog.isDisplayed());
	System.out.println("The popup is seen in Batch Page for editing fields");
}
public void admin_clicks_the_edit_icon() 
{
	 driver.findElement(editbtn).click();
}
public void update_fields_with_valid_values_and_click_save() throws InterruptedException 
{
	 driver.findElement(batch).click();
	 driver.findElement(batch).clear();
	 driver.findElement(batch).sendKeys("QA functional testing");
	 
	 
//	 driver.findElement(noofclasses).click();
//	 driver.findElement(noofclasses).clear();
//	 driver.findElement(noofclasses).sendKeys("5");
//	 
//	 Thread.sleep(2000);
//	 WebElement optaA = driver.findElement(OptionA);
//	 WebElement optaB = driver.findElement(OptionB);
//	 if(optaA.isSelected())
//	 {optaB.click();}
//	 else if(optaB.isSelected())
//	 {optaA.click();}
	 
}
 public void the_updated_batch_on_the_data_table() throws InterruptedException 
{
	 driver.findElement(savebtn).click();
	 Thread.sleep(1000);
	 System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
	 
//	 Actions action = new Actions(driver);
//	 driver.findElement(searchbox).click(); 
//	 action.sendKeys("QA functional testing").sendKeys(Keys.ENTER).perform();
//	 Thread.sleep(1000);
//	 String newbatch=driver.findElement(By.xpath("//table//tbody//tr[1]//td[3]")).getText();
//	 //String newclasses=driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]")).getText();
//	 Assert.assertEquals("QA functional testing",newbatch);
//	 //Assert.assertEquals(5,newclasses);
//     System.out.println("Batch gets edited with new values and is seen in the manage batch");		 
} 
public void update_the_fields_with_invalid_values_and_click_save() throws InterruptedException 
{
	 driver.findElement(batch).click();
	 driver.findElement(batch).click();
	 driver.findElement(batch).clear();
	 driver.findElement(batch).sendKeys(" "); 
	 driver.findElement(savebtn).click();
	 System.out.println("This field should start with an alphabet and min 2 character."); 

	
////	Actions action = new Actions(driver);
////	 driver.findElement(batch).click(); 
////	 ((WebElement) batch).sendKeys(Keys.chord(Keys.CONTROL,"a"));
////	 ((WebElement) batch).sendKeys(Keys.BACK_SPACE).perform();
//	 
//	 driver.findElement(By.xpath("//small[contains(text(),'This field should start with an alphabet and min 2 character.')]")).click();
//	 driver.findElement(savebtn).click();
//	 System.out.println(driver.findElement(By.xpath("//small[contains(text(),'This field should start with an alphabet and min 2 character.')]")).getText());	 
} 
public void erase_data_from_mandatory_field() throws InterruptedException 
{
	 driver.findElement(batch).click();
	 driver.findElement(batch).clear();
	 driver.findElement(batch).sendKeys("12366544"); 
	 driver.findElement(savebtn).click();
	 System.out.println("Batch Description is required.This field should start with an alphabet and min 2 character."); 
//     Actions action = new Actions(driver);
//	 WebElement batchdes=driver.findElement(By.xpath("//small[contains(text(),'Batch Description is required.')]"));
//	 action.moveToElement(batchdes).build().perform();
//	 System.out.println(batchdes.getText()); 
}	
public void error_message_should_appear() 
{
	System.out.println("Above Error message will appear");	
}
}


