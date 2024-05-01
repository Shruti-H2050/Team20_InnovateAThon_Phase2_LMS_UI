package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class DashboardPages {
	private WebDriver driver;

	private By header = By.xpath("//div[@class='box' and contains(text(), 'Manage Program')]");
	private By dashboardpageTitle = By.xpath("//span[contains(text(), 'LMS - Learning Management System')]");
	By navigationBar = By.xpath("//mat-toolbar");
	By navigationBartext = By.xpath("//span[@class='mat-button-wrapper' and text()='Program']");
	By navigationBartextBatch = By.xpath("//span[@class='mat-button-wrapper' and text()='Batch']");
	By navigationBartextUser = By.xpath("//span[@class='mat-button-wrapper' and text()='User']");
	By navigationBartextLogout = By.xpath("//span[@class='mat-button-wrapper' and text()='Logout']");

	public DashboardPages(WebDriver driver) {
		this.driver = driver;

	}

	public String headerverification() {

		WebElement headerElement = driver.findElement(header);
		String headerText = headerElement.getText();

		if (headerText.contains("Manage Program")) {
			System.out.println("Header contains 'Manage Program'");
		} else {
			System.out.println("Header does not contain 'Manage Program'");
		}
		return headerText;
	}

	public String getHeader() {
		try {
			WebElement headerElement = driver.findElement(header);
			return headerElement.getText();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Header element not found");
			return "";
		}

	}

	public String getTitle() {

		WebElement getTitle = driver.findElement(dashboardpageTitle);
		String titleText = getTitle.getText();
		if (titleText.contains("LMS - Learning Management System")) {
			System.out.println("Title contains 'LMS - Learning Management System");
		} else {
			System.out.println("Title does not contain 'LMS - Learning Management System'");
		}
		return titleText;
	}

	public Point getTitleLocation() {

		WebElement getTitle = driver.findElement(dashboardpageTitle);

		Point titleLocation = getTitle.getLocation();

		return titleLocation;
	}

	public String navigationbarspelltest() {
		WebElement navigationBarElement = driver.findElement(navigationBar);
		String navigationText = navigationBarElement.getText();
		navigationText = navigationText.replace("\n", " | ");
		return navigationText;
	}

	public String Titlespelltest() {

		WebElement title = driver.findElement(dashboardpageTitle);

		return title.getText();

	}

	public Point getNavigationbarLocation() {

		WebElement navigationBarloc = driver.findElement(navigationBartext);

		Point navigationBarlocation = navigationBarloc.getLocation();

		return navigationBarlocation;
	}

	public String getFirstNavigationBarItemsLocation() {
		WebElement navigationBarElement = driver.findElement(navigationBartext);
		return navigationBarElement.getText();

	}

	public String getSecondNavigationBarItemsLocation() {
		WebElement navigationBarElement = driver.findElement(navigationBartextBatch);
		return navigationBarElement.getText();

	}

	public String getthirdNavigationBarItemsLocation() {
		WebElement navigationBarElement = driver.findElement(navigationBartextUser);
		return navigationBarElement.getText();

	}

	public String getfourthNavigationBarItemsLocation() {
		WebElement navigationBarElement = driver.findElement(navigationBartextLogout);
		return navigationBarElement.getText();

	}

}