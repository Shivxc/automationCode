package ascending_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ascending_utils.uioperation;

public class logout {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public logout(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	By e_user = By.xpath("(//span[@class='ng-binding'])[1]");
	By e_logout = By.xpath("//a[text()=' Log Out ']");

	public void doLogout() {
		ui.click(e_user);
		ui.click(e_logout);
	}
}
