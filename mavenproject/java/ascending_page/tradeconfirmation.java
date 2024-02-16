package ascending_page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ascending_utils.uioperation;

public class tradeconfirmation {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public tradeconfirmation(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	By e_ascendingMarket = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
	By e_tradebook = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[9]/a");
	By e_Market = By.xpath("//input[@title='Market Code']");
	By e_comm = By.xpath("//*[@title='Commodity Code']");
	By e_search = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/button[1]");
	
	public void approveall() throws InterruptedException {
		ui = new uioperation(driver);
		ui.click(e_ascendingMarket);
		ui.click(e_tradebook);
		ui.type(e_Market, "ASC");
		ui.click("//li[contains(text(),'ASC - ASCENDING MARKET')]");
		ui.type(e_comm, "MCKASC");
		ui.click("//li[contains(text(),'MCKASC')]");
		ui.click(e_search);
		Thread.sleep(1000);
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/button[3]");
}
}