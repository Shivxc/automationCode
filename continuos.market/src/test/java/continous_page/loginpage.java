package continous_page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import continous_utils.uioperation;

public class loginpage {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public loginpage(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	By e_user = By.xpath("//*[@name='userId-entry']");
	By e_pwd = By.xpath("//*[@name='password-entry']");
	By e_login = By.cssSelector("button[value='Login']");

	public void doLogin(String user, String pwd) {
		ui.type(e_user, user);
		ui.type(e_pwd, pwd);

		wt.until(ExpectedConditions.elementToBeClickable(e_login)).click();
		try {
			wt.until(ExpectedConditions.alertIsPresent()).accept();
		} catch (Exception E) {
			System.out.println("Alert Not Present");
		}
	}
}
