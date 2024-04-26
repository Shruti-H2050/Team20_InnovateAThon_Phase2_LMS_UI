package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.TestBase;

public class Hooks {
	private WebDriver driver;

	public Hooks(TestBase testBase) throws IOException {
		this.driver = testBase.WebDriverManager();
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			takeScreenshot(scenario);
		}
		if (driver != null) {
			driver.quit();
		}
	}

	private void takeScreenshot(Scenario scenario) {
		try {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
