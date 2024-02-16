package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ncdfi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // starting Browser
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15)); // wait decleration

		driver.get("https://ncdfiuat.neml.xyz/SpotLite/"); // for opening url
		// Thread.sleep(4000);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("User ID")));

		driver.findElement(By.name("User ID")).sendKeys("U204615");

		driver.findElement(By.name("Password")).sendKeys("Neml@123");

		driver.findElement(By.cssSelector("button[value = 'Login']")).click();

		///driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();
		// Thread.sleep(3000);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));

	//	driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(6000);

	}

}
