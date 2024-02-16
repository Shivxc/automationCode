package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {
	public WebDriver driver; // driver is global
	public WebDriverWait wt;

	@BeforeTest
	public void beforeTest() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wt=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(5000);

		//driver.quit();
	}

}
