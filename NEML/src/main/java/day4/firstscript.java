package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://blazedemo.com");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
