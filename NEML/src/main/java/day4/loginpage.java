package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpage {
	WebDriver driver;

	public loginpage(WebDriver driver) {

		this.driver = driver;
	}

	By e_un = By.name("username");
	By e_pwd = By.name("password");
	By e_login = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By e_forget = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");

	public void dologin(String un, String pwd) {
			driver.findElement(e_un).sendKeys(un);
			driver.findElement(e_pwd).sendKeys(pwd);
			driver.findElement(e_login).click();

		}

}
