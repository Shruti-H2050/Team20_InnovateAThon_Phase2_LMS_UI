package hooks;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.*;
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
    @After(order=0)
    public void quitbrowser()
    {
             driver.quit();
    }
   @After(order=1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
        	try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
                scenario.attach(fileContent, "image/png", "image");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
   }
}

