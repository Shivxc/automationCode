package day6;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NCDFI extends base{

	

	@Test(priority = 1) // testing activity
	
	public void TitleTest() {
		driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		Assert.assertEquals(driver.getTitle().contains("NeML | User Login"), true);
	}

	@Test(priority = 2) // testing activity
	public void Logintest() {
		driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		driver.findElement(By.name("userId-entry")).sendKeys("U204616");
		driver.findElement(By.name("password-entry")).sendKeys("Neml@123");
		wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[value='Login']"))).click();
		try {
			wt.until(ExpectedConditions.alertIsPresent()).accept();
		} catch (Exception E) {
			System.out.println("Alert not Present");
		}
	}

	@Test(priority = 3) // testing activity
	public void auctionmarket() throws Exception {
		UiOperations ui = new UiOperations(driver);
		Thread.sleep(10000);
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[5]/a/span");
		ui.click("//a[text()='Auction Order Entry']");
		ui.type("//input[@title='Side']", "BUY");
		ui.click("//*[text()='BUY']");
		ui.type("//input[@title='Market Code']", "NCAM");
		ui.click("//li[contains(text(),'NCAM')]");
		ui.type("//input[@title='Commodity Code']", "PULSES");
		ui.click("//*[contains(text(),'PULSES - CHANA')]");
		Thread.sleep(1000);
		ui.type("//input[@title=' Contract Code']", "REV92");
		ui.click("//li[contains(text(),'REV92 - NEW HYBRID REVERSE AUCTION')]");
		Thread.sleep(1000);
		ui.type("//input[@title='Auction Type']", "AUCTION_FORMAT_3");
		ui.click("//*[contains(text(),'AUCTION_FORMAT_3')]");
		ui.type("//input[@name='auctionShortCode']", "mockrev1");
		ui.type("//input[@name='moq']", "100");
		ui.type("//input[@name='price']", "1000");
		ui.type("//input[@placeholder='Minimum Match Qty']","100" );
		ui.type("//input[@placeholder='Quantity']", "10");
		ui.click("//input[@name='biddingStartDate']");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[2]/div/div/ul/li[2]/span/button[1]");
		ui.click("//input[@name='biddingEndDate']");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[6]/div/div/ul/li[2]/span/button[1]");
		ui.type("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[5]/div[2]/textarea", "mockrev");
		ui.click("//input[@name='Delivery End Date']");
		ui.click("//button[text()='Today']");
		ui.type("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[7]/div[8]/div/div/div/neml-type-ahead/div/div/input","FIXED");
		ui.click("//*[contains(text(),'FIXED')]");
		ui.type("//input[@placeholder='Manufacturing Plants']", "COIMBATORE");
		ui.click("//*[contains(text(),'COIMBATORE')]");
		ui.click("//input[@name='Delivery Initiation Date']");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[8]/div[4]/div/div/div/div/div/ul/li[2]/span/button[1]");
		ui.type("//input[@placeholder='GRADE']", "A");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[8]/div[6]/div/div/div/neml-type-ahead/ul/li[1]");
		ui.type("//input[@placeholder='BUYER NAME']", "Shiv");
		ui.type("//input[@placeholder='ACTUAL GRADE']", "A");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[10]/div[1]/div/button");
		
	
		ui.type("(//input[@name='hour'])[3]", "05");
		ui.type("(//input[@name='minute'])[3]", "00");
		ui.type("(//input[@name='hour'])[4]", "05");
		ui.type("(//input[@name='minute'])[4]", "10");
		ui.type("(//input[@name='hour'])[5]", "05");
		ui.type("(//input[@name='minute'])[5]", "10");
		ui.type("(//input[@name='hour'])[6]", "05");
		ui.type("(//input[@name='minute'])[6]", "20");
		ui.type("(//input[@name='hour'])[7]", "05");
		ui.type("(//input[@name='minute'])[7]", "20");
		ui.type("(//input[@name='hour'])[8]", "05");
		ui.type("(//input[@name='minute'])[8]", "30");
		
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[2]/button[2]");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/div[3]/button[2]");
	}
		
		
		
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[5]/a/span")).click();
		//driver.findElement(By.linkText("Auction Order Entry")).click();
	//	driver.findElement(By.xpath("//input[@title='Side']")).sendKeys("BUY");
	//	Thread.sleep(1000);
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='BUY']")));
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[text()='BUY']")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@title='Market Code']")).sendKeys("NCAM");
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'NCAM')]")));
	//	driver.findElement(By.xpath("//li[contains(text(),'NCAM')]")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@title='Commodity Code']")).sendKeys("PULSES");
	//	driver.findElement(By.xpath("//*[contains(text(),'PULSES - CHANA')]")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@title=' Contract Code']")).sendKeys("REV92");
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'REV92')]")));
	//	driver.findElement(By.xpath("//li[contains(text(),'REV92')]")).click();
	//	Thread.sleep(1000);

	/*	driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[2]/div[2]/neml-type-ahead/div/div/input"))
				.sendKeys("AUCTION_FORMAT_3");
		driver.findElement(By.xpath("//*[contains(text(),'AUCTION_FORMAT_3')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='auctionShortCode']")).sendKeys("mockrev1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='moq']")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Minimum Match Qty']")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='biddingStartDate']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[2]/div/div/ul/li[2]/span/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='biddingEndDate']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/div[6]/div/div/ul/li[2]/span/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[5]/div[2]/textarea")).sendKeys("mockrev1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Delivery End Date']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[7]/div[2]/div/div/div/div/div/ul/li[2]/span/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='PRICE PATTERN']")).sendKeys("FIXED");
		driver.findElement(By.xpath("//*[contains(text(),'FIXED')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Manufacturing Plants']")).sendKeys("COIMBATORE");
		driver.findElement(By.xpath("//*[contains(text(),'COIMBATORE')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Delivery Initiation Date']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[8]/div[4]/div/div/div/div/div/ul/li[2]/span/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='GRADE']")).sendKeys("a");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[8]/div[6]/div/div/div/neml-type-ahead/ul/li")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='BUYER NAME']")).sendKeys("SC");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='ACTUAL GRADE']")).sendKeys("A+");
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[value='Submit']"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='hour']")).sendKeys("06");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='minute']")).sendKeys("00");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='--']")).sendKeys("06");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[2]/div/div[5]/div/input[2]")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[3]/div/div[3]/div/input[1]")).sendKeys("06");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[3]/div/div[3]/div/input[2]")).sendKeys("11");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[3]/div/div[5]/div/input[1]")).sendKeys("06");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[3]/div/div[5]/div/input[2]")).sendKeys("15");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[4]/div/div[3]/div/input[1]")).sendKeys("06");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[4]/div/div[3]/div/input[2]")).sendKeys("16");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[4]/div/div[5]/div/input[1]")).sendKeys("06");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/form/div[1]/div[4]/div/div[5]/div/input[2]")).sendKeys("25");
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[value='Confirm ']"))).click();
		Thread.sleep(1000);
	}

	@BeforeTest
	public void beforeTest() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
		wt = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() throws InterruptedException {

		Thread.sleep(5000);

		// driver.quit();
	}
*/
}
