package ascending_page;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ascending_utils.uioperation;

public class loadplanorder {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public loadplanorder(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	By e_ascendingMarket = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[3]/a/span");
	By e_futurewatch = By.xpath("/html/body/div[2]/div[2]/form/div/div/ul/li[3]/ul/li[11]/a");
	By e_Market = By.xpath("//input[@title='Market Code']");
	By e_comm = By.xpath("//*[@title='Commodity Code']");
	By e_status = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[8]/div[2]/div[3]/div/div/input");
		
	public void loadorder()  {
		ui = new uioperation(driver);
		ui.click(e_ascendingMarket);
		ui.click(e_futurewatch);
		ui.type(e_Market, "ASC");
		ui.click("//li[contains(text(),'ASC - ASCENDING MARKET')]");
		ui.type(e_comm, "MCKASC");
		ui.click("//li[contains(text(),'MCKASC')]");
		ui.type("//input[@title=' Contract Code']", "MCKASC");
		ui.click("//ul[@id='typeahead-dropdown']/li[contains(text(),'MCKASC - ASCENDING MARKET CONTRACT')]");
		ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div[4]/a[1]");
        ui.type(e_status, "n");
        ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/div");
        ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/button[1]/strong");
        ui.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/button[2]/strong");
        ui.click("//button[@id='planOrderconfirm']");
		
	}
}