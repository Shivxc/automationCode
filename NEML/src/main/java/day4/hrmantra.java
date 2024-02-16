package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hrmantra {
	WebDriver driver;

	hrmantra(WebDriver driver) {

		this.driver = driver;
	}

	By e_un = By.id("txtUserName");
	By e_pwd = By.id("txtPass");
	By e_login = By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/form/div[6]/input[1]");
	By e_logout = By.xpath("/html/body/form/div[3]/header/div/section/article[1]/div/div[1]/div/nav/a[4]");
	// By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");

	public void dologin1(String un, String pwd) {
		driver.findElement(e_un).sendKeys(un);
		driver.findElement(e_pwd).sendKeys(pwd);
		driver.findElement(e_login).click();
		
		
		WebElement dropdown = driver.findElement(By.xpath("/html/body/form/div[3]/header/div/section/article[1]/div/div[1]"));
		Actions ac=new Actions(driver);                    //Actions use for controlling mouse/keyboard
		ac.moveToElement(dropdown).perform();
		
		ac.click(driver.findElement(By.xpath("/html/body/form/div[3]/header/div/section/article[1]/div/div[1]"))).perform();
		

	}

	public void Logout() {
		// TODO Auto-generated method stub
		driver.findElement(e_logout).click();
	}
}