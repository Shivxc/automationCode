package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class employeelist {
	WebDriver driver;                              //global driver

	public employeelist(WebDriver driver) {
                                                   //passing local driver to global driver 
	this.driver = driver;         //this keyword represent class variable & this keyword should be used if you want to keep class variable & local variable same 
	}

	By e_profile = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
	By e_log = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");

public void Logout() {
	driver.findElement(e_profile).click();
	driver.findElement(e_log).click();
}
	
}