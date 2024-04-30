package pageObjects;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.excelreader;

public class AddNewBatchPages {
	private static final boolean WebElement = false;
	public WebDriver driver;
	static String success;
	static StringBuilder randombatchname;
	By batchbtn = By.xpath("//button[2]/span[@class='mat-button-wrapper']");
	static By username1 = By.xpath("//input[@id='username']");
	static By password1 = By.xpath("//input[@id='password']");
	static By loginButton1 = By.xpath("//button[@id='login']");
	By addbtn = By.xpath("//button[@label='A New Batch']");
	By fields = By.xpath("//label");
	By batchname = By.xpath("//input[@id='batchName']");
	By batchdescrption = By.xpath("//input[@id='batchDescription']");
	By noofclasses = By.xpath("//input[@id='batchNoOfClasses']");
	By optionA = By.xpath("//div//div[4]//div[2]//p-radiobutton//div[@class='p-radiobutton-box']");
	By optionB = By.xpath("//div//div[4]//div[3]//p-radiobutton//div[@class='p-radiobutton-box']");
    By selectelement = By.xpath("//div//p-dropdown//div//input[@placeholder='Select a Program name']");
	By selectlist = By.xpath("//div[@aria-haspopup='listbox']");
	By list = By.xpath("//li[@role='option']");
	By list1 = By.xpath("//p-dropdownitem[1]//li[@role='option']");
    By cancelbtn=By.xpath("//button[@label='Cancel']");
    By savebtn=By.xpath("//button[@label='Save']");
    By successmsg=By.xpath("//div [@role='alert']");
    By searchbox=By.xpath("//input [@placeholder='Search...']");
   
	public AddNewBatchPages(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void admin_clicks_button(String string) 
    {
		WebElement Addbttn = driver.findElement(addbtn);
		String actual = string;
		String expected = Addbttn.getText(); 
		Assert.assertEquals(actual,expected);
		System.out.println(string+" button with plus sign is clickable in Batch Page");
		Addbttn.click();
    }
	public void the_pop_up_with_fields() 
	{
		Boolean name=driver.findElement(By.xpath("//label[@for='batchName']")).isDisplayed();
		Boolean nametxt=driver.findElement(By.xpath("//input[@id='batchName']")).isDisplayed();
		Assert.assertEquals(name,nametxt);
		System.out.println("BatchName and its corersponding text field are seen in the pop up window");
		
		Boolean description=driver.findElement(By.xpath("//label[@for='batchDescription']")).isDisplayed();
		Boolean descriptiontxt=driver.findElement(By.xpath("//input[@id='batchDescription']")).isDisplayed();
		Assert.assertEquals(description,descriptiontxt);
		System.out.println("BatchDescription and its corersponding text field are seen in the pop up window"); 
		
		Boolean classes=driver.findElement(By.xpath("//input[@id='batchNoOfClasses']")).isDisplayed();
		Boolean classestxt=driver.findElement(By.xpath("//label[@for='batchNoOfClasses']")).isDisplayed();
		Assert.assertEquals(classes,classestxt);
		System.out.println("NoofClasses and its corersponding text field are seen in the pop up window"); 
		
		if(driver.findElement(By.xpath("//label[@for='programName']")).isDisplayed())
		{
		Boolean prognamdrop=driver.findElement(By.xpath("//div//p-dropdown//div//input[@placeholder='Select a Program name']")).isDisplayed();
		Boolean prognamdroplist=driver.findElement(By.xpath("//div[@aria-haspopup='listbox']")).isDisplayed();
		Assert.assertEquals(prognamdrop,prognamdroplist);
		System.out.println("Programname and its corersponding drop-down listbox are seen in the pop up window"); 
		}
				
		if(driver.findElement(By.xpath("//lable[@for='online']")).isDisplayed())
		{
		Boolean statusopta=driver.findElement(By.xpath("//div/div[2][@class='ng-star-inserted']")).isDisplayed();
		Boolean statusoptb=driver.findElement(By.xpath("//div/div[3][@class='ng-star-inserted']")).isDisplayed();
		Assert.assertEquals(statusopta,statusoptb);
		System.out.println("Status and its corersponding Active and Inactive option buttons are seen in the pop up window"); 
		}
		System.out.println("All the required fields are seen in the pop up window to add batch");  
	}
	public void readDataFromSheet(String sheetName,Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException 
	{		
		utilities.excelreader reader = new excelreader();
        List<Map<String, String>> testdata = reader.getData("C:\\Users\\siva1\\git\\Team20_InnovateAThon_Phase2_LMS_UI\\src\\test\\resources\\exceldata\\Add batch excel data.xlsx",sheetName);  
        
        //String batchname1 = testdata.get(rowNumber).get("Name");
        //driver.findElement(batchname).sendKeys(batchname1);   
        
		int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        randombatchname.append((char)randomLimitedInt);
	    }
	    String generatedString = randombatchname.toString();
        driver.findElement(batchname).click();
	    driver.findElement(batchname).sendKeys(generatedString);
	    
        String batchdescrption1 = testdata.get(rowNumber).get("Description");
        driver.findElement(batchdescrption).sendKeys(batchdescrption1);
        
//        driver.findElement(selectlist).click(); 
//        driver.findElement(list1).click(); 
        
        String programgname= testdata.get(rowNumber).get("Program Name"); 
        List<WebElement> programlists = driver.findElements(list);
       	for (WebElement programlist:programlists)
   		{
        String pgname=programlist.getText();
        if(pgname ==  programgname)
        {
             driver.findElement(selectlist).click();         
        	 WebElement element = driver.findElement(list);
        	 Select select = new Select(element);          
             select.selectByValue(programgname);
             //select.selectByVisibleText("Program SDET"); 
             //select.selectByIndex(5);  
        	//programlist.click(); 
             break;             
        }
   		}
          System.out.println("program name from excel is not found in the list,so selecting from the existing link");
          driver.findElement(selectlist).click(); 
          driver.findElement(list1).click();
          Thread.sleep(1000);
                    		      
 		String status1 = testdata.get(rowNumber).get("Status");
        if(status1.equalsIgnoreCase("ACTIVE"))
        { driver.findElement(optionA).click();}
        else if(status1.equalsIgnoreCase("INACTIVE"))
        { driver.findElement(optionB).click();} 
        else
        { driver.findElement(optionB);       }
        
		String noofclasses1 = testdata.get(rowNumber).get("Number of Classes");
		driver.findElement(noofclasses).click();
		driver.findElement(noofclasses).sendKeys(noofclasses1);
	}
	public void clicks_save() throws InterruptedException 
	{  
	    driver.findElement(savebtn).click();
	}
	public void success_message_pop_up() 
	{
		 String smessage = driver.findElement(successmsg).getText();	
		 System.out.println(smessage);	
//		 Thread.sleep(1000);
	}
	public void added_batch_in_data_table() throws InterruptedException 
	{
		 Actions action = new Actions(driver);
		 driver.findElement(searchbox).click(); 
		 action.sendKeys(randombatchname).sendKeys(Keys.ENTER).perform();
		 String randomString = randombatchname.toString();
		 Thread.sleep(1000);
		 String newbatch=driver.findElement(By.xpath("//table//tbody//tr[1]//td[2]")).getText();
		//Assert.assertEquals(randombatchname,newbatch);
		 Assert.assertEquals(randomString,newbatch);
         System.out.println("New batch is created and seen in the manage batch");	 
	}
	public void clicks_cancel() throws InterruptedException 
	{
		driver.findElement(cancelbtn).click();
	}
	public void the_batch_not_added() throws InterruptedException 
	{
		 Actions action = new Actions(driver);
		 driver.findElement(searchbox).click(); 
		 action.sendKeys(randombatchname).sendKeys(Keys.ENTER).perform();
		 String nonsuccessmsg = driver.findElement(By.xpath("//span[@class='p-paginator-current ng-star-inserted']")).getText();
		 System.out.println(nonsuccessmsg);
		 System.out.println("New batch is not added & displayed with success message");	
	}
	public void fields_invalid_values()
	{
	    System.out.println("When User enters Invalid data ");	
	}
	public void error_message() 
	{	
		//String batchdestxt = driver.findElement(batchdescrption).getText();
		//Assert.assertFalse(utilities.GenricUtils.isNumeric(batchdestxt));
		System.out.println(driver.findElement(By.xpath("//p-dialog//div/div//div[2]//div[2]//small")).getText());
		
		String noofclassestxt = driver.findElement(noofclasses).getText();
		WebElement noofclasseserr = driver.findElement(By.xpath("//small[contains(text(),'Number of classes is required.')]"));
		if(noofclassestxt.equals("")) 
		{
		System.out.println("The value should be numeric,it wont accept any other datatype values showing up the following error");	
		System.out.println(noofclasseserr.getText());
		}
		
		Boolean optionbtn1  = driver.findElement(optionA).isSelected();
		Boolean optionbtn2  = driver.findElement(optionB).isSelected();
		WebElement statuserr = driver.findElement(By.xpath("//small[contains(text(),'Status is required.')]"));
		Assert.assertEquals(optionbtn1, optionbtn2);
		System.out.println(statuserr.getText());
	}
	public void mandatory_fields_blank()
	{
		 System.out.println("When User fails to add data to the mandatory fields ");		
	}
	public void error_message1() throws InterruptedException
	{
//		WebElement batchnametxt = driver.findElement(batchname);
//		WebElement batchnameerr = driver.findElement(By.xpath("//small[contains(text(),'Batch Name is required.')]"));
//		if(batchnametxt.getAttribute("value").equals("")){
//		System.out.println(batchnameerr.getText());}
		
		String batchdestxt = driver.findElement(batchdescrption).getText();
		WebElement batchdeserr = driver.findElement(By.xpath("//small[contains(text(),'Batch Description is required.')]"));
		if(batchdestxt.equals("")) {
		System.out.println(batchdeserr.getText());}
		
		String noofclassestxt = driver.findElement(noofclasses).getText();
		WebElement noofclasseserr = driver.findElement(By.xpath("//small[contains(text(),'Number of classes is required.')]"));
		if(noofclassestxt.equals("")) {
		System.out.println(noofclasseserr.getText());}
		
//		String batchpgmtxt = driver.findElement(selectelement).getText();
//		WebElement batchpgmerr = driver.findElement(By.xpath("//small[contains(text(),'Program Name is required.')]"));
//		if(batchpgmtxt.equals("")){
//		System.out.println(batchpgmerr.getText());}
		
		Boolean optionbtn1  = driver.findElement(optionA).isSelected();
		Boolean optionbtn2  = driver.findElement(optionB).isSelected();
		WebElement statuserr = driver.findElement(By.xpath("//small[contains(text(),'Status is required.')]"));
		Assert.assertEquals(optionbtn1, optionbtn2);
		System.out.println(statuserr.getText());
			
}
}


