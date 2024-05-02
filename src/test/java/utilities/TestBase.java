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

	public WebDriver WebDriverManager() {

		try {
			if (driver == null) {
				String browser = getBrowser();
				if (browser.equalsIgnoreCase("Chrome")) {
					ChromeOptions options = new ChromeOptions();

					options.addArguments("--headless"); // Removing headless mode
					driver = new ChromeDriver(options);
				} else {

				}
				if (driver != null) {
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get(getUrl());
				}
			}
		} catch (Exception e) {

		}

		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Set driver to null after quitting to prevent reuse
		}
	}

	@Override
	protected void finalize() throws Throwable {

	}
}
