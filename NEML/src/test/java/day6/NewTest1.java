package day6;

import org.testng.annotations.Test;

import day4.loginpage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest1 {

	WebDriver driver; // driver is global

	@Test(priority = 1) // testing activity
	public void TitleTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	@Test(priority = 2) // testing activity
	public void Logintest() {
	loginpage lp = new loginpage(driver);
	lp.dologin("admin","admin123");
	Assert.assertTrue(driver.getCurrentUrl().contains("viewEmployeeList"));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(5000);

		driver.quit();
	}

}
