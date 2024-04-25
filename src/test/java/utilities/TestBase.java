package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    public WebDriver driver;
   
   // private String url = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/";
    
   

   /* public String getUrl() {
        return url;
    }*/

    public WebDriver WebDriverManager() throws IOException {
    	
    	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
    		Properties prop = new Properties();
    		prop.load(fis);
    		String url = prop.getProperty("Url");
    		if(driver==null) 
    		{
    			if(prop.getProperty("browser").equalsIgnoreCase("chrome"));
    			{
    			driver = new ChromeDriver(); 
    			
    			}
				/*
				 * if(prop.getProperty("browser").equalsIgnoreCase("firefox")) { //firefox code
				 * }
				 */
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    			 driver.get(url);
    		}
    		return driver;
    		
			/*
			 * if (driver == null) { ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--headless"); WebDriverManager.chromedriver().setup();
			 * driver = new ChromeDriver(options); driver.manage().window().maximize();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 * driver.get(url); } return driver;
			 */
}
}

