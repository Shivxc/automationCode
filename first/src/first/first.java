

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
	public static void main(String[] arge) {
		
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (5)");
				WebDriver driver = (WebDriver) new ChromeDriver();
				
				driver.navigate().to("https://www.google.com/");
				
		
	            driver.findElement(By.id("APjFqb"));
				
				
				driver.findElement(By.name("btnK"));
				
			}

		

	}


