package ascending_test;

import org.testng.annotations.Test;
import ascending_page.loadplanorder;
import ascending_page.loginpage;
import ascending_page.logout;
import ascending_page.marketwatchpage;
import ascending_page.marketwatchpage2;
import ascending_page.orderentry;
import ascending_page.statuscheck;
import ascending_page.tradeconfirmation;
import ascending_utils.base;
import org.testng.Assert;

public class ascending extends base {
	@Test(priority = 1)
	public void logintitletest() {
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle().contains("NeML | User Login"), true);
	}

	@Test(priority = 2)
	public void takescreenshottest() {
		driver.get(prop.getProperty("url"));

	}

	@Test(priority = 3)
	public void loginTestseller() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("seller_user"), prop.getProperty("seller_password"));
	}

	@Test(priority = 4)
	public void ascendingmarket() throws Exception {
		orderentry order = new orderentry(driver);
		order.placeOrder();
		new logout(driver).doLogout();

	}

	@Test(priority = 5)
	public void loginTestadmin() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("admin_user"), prop.getProperty("admin_password"));
	}

	@Test(priority = 6)
	public void plan_order() {
		loadplanorder order = new loadplanorder(driver);
		order.loadorder();
		new logout(driver).doLogout();
	}

	@Test(priority = 7)
	public void loginTestseller2() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("seller_user"), prop.getProperty("seller_password"));
	}

	@Test(priority = 8)
	public void statuscheckerseller() {
		statuscheck order = new statuscheck(driver);
		order.checkOrder();
		order.checkNotification();
		new logout(driver).doLogout();

	}

	@Test(priority = 9)
	public void statuschecker() {
		statuscheck order = new statuscheck(driver);
		String status = order.checkOrder();
		Assert.assertEquals(status, "OPEN-OPEN");
	}

	@Test(priority = 10)
	public void checkNotification() throws Exception {
		statuscheck order = new statuscheck(driver);
		String color = order.checkNotification();
		Assert.assertEquals(color, "color: green;");
		new logout(driver).doLogout();
	}

	@Test(priority = 11)
	public void margin() throws InterruptedException {
		statuscheck mc = new statuscheck(driver);
		mc.margincheck();
		new logout(driver).doLogout();
	}

	@Test(priority = 12)
	public void loginTestSeller() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("buyer_user"), prop.getProperty("buyer_password"));
	}

	@Test(priority = 13)
	public void doBookmark() throws InterruptedException {
		marketwatchpage mw = new marketwatchpage(driver);
		mw.doBookmark();
		new logout(driver).doLogout();
	}

	@Test(priority = 14)
	public void marginbuyer() throws InterruptedException {
		statuscheck mc = new statuscheck(driver);
		mc.margincheck();
		new logout(driver).doLogout();
	}

	@Test(priority = 15)
	public void loginTestSeller2() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("buyer_user2"), prop.getProperty("buyer_password2"));
	}

	@Test(priority = 16)
	public void doBookmark2() throws InterruptedException {
		marketwatchpage2 mw = new marketwatchpage2(driver);
		mw.doBookmark();
		new logout(driver).doLogout();

	}

	@Test(priority = 17)
	public void marginbuyer2() throws InterruptedException {
		statuscheck mc = new statuscheck(driver);
		mc.margincheck();
		new logout(driver).doLogout();
	}

	@Test(priority = 18)
	public void loginTestSeller3() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("buyer_user3"), prop.getProperty("buyer_password3"));
	}

	@Test(priority = 19)
	public void doBookmark3() throws InterruptedException {
		marketwatchpage2 mw = new marketwatchpage2(driver);
		mw.doBookmark();
		new logout(driver).doLogout();
	}

	@Test(priority = 20)
	public void marginbuyer3() throws InterruptedException {
		statuscheck mc = new statuscheck(driver);
		mc.margincheck();
		new logout(driver).doLogout();
	}

	@Test(priority = 21)
	public void loginTestseller3() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("seller_user"), prop.getProperty("seller_password"));
	}

	@Test(priority = 22)
	public void auctionwinnerlist() throws InterruptedException {
		tradeconfirmation TC = new tradeconfirmation(driver);
		TC.approveall();
	}
}