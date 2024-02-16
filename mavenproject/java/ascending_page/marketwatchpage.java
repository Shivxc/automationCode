package ascending_page;

import ascending_utils.uioperation;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class marketwatchpage {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public marketwatchpage(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

//	By e_ascendingmarket = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
//	By e_marketwatch = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");

	public void doBookmark() throws InterruptedException {
		ui = new uioperation(driver);
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[3]/a");
		System.out.println("waiting for bid session start");
		Thread.sleep(120000);
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div[1]/h6/button");
		ui.click("//strong[text()='Actions']");
		ui.click("//strong[text()='Auction Floor']");
		ui.type("//input[@title='Lot Size']", "1");
		ui.click("//ul[@id='typeahead-dropdown']/li[contains(text(),'1')]");
		ui.type("//input[@placeholder='Bid Qty']", "500");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/ul/div/div/div[2]/div[2]/div[2]/div[3]/input");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/div[3]/a[1]");
		Thread.sleep(6000);
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[1]/a/i");
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[2]/a");
		System.out.println("Bid is in open status ");
		Thread.sleep(6000);
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[1]/a/i");
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[7]/a");
		System.out.println("Margin block for the bid placed ");
		Thread.sleep(6000);
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[1]/a/i");
		ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[5]/a/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[5]/a");
		System.out.println("trade generated for the bid placed");
		Thread.sleep(3000);

	}

}
