package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoAutomation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		
		public void beforeTest() throws FileNotFoundException, IOException {
			prop = new Properties();
			prop.load(new FileInputStream("src/test/resources/config.properties"));

			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			op.addArguments("--disable-notifications");
		//	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Will wait whenever required
			wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		}
	}
	

}
