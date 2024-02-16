package january;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
	public static void main(String[] arge) {
		
				System.setProperty("webdriver.chrome.driver","D:\\chrome-win32\\chrome-win32\\chrome.exe");
				WebDriver driver = new ChromeDriver();
			
			//    driver.navigate().to("http://www.google.com/");
				driver.get("www.javatpoint.com")  ;
			          
	             try {
					driver.wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//    driver.findElement(By.id("input")).sendKeys("javatpoint tutorials");  
			    driver.findElement(By.xpath("/html/body/ntp-app//div/div[2]/ntp-realbox//div/input")).sendKeys("javatpoint tutorials");  
			          
			    
			    ((WebElement) driver).sendKeys(Keys.ENTER);
			}

		

	}


