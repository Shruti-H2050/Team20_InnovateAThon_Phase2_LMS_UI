package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    private WebDriver driver;

    public Hooks() {
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }

    private WebDriver initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Set headless mode
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @After
    public void AfterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario);
        }
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterStep
    public void AddScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario);
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
