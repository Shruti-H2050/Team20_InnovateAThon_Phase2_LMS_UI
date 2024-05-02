package pageObjects;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class AddNewUserPages {	
static StringBuilder randombatchname;
public static WebDriver driver;
By userbtn = By.xpath("//button[3]/span[@class='mat-button-wrapper']");
By addbtn = By.xpath("//button[@label='Add New User']");
By manageheader = By.xpath("//div[contains(text(),'Manage User')]");
By userdetails = By.xpath(" //span[contains(text(),'User Details')]");
By popup = By.xpath("//div[@role='dialog']");
By list = By.xpath("//li[@aria-label='R01']");
By list1 = By.xpath("//li[@aria-label='Active']");
By list2 = By.xpath("//li[@aria-label='NA']");
By selectlist = By.xpath("//mat-card-content/div[3]/div[1]/div/p-dropdown/div/span[contains(text(),'Select Role')]");
By selectlist1 = By.xpath("//span[contains(text(),'Select Role Status')]");
By selectlist2 = By.xpath("//span[contains(text(),'Select Visa Status')]");
static  WebElement fnametxt;
public AddNewUserPages(WebDriver driver) 
{
    this.driver = driver;
}
public void clicks_userbutton(String string) throws InterruptedException 
{
	Thread.sleep(2000);
	String actual=driver.findElement(userbtn).getText();
	String expected=string;
	Assert.assertEquals(actual,expected);
	System.out.println("User Button is displayed and clickable");
	driver.findElement(userbtn).click();
}
public void admin_manage_user_page()
{
	WebElement manageuserhdr = driver.findElement(manageheader);
	manageuserhdr.isDisplayed();
	System.out.println("Admin lands on Manage User Page and should see Manage User in the Header");
}
public void admin_clicks_button(String string)
{
	WebElement Addbttn = driver.findElement(addbtn);
	Addbttn.click();
	System.out.println(string+" button with plus sign is clickable in Batch Page");	
}
public void pop_up_with_fields() 
{
	WebElement userpopup = driver.findElement(popup);
	userpopup.isDisplayed();
	//System.out.println(userpopup.getText()+" pop up is displayed with all required fields");
	WebElement userdtls = driver.findElement(userdetails);
	userdtls.isDisplayed();
	//System.out.println(userdtls.getText()+" is displayed at the top of the popup dialog window");
	
	WebElement fname = driver.findElement(By.xpath("//span[contains(text(),'First name')]"));
	Boolean firstname=fname.isDisplayed();
	if(firstname.TRUE)
	{
		System.out.println(fname.getText()+" is seen in the pop up window");
	}
	WebElement mname = driver.findElement(By.xpath("//span[contains(text(),'Middle name')]"));
	Boolean middlename=mname.isDisplayed();
	if(middlename.TRUE)
	{
		System.out.println(mname.getText()+" is seen in the pop up window" );
	}
	WebElement lname = driver.findElement(By.xpath("//span[contains(text(),'Last name')]"));
	Boolean lastname=lname.isDisplayed();
	if(lastname.TRUE)
	{
		System.out.println(lname.getText()+" is seen in the pop up window");
	}
	WebElement loc = driver.findElement(By.xpath("//span[contains(text(),'Location')]"));
	Boolean location=loc.isDisplayed();
	if(location.TRUE)
	{
		System.out.println(loc.getText()+" is seen in the pop up window");
	}
	WebElement phone1 = driver.findElement(By.xpath("//span[contains(text(),'Phone no')]"));
	Boolean phonenumber=phone1.isDisplayed();
	if(phonenumber.TRUE)
	{
		System.out.println(phone1.getText()+" is seen in the pop up window");
	}
	WebElement linked1 = driver.findElement(By.xpath("//span[contains(text(),'LinkedIn Url')]"));
	Boolean linkedin=linked1.isDisplayed();
	if(linkedin.TRUE)
	{
		System.out.println(linked1.getText()+" is seen in the pop up window");
	}
	WebElement emailad1 = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	Boolean email=emailad1 .isDisplayed();
	if(email.TRUE)
	{
		System.out.println("emailid is seen in the pop up window");
	}
	WebElement under = driver.findElement(By.xpath("//span[contains(text(),'Under Graduate')]"));
	Boolean ug=under.isDisplayed();
	if(ug.TRUE)
	{
		System.out.println(under.getText()+" is seen in the pop up window");
	}
	WebElement post = driver.findElement(By.xpath("//span[contains(text(),'Post Graduate')]"));
	Boolean pg=post.isDisplayed();
	if(pg.TRUE)
	{
		System.out.println(post.getText()+" is seen in the pop up window");
	}
	WebElement comment = driver.findElement(By.xpath("//span[contains(text(),'User Comments')]"));
	Boolean ucomments=comment.isDisplayed();
	if(ucomments.TRUE)
	{
		System.out.println(comment.getText()+" is seen in the pop up window");
	}
	WebElement time = driver.findElement(By.xpath("//span[contains(text(),'Time Zone')]"));
	Boolean Timezone=time.isDisplayed();
	if(Timezone.TRUE)
	{
		System.out.println(time.getText()+" is seen in the pop up window");
	}
	WebElement role = driver.findElement(By.xpath("//mat-card-content/div[3]/div[1]/div/label[contains(text(),'User Role')]"));
	Boolean userrole=role.isDisplayed();
	if(userrole.TRUE)
	{
		System.out.println(role.getText()+" is seen in the pop up window");
	}
	WebElement status = driver.findElement(By.xpath("//label[contains(text(),'User Role Status')]"));
	Boolean userstatus=status.isDisplayed();
	if(userstatus.TRUE)
	{
		System.out.println(status.getText()+" is seen in the pop up window");
	}
	WebElement visa = driver.findElement(By.xpath("//label[contains(text(),'User Visa Status')]"));
	Boolean uservisa=visa.isDisplayed();
	if(uservisa.TRUE)
	{
		System.out.println(visa.getText()+" is seen in the pop up window");
	}
}
public void pop_up_text_boxes()
{	
	WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
	Boolean firstname=fnametxt.isDisplayed();
	if(firstname.TRUE)
	{
		System.out.println("Firstname text line is seen in the pop up window");
	}
	WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
	Boolean middlename=mnametxt.isDisplayed();
	if(middlename.TRUE)
	{
		System.out.println("Middlename text line is seen in the pop up window" );
	}
	WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
	Boolean lastname=lnametxt.isDisplayed();
	if(lastname.TRUE)
	{
		System.out.println("Lastname text line is seen in the pop up window");
	}
	WebElement loctxt = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
	Boolean location=loctxt.isDisplayed();
	if(location.TRUE)
	{
		System.out.println("Location text line is seen in the pop up window");
	}
	WebElement phone1txt = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
	Boolean phonenumber=phone1txt.isDisplayed();
	if(phonenumber.TRUE)
	{
		System.out.println("Phonenumber text line is seen in the pop up window");
	}
	WebElement linked1txt = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
	Boolean linkedin=linked1txt.isDisplayed();
	if(linkedin.TRUE)
	{
		System.out.println("LinkedIn text line is seen in the pop up window");
	}
	WebElement emailad1txt = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
	Boolean email=emailad1txt.isDisplayed();
	if(email.TRUE)
	{
		System.out.println("Email address text line is seen in the pop up window");
	}
	WebElement undertxt = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
	Boolean ug=undertxt.isDisplayed();
	if(ug.TRUE)
	{
		System.out.println("Undergraduate text line is seen in the pop up window");
	}
	WebElement posttxt = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
	Boolean pg=posttxt.isDisplayed();
	if(pg.TRUE)
	{
		System.out.println("Postgraduate text line is seen in the pop up window");
	}
	WebElement commenttxt = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
	Boolean ucomments=commenttxt.isDisplayed();
	if(ucomments.TRUE)
	{
		System.out.println("Usercomment text line is seen in the pop up window");
	}
	WebElement timetxt = driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
	Boolean Timezone=timetxt.isDisplayed();
	if(Timezone.TRUE)
	{
		System.out.println("Timezone textline is seen in the pop up window");
	}
}
public void drop_downs_pop_up()
{
	WebElement role = driver.findElement(By.xpath("//mat-card-content/div[3]/div[1]/div/p-dropdown/div/span[contains(text(),'Select Role')]"));
	Boolean userrole=role.isDisplayed();
	if(userrole.TRUE)
	{
		System.out.println(role.getText()+" dropdown list is seen in the pop up window");
	}
	WebElement status = driver.findElement(By.xpath("//span[contains(text(),'Select Role Status')]"));
	Boolean userstatus=status.isDisplayed();
	if(Boolean.TRUE)
	{
		System.out.println(status.getText()+" dropdown list is seen in the pop up window");
	}
	WebElement visa = driver.findElement(By.xpath("//span[contains(text(),'Select Visa Status')]"));
	Boolean uservisa=visa.isDisplayed();
	if(uservisa.TRUE)
	{
		System.out.println(visa.getText()+" dropdown list is seen in the pop up window");
	}
}
	public void admin_on_user_details_pop_up() 
	{
		WebElement Addbttn = driver.findElement(addbtn);
		Addbttn.click();
		System.out.println("Admin is on User Details pop up dialog window");
	}

	public void admin_mandatory_fields_submit_button() throws InterruptedException 
	{
		WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.sendKeys("TESTFN");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.sendKeys("TESTMN");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.sendKeys("TESTLN");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.sendKeys("AUSTIN");
		 
		
	    Random generator = new Random();
	    Object num1 = generator.nextInt(7) + 1;   
	    Object num2 = generator.nextInt(8); 
	    Object num3 = generator.nextInt(8);
	    Object set2 = generator.nextInt(643) + 100;
	    Object set3 = generator.nextInt(8999) + 1000;
	    String phonenumber1 = num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
	    Long pn=Long.parseLong(phonenumber1);
	    
		WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
		phone.sendKeys(String.valueOf(pn));
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.sendKeys("https://www.linkedin.com/in/MaryPoppins");
	    
		driver.findElement(selectlist).click();        
   	    driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	    driver.findElement(list2).click();
   	    
   	    int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) 
	    {
	     int randomLimitedInt = leftLimit + (int) 
	     (random.nextFloat() * (rightLimit - leftLimit + 1));
	      randombatchname.append((char)randomLimitedInt);        
	    }
	    String generatedString = randombatchname.toString();     
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		//email.sendKeys("sivfer1@gmail.com");
		email.sendKeys(generatedString+"@gmail.com");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.sendKeys("BSC");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.sendKeys("MSC");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.sendKeys("TESTING");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.sendKeys("EST");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	public void success_message() 
	{
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
	}
	public void admin_skips_mandatory_field() throws InterruptedException 
	{
		fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.click();
		fnametxt.sendKeys("");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.click();
		mnametxt.sendKeys("");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.click();
		lnametxt.sendKeys("");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.click();
		location.sendKeys("");  
		WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
		phone.click();
		phone.sendKeys("");
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.click();
		Linkedin.sendKeys("");
	    
		driver.findElement(selectlist).click();        
   	    //driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    //driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	   // driver.findElement(list2).click();
	       
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		email.click();
		email.sendKeys("");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.click();
		Ug.sendKeys("");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.click();
		Pg.sendKeys("");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.click();
		comment.sendKeys("");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.click();
		timezone.sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public static void error_message_highlighed() 
	{
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-0']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-1']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-2']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-3']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-4']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-5']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-7']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-8']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-9']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-error-10']")).getText());
	}

	public void invalid_data_all_fields() 
	{
		WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.click();
		fnametxt.sendKeys("8783y47");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.click();
		mnametxt.sendKeys("875y279");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.click();
		lnametxt.sendKeys("2tt75672");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.click();
		location.sendKeys("y5894258");  
		WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
		phone.click();
		phone.sendKeys("dkjbvkjdbkj");
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.click();
		Linkedin.sendKeys("u24t7t489");
	    
		driver.findElement(selectlist).click();        
   	    driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	    driver.findElement(list2).click();
	       
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		email.click();
		email.sendKeys("cheeuofhi@gmail.com");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.click();
		Ug.sendKeys("65");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.click();
		Pg.sendKeys("5454");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.click();
		comment.sendKeys("6767871324534");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.click();
		timezone.sendKeys("68678978");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
	public void error_message_user_not_created()
	{
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		System.out.println("User is not created");
	}
	public void submit_button_without_data() throws InterruptedException 
	{
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//button[@type='submit']")));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	public void error_message1() 
	{
		System.out.println("User is not created");
	}

	public void close_button() 
	{
		WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.sendKeys("CHECKno");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.sendKeys("TESTMN");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.sendKeys("TESTLN");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.sendKeys("AUSTIN");
		 
		
 Random generator = new Random();
Object num1 = generator.nextInt(7) + 1;   
Object num2 = generator.nextInt(8); 
Object num3 = generator.nextInt(8);
Object set2 = generator.nextInt(643) + 100;
Object set3 = generator.nextInt(8999) + 1000;
String phonenumber1 = num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
Long pn=Long.parseLong(phonenumber1);

WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
phone.sendKeys(String.valueOf(pn));
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.sendKeys("https://www.linkedin.com/in/MaryPoppins");
	    
		driver.findElement(selectlist).click();        
   	    driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	    driver.findElement(list2).click();
   	    
   	    int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) 
	    {
	     int randomLimitedInt = leftLimit + (int) 
	     (random.nextFloat() * (rightLimit - leftLimit + 1));
	      randombatchname.append((char)randomLimitedInt);        
	    }
	    String generatedString = randombatchname.toString();     
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		//email.sendKeys("slivfer1@gmail.com");
		email.sendKeys(generatedString+"@gmail.com");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.sendKeys("BSC");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.sendKeys("MSC");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.sendKeys("TESTING");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.sendKeys("EST");
		 driver.findElement(By.xpath("//button[@color='warn']")).click();
		 
//		 WebElement userpopup = driver.findElement(popup);
////		 if(userpopup.isDisplayed() == false)
//		 Assert.assertEquals(userpopup.isDisplayed(),false);
		 
		 WebElement searchbox=driver.findElement(By.xpath("//input[@id='filterGlobal']"));
		 Actions action = new Actions(driver);
		 searchbox.clear();
		 searchbox.click();
		 action.sendKeys("kite").sendKeys(Keys.ENTER).perform();
		 String nonsuccessmsg = driver.findElement(By.xpath("//span[contains(text(),'Showing 0 to 0 of 0 entries')]")).getText();
		 System.out.println(nonsuccessmsg);
	}
	public void user_details_popup_closed() 
	{
		 System.out.println("New batch is not added & displayed with success message");	
		 System.out.println("User details pop up window will be closed without saving the details entered");
	}

	public void admin_clicks_cancel_button() 
	{
		WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.sendKeys("TV");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.sendKeys("TESTMN");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.sendKeys("TESTLN");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.sendKeys("AUSTIN");
		 
		
        Random generator = new Random();
	    Object num1 = generator.nextInt(7) + 1;   
	    Object num2 = generator.nextInt(8); 
	    Object num3 = generator.nextInt(8);
	    Object set2 = generator.nextInt(643) + 100;
	    Object set3 = generator.nextInt(8999) + 1000;
	    String phonenumber1 = num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
	    Long pn=Long.parseLong(phonenumber1);
	    
		WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
		phone.sendKeys(String.valueOf(pn));
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.sendKeys("https://www.linkedin.com/in/MaryPoppins");
	    
		driver.findElement(selectlist).click();        
   	    driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	    driver.findElement(list2).click();
   	    
        int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) 
	    {
	     int randomLimitedInt = leftLimit + (int) 
	     (random.nextFloat() * (rightLimit - leftLimit + 1));
	      randombatchname.append((char)randomLimitedInt);        
	    }
	    String generatedString = randombatchname.toString();           
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		email.sendKeys(generatedString+"@gmail.com");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.sendKeys("BSC");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.sendKeys("MSC");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.sendKeys("TESTING");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.sendKeys("EST");
		 
		driver.findElement(By.xpath("//button[@color='warn']")).click();
		 
//		 WebElement userpopup = driver.findElement(popup);
////		 if(userpopup.isDisplayed() == false)
//		 Assert.assertEquals(userpopup.isDisplayed(),false);
		 
		 WebElement searchbox=driver.findElement(By.xpath("//input[@id='filterGlobal']"));
		 Actions action = new Actions(driver);
		 searchbox.clear();
		 searchbox.click();
		 action.sendKeys("TV").sendKeys(Keys.ENTER).perform();
		 String nonsuccessmsg = driver.findElement(By.xpath("//span[contains(text(),'Showing 0 to 0 of 0 entries')]")).getText();
		 System.out.println(nonsuccessmsg);
	}

	public void popup_disappears_not_adding_user() 
	{
		 System.out.println("New batch is not added & displayed with success message");	
		 System.out.println("User details pop up window will be closed without saving the details entered");
	}

	public void valid_values_submit() throws InterruptedException 
	{

		WebElement fnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userFirstName']"));
		fnametxt.sendKeys("CHECK");
		WebElement mnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userMiddleName']"));
		mnametxt.sendKeys("TESTMN");
		WebElement lnametxt = driver.findElement(By.xpath("//input[@formcontrolname='userLastName']"));
		lnametxt.sendKeys("TESTLN");
		WebElement location = driver.findElement(By.xpath("//input[@formcontrolname='userLocation']"));
		location.sendKeys("AUSTIN");
		 
		
	    Random generator = new Random();
	    Object num1 = generator.nextInt(7) + 1;   
	    Object num2 = generator.nextInt(8); 
	    Object num3 = generator.nextInt(8);
	    Object set2 = generator.nextInt(643) + 100;
	    Object set3 = generator.nextInt(8999) + 1000;
	    String phonenumber1 = num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
	    Long pn=Long.parseLong(phonenumber1);
	    
		WebElement phone = driver.findElement(By.xpath("//input[@formcontrolname='userPhoneNumber']"));
		phone.sendKeys(String.valueOf(pn));
		WebElement Linkedin = driver.findElement(By.xpath("//input[@formcontrolname='userLinkedinUrl']"));
		Linkedin.sendKeys("https://www.linkedin.com/in/MaryPoppins");
	    
		driver.findElement(selectlist).click();        
   	    driver.findElement(list).click();
        driver.findElement(selectlist1).click();        
   	    driver.findElement(list1).click();
        driver.findElement(selectlist2).click();        
   	    driver.findElement(list2).click();
   	    
   	    int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) 
	    {
	     int randomLimitedInt = leftLimit + (int) 
	     (random.nextFloat() * (rightLimit - leftLimit + 1));
	      randombatchname.append((char)randomLimitedInt);        
	    }
	    String generatedString = randombatchname.toString();     
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='userLoginEmail']"));
		email.sendKeys(generatedString +"@gmail.com");
		//email.sendKeys(generatedString+"@gmail.com");
		WebElement Ug = driver.findElement(By.xpath("//input[@formcontrolname='userEduUg']"));
		Ug.sendKeys("BSC");
		WebElement Pg = driver.findElement(By.xpath("//input[@formcontrolname='userEduPg']"));
		Pg.sendKeys("MSC");
		WebElement comment = driver.findElement(By.xpath("//input[@formcontrolname='userComments']"));
		comment.sendKeys("TESTING");
		WebElement timezone= driver.findElement(By.xpath("//input[@formcontrolname='userTimeZone']"));
		timezone.sendKeys("EST");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String successmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		 System.out.println(successmsg);
		 Thread.sleep(3000);
//		 WebElement searchbox=driver.findElement(By.xpath("//input[@id='filterGlobal']"));
//		 Actions action = new Actions(driver);
//		 searchbox.clear();
//		 searchbox.click();
//		 action.sendKeys(generatedString).sendKeys(Keys.ENTER).perform();
//		 String nonsuccessmsg = driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")).getText();
//		 System.out.println(nonsuccessmsg);
	}

	public void the_newly_added_user_page() 
	{
		 String successmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		 System.out.println(successmsg);
	}
}



