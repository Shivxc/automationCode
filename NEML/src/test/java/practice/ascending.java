package practice;

import org.testng.annotations.Test;

import day6.UiOperations;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ascending extends base1 {

	@Test(priority = 1) // testing activity
	public void Title() {
		Driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Assert.assertEquals(Driver.getTitle().contains("NeML | User Login"), true);
	}

	@Test(priority = 2) // testing activity
	public void Login() {
		Driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Driver.findElement(By.name("userId-entry")).sendKeys("U204617");
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
        ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[1]/a");
        ui.type("//input[@title='Please Enter Side']", "SELL");
		ui.click("//*[text()='SELL']"); 
		ui.type("//input[@title='Market Code']", "NCAM");
		ui.click("//li[contains(text(),'NCAM')]");
		ui.type("//input[@title='Commodity Code']", "SMPAAVIN");
		ui.click("//*[contains(text(),'SMPAAVIN - SMP')]");
		Thread.sleep(1000);
		ui.type("//input[@title=' Contract Code']", "AMASCEND");
		ui.click("//li[contains(text(),'AMASCEND - ASCENDING MARKET CONTRACT')]");
		Thread.sleep(1000);
		ui.type("//input[@name='auctionShortCode']", "mockrev1");
		ui.type("//input[@name='price']", "1000");
		ui.type("//input[@placeholder='Maximum Order Qty']", "1000");
		ui.type("//input[@placeholder='Minimum Match Qty']", "100");
		ui.type("//input[@placeholder='Quantity']","10" );
		ui.click("//input[@name='biddingStartDate']");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[3]/div[6]/div/div/ul/li[2]/span/button[1]");
		ui.type("(//input[@name='hour'])[3]", timecal.getTime(10)[0]);
		ui.type("(//input[@name='minute'])[3]", timecal.getTime(10)[1]);
		if (timecal.checkTime() < 12) {
			ui.click("(//input[@name='mode'])[3]");
			ui.type("(//input[@name='mode'])[3]", "A");
		
		
	//	ui.type("(//input[@name='hour'])", "05");
		//ui.type("(//input[@name='minute'])", "48");
		ui.click("//input[@name='biddingEndDate']");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[2]/div/div/ul/li[2]/span/button[1]");
		ui.type("(//input[@name='hour'])[2]", "07");
		ui.type("(//input[@name='minute'])[2]", "50");
		ui.type("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[6]/textarea", "Test");
		ui.click("//input[@name='Delivery End Date']");	
		ui.click("//button[text()='Today']");
		ui.type("//input[@placeholder='Location']", "CHENNAI");
		ui.click("//*[contains(text(),'CHENNAI')]");
		ui.type("//input[@placeholder='Enter PRICE PATTERN']", "FIXED");
		ui.click("//*[contains(text(),'FIXED')]");
		ui.click("//input[@name='Delivery Initiation Date']");	
		ui.click("//button[text()='Today']");
		ui.type("//input[@placeholder='Enter BRANDS']", "A1");
		ui.click("//*[contains(text(),'A1')]");
		ui.type("//input[@placeholder='Enter Manufacturing Plants']", "KURLA");
		ui.click("//*[contains(text(),'KURLA')]");
		ui.click("//input[@name='Oldest date of produced']");	
		ui.click("//button[text()='Today']");
		ui.type("//input[@placeholder='Enter PACK SIZE']", "1L");
		ui.click("//*[contains(text(),'1L')]");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[10]/div[1]/div/button");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/div[3]/button[2]");
		Thread.sleep(1000);
        ui.click("/html/body/div[2]/div[1]/div[1]/div/ul/ul/li[4]/a");
	    ui.click("/html/body/div[2]/div[1]/div[1]/div/ul/ul/li[4]/ul/li[6]/a");
	}
	}
	@Test(priority = 4) // testing activity
	public void Loginadmin() {
		Driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Driver.findElement(By.name("userId-entry")).sendKeys("Uat1");
		Driver.findElement(By.name("password-entry")).sendKeys("Neml@123");
		wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[value='Login']"))).click();
		try {
			wt.until(ExpectedConditions.alertIsPresent()).accept();
		} catch (Exception E) {
			System.out.println("Alert not Present");
		}
	}
	@Test(priority = 5) // testing activity
	public void loadplanorder() throws Exception {
		UIopnd ui = new UIopnd(Driver);
		Thread.sleep(10000);
        ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[3]/a/span");
        ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[3]/ul/li[11]/a");
        ui.type("//input[@title='Market Code']", "NCAM");
		ui.click("//li[contains(text(),'NCAM')]");
		ui.type("//input[@title='Commodity Code']", "SMPAAVIN");
		ui.click("//*[contains(text(),'SMPAAVIN - SMP')]");
		Thread.sleep(500);
		ui.type("//input[@title=' Contract Code']", "AMASCEND");
		ui.click("//li[contains(text(),'AMASCEND - ASCENDING MARKET CONTRACT')]");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div[4]/a[1]");
		ui.type("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[8]/div[2]/div[3]/div/div/input", "n");
		Thread.sleep(500);
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/div");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/button[2]");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/button[3]/strong");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div/div/div[3]/button[2]");
		ui.click("/html/body/div[2]/div[1]/div[1]/div/ul/ul/li[4]/a");
	    ui.click("/html/body/div[2]/div[1]/div[1]/div/ul/ul/li[4]/ul/li[6]/a");
	    
	}
			
}