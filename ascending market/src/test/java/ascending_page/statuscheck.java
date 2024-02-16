package ascending_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import ascending_utils.uioperation;

public class statuscheck {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;
	
	public statuscheck(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	public String checkOrder() {
		String txt=null;
		
	
		for (int i = 1; i <= 4; i++) {
			By e_ascendingMarket = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/a/span");
			ui.click(e_ascendingMarket);
			ui.click(By.linkText("Order Book"));
			 txt = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[2]/div[2]")).getText();
			if (txt.equals("OPEN-OPEN")) {
				break;
			} else {
				try {
					System.out.println("Waiting for Auction to start");
					Thread.sleep(120000);
				} catch (InterruptedException e) {

				}
				driver.get(driver.getCurrentUrl());
			}
		}
		return txt;
	}
	By e_Market = By.xpath("//input[@title='Market Code']");
	
    public void margincheck() throws InterruptedException {
	   ui.click("/html/body/div[2]/div[2]/form/div/div/ul/li[2]/ul/li[7]/a");
	   ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div[4]/a[2]");
//	   ui.type("//input[@title=' Contract Code']", "MCKASC");
	//	ui.click("//ul[@id='typeahead-dropdown']/li[contains(text(),'MCKASC - ASCENDING MARKET CONTRACT')]");   
	//	ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div[4]/a[2]");
		Thread.sleep(9000);
		ui.click("/html/body/div[2]/div[1]/div[1]/div/ul/ul/li[2]/a/i");
		Thread.sleep(3000);
		
    }
	
	
	public String checkNotification() {
		ui.click("//i[@class='fa fa-bell-o']");
		String style=driver.findElement(By.xpath("//div[@id='messageInfo']/ul[@class='ng-scope']/div[1]/li/span")).getAttribute("style");
	return style;
	}
}
