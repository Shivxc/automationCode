package continous_test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import continous_page.loginpage;
import continous_utils.base;

public class continous extends base {
	@Test(priority = 1)
	public void loginpage() {
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle().contains("NeML | User Login"), true);
	}
	
	@Test(priority = 2 )
	public void loginTestseller() {
		driver.get(prop.getProperty("url"));
		loginpage lp = new loginpage(driver);
		lp.doLogin(prop.getProperty("seller_user"), prop.getProperty("seller_password"));
	}
	@Test(priority = 3 )
	public <Screenshot> void Screenshot() {
		driver.get(prop.getProperty("url"));
		continous_page.Screenshot SC = new continous_page.Screenshot();
		try {
			SC.takescreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}
	
}