package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBase {
public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {	
		FileInputStream fis = new FileInputStream("C:\\Users\\siva1\\git\\Team20_InnovateAThon_Phase2_LMS_UI\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		if(driver==null) 
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"));
			{
			driver = new ChromeDriver(); 
			}
//			 if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
//			{
//				 driver = new FirefoxDriver(); 
//			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
		return driver;
	}
}

