package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public WebDriver driver = null;
	private String username;
	private String password;
	private String url;
	public Properties m_prop;

	public TestBase() throws IOException {
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//resources//global.properties");
			m_prop = new Properties();
			m_prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
		System.out.println("TestBase called ........................");
		WebDriverManager();

	}

	public String getUsername() {

		username = m_prop.getProperty("username");

		return username;
	}

	public String getPassword() {
		password = m_prop.getProperty("password");

		return password;
	}

	public String getUrl() {
		return m_prop.getProperty("Url");
	}

	public String getBrowser() {
		return m_prop.getProperty("browser");
	}

	public WebDriver WebDriverManager(){
		// FileInputStream fis = new FileInputStream(
		// System.getProperty("user.dir") +
		// "//src//test//resources//global.properties");
		// Properties prop = new Properties();
		// m_prop.load(fis);
		// String url = m_prop.getProperty("Url");
		// password = prop.getProperty("password");

		/*
		 * if (driver == null) { ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless"); //
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(options);
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get(url);
		 * 
		 * }
		 */
		try {
			if (driver == null) {
				String browser = getBrowser();
				if (browser.equalsIgnoreCase("Chrome")) {
					ChromeOptions options = new ChromeOptions();
					// Set web driver path
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\Users\\ajith\\Downloads\\chrome-headless-shell-win64\\chrome-headless-shell-win64\\chrome-headless-shell");
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\Users\\ajith\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
					options.addArguments("--headless"); // Removing headless mode
					// WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver(options);
				} else {
					//throw new IllegalArgumentException("Unsupported browser: " + browser);
				}
				if (driver != null) {
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get(getUrl());
				}
			}
		} catch( Exception e) {
			System.out.println("###################################" + e.getMessage());
		} //finally {
			//quitDriver();
		//}
		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			System.out.println("quitDriver called ........................");
			driver.quit();
			driver = null; // Set driver to null after quitting to prevent reuse
		}
	}
	@Override 
	protected void finalize() throws Throwable {
	    // TODO Auto-generated method stub
	    // do some crazy stuff here
		//quitDriver();
		System.out.println("finalize called ........................");
		
	}
}
