package continous_page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import continous_utils.timecalculator;
import continous_utils.uioperation;

public class orderentry {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public orderentry(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	By e_ascendingMarket = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
	By e_auctionEntry = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[1]/a");
	By e_side = By.xpath("//input[@title='Please Enter Side']");
	By e_Market = By.xpath("//input[@title='Market Code']");
	By e_comm = By.xpath("//*[@title='Commodity Code']");

	public void placeOrder() throws InterruptedException {
		ui = new uioperation(driver);
		ui.click(e_ascendingMarket);
		ui.click(e_auctionEntry);
		ui.type(e_side, "SELL");
		ui.click("//*[text()='SELL']");
		ui.type(e_Market, "ASC");
		ui.click("//li[contains(text(),'ASC')]");
		ui.type(e_comm, "MCKASC");
		ui.click("//li[contains(text(),'MCKASC')]");
		ui.type("//input[@title=' Contract Code']", "MCKASC");
		ui.click("//ul[@id='typeahead-dropdown']/li[contains(text(),'MCKASC - ASCENDING MARKET CONTRACT')]");

		ui.click("//input[@title=' TAC ID']");
		ui.type("//input[@title=' TAC ID']", "TA204618");
		ui.click("//ul[@id='typeahead-dropdown']/li[contains(text(),'TA204618')]");
		ui.type("//input[@name='auctionShortCode']", "mock-do not bid ");
  	    ui.type("//input[@name='price']", "1000");
	    ui.type("//input[@name='moq']", "500");
		ui.type("//input[@placeholder='Minimum Match Qty']", "100");
		ui.type("//input[@placeholder='Quantity']", "20");
		ui.click("(//i[@class='fa fa-calendar'])[1]");
		ui.click("//button[text()='Today']");
		ui.type("(//input[@name='hour'])[1]", timecalculator.getTime(12)[0]);
		ui.type("(//input[@name='minute'])[1]", timecalculator.getTime(12)[1]);
		if (timecalculator.checkTime() < 12) {
			ui.click("(//input[@name='mode'])[1]");
			ui.type("(//input[@name='mode'])[1]", "A");
		}
		ui.click("(//i[@class='fa fa-calendar'])[2]");
		ui.click("//button[text()='Today']");
		ui.type("(//input[@name='hour'])[2]", timecalculator.getTime(17)[0]);
		ui.type("(//input[@name='minute'])[2]", timecalculator.getTime(17)[1]);
		if (timecalculator.checkTime() < 12) {
			ui.click("(//input[@name='mode'])[2]");
			ui.type("(//input[@name='mode'])[2]", "A");
		}
		ui.type("//textarea[@id='remarksArea']", "mock-do not bid ");
		ui.click("(//i[@class='fa fa-calendar'])[3]");
		ui.click("//button[text()='Today']");
		
		ui.type("//input[@placeholder='Enter Delivery Mode']","EX-WAREHOUSE");
		ui.click("//ul[@id='typeahead-dropdown']/li[text()='EX-WAREHOUSE']");
		//ui.type("//input[@placeholder='Location']", "CHENNAI");
	//	ui.click("//ul[@id='typeahed-dropdown']/li[text()='CHENNAI']");
		
	//	ui.type("//input[@placeholder='PRICE PATTERN']", "PRP");
	//	ui.click("//ul[@id='typeahead-dropdown']/li[text()='PRP']");
	//	ui.click("(//i[@class='fa fa-calendar'])[4]");
	//	ui.click("//button[text()='Today']");
	//	ui.type("//input[@placeholder='Enter BRANDS']","A1");
	//	ui.click("//ul[@id='typeahead-dropdown']/li[text()='A1']");
		//ui.type("//input[@placeholder='Manufacturing Plants']", "KURLA");
	//	ui.click("//ul[@id='typeahead-dropdown']/li[text()='KURLA']");

	//	ui.click("(//i[@class='fa fa-calendar'])[5]");
	//	ui.click("//button[text()='Today']");
	//	ui.type("//input[@placeholder='Enter PACK SIZE']", "1L");
	//	ui.click("//ul[@id='typeahead-dropdown']/li[text()='1L']");
		ui.click("//button[@value='Submit']");
		ui.click("//button[text()='Confirm ']");
		Thread.sleep(5000);
	}
	
}