package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIopnd {
	WebDriver Driver;
	WebDriverWait wt;
	JavascriptExecutor js;

	public UIopnd(WebDriver Driver) {
		this.Driver = Driver;
		wt = new WebDriverWait(Driver, Duration.ofSeconds(20));
		js = (JavascriptExecutor) Driver;

	}

	public void click(String locator) {
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

		try {
			Driver.findElement(By.xpath(locator)).click();
		} catch (ElementClickInterceptedException ele) {
			js.executeScript("arguments[0].click();", Driver.findElement(By.xpath(locator)));
		} catch (StaleElementReferenceException stele) {

			for (int i = 1; i <= 3; i++) {
				try {
					Thread.sleep(1000);
					Driver.findElement(By.xpath(locator)).click();
				} catch (StaleElementReferenceException ele) {
					System.out.println(i + " try failed");
				} catch (ElementClickInterceptedException ele) {
					js.executeScript("arguments[0].click();", Driver.findElement(By.xpath(locator)));
				} catch (Exception E) {
					System.out.println("general Exception");
					System.out.println(E.getMessage());
				}
			}
		}
	}
	
	public void type(String locator,String data) {
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

		try {
			Driver.findElement(By.xpath(locator)).sendKeys(data);
		} catch (ElementClickInterceptedException ele) {
			js.executeScript("arguments[0].setAttribute('value', '"+data+"')", Driver.findElement(By.name(locator)));
		} catch (StaleElementReferenceException stele) {

			for (int i = 1; i <= 3; i++) {
				try {
					Thread.sleep(1000);
					Driver.findElement(By.xpath(locator)).sendKeys(data);
				} catch (StaleElementReferenceException ele) {
					System.out.println(i + " try failed");
				} catch (ElementClickInterceptedException ele) {
					js.executeScript("arguments[0].setAttribute('value', '"+data+"')", Driver.findElement(By.name(locator)));
				} catch (Exception E) {
					System.out.println("general Exception");
					System.out.println(E.getMessage());
				}
			}
		}
	}
}
