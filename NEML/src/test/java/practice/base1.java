package practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class base1 {
	public WebDriver Driver; // driver is global
	public WebDriverWait wt;

 
  
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		Driver = new ChromeDriver(op);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wt=new WebDriverWait(Driver, Duration.ofSeconds(10));
	 
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	 
		Thread.sleep(5000);

		//driver.quit();
  }

}
