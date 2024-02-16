package day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class titleverification {

	WebDriver driver; // driver is global

	@Test // testing activity
	public void TitleTest() {
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Google");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(5000);

		driver.quit();
	}

}
