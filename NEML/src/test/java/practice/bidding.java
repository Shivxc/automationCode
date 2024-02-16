package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class bidding extends base1 {

	@Test(priority = 1) // testing activity
	public void Title() {
		Driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Assert.assertEquals(Driver.getTitle().contains("NeML | User Login"), true);
	}
	
	@Test(priority = 2) // testing activity
	public void Login() {
		Driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Driver.findElement(By.name("userId-entry")).sendKeys("U204618");
		Driver.findElement(By.name("password-entry")).sendKeys("Neml@123");
		wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[value='Login']"))).click();
		try {
			wt.until(ExpectedConditions.alertIsPresent()).accept();
		} catch (Exception E) {
			System.out.println("Alert not Present");
		}
	}
		@Test(priority = 3) // testing activity
		public void ascendingmarket() throws Exception { 
			UIopnd ui = new UIopnd(Driver);
			Thread.sleep(10000);
	        ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
	        ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[3]/a");
	        ui.type("//input[@title=' TAC ID']", "TA204618");
			ui.click("//*[text()='TA204618 - AHORE SMALL FARMER PRODUCER COMPANY LIMITED']"); 
	        ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div[1]/h6/button/span");
	        ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/ul/li[6]/span/a");
	      ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/ul/li[6]/span/ul/li[2]/a");
	        ui.type("//input[@title=' TAC ID']", "TA204618");
			ui.click("//*[text()='TA204618 - AHORE SMALL FARMER PRODUCER COMPANY LIMITED']");
			ui.type("//input[@title='Lot Size']", "1");
			ui.click("//*[text()='1']"); 
			ui.type("//input[@placeholder='Bid Qty']", "10");
		
			
		}
  

}
