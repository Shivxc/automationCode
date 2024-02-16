package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class scrooling extends base {
	@Test
	public void f() throws InterruptedException {

		driver.get("https://www.selenium.dev/");
		WebElement pooja = driver.findElement(By.linkText("@pujagani"));
		// converting driver into javascriptexecutors
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pooja);
		js.executeScript("arguments[0].click();", pooja);
		Thread.sleep(10);
		driver.navigate().back();
		
		driver.get("http://google.com");
	//	String Search = "NEML";
		WebElement E  = driver.findElement(By.name("q"));
		//js.executeScript("arguments[0].setAttribute('value','"+search+"')",
		//driver.findElemet(By.name("q")));
		driver.navigate().refresh();
		try {
			js.executeScript("arguments[0].setAttribute('value','NEML')",E);
			
		}catch(StaleElementReferenceException s) {
			
			js.executeScript("arguments[0].setAttribute('value','NEML')",driver.findElement(By.name("q")));
			
		}
	}
}
